package example

class HomeController {

    def index() {

            def map = [mainArticle: Article.list(), articles1: Article.list(),articles2: Article.list()]
            render(view: "index", model: map)

    }
}
