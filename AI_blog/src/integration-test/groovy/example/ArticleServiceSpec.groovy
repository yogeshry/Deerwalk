package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ArticleServiceSpec extends Specification {

    ProductService productService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Article(...).save(flush: true, failOnError: true)
        //new Article(...).save(flush: true, failOnError: true)
        //Article product = new Article(...).save(flush: true, failOnError: true)
        //new Article(...).save(flush: true, failOnError: true)
        //new Article(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //product.id
    }

    void "test get"() {
        setupData()

        expect:
        productService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Article> productList = productService.list(max: 2, offset: 2)

        then:
        productList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        productService.count() == 5
    }

    void "test delete"() {
        Long productId = setupData()

        expect:
        productService.count() == 5

        when:
        productService.delete(productId)
        sessionFactory.currentSession.flush()

        then:
        productService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Article product = new Article()
        productService.save(product)

        then:
        product.id != null
    }
}
