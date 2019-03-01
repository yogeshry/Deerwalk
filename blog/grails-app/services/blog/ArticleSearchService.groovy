package blog

import grails.gorm.transactions.Transactional
import grails.plugins.elasticsearch.ElasticSearchService


@Transactional
class ArticleSearchService {

    ElasticSearchService elasticSearchService

    Map search(String query) {
        elasticSearchService.search(query, [indices: Article, types: Article, score: true]) as Map
    }
}
