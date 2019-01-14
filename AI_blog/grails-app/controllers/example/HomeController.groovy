package example

class HomeController {

    def index() {

            def map = [mainArticle: Article.list(max: 3, offset: 0), articles1: Article.list(max: 15, offset: 0)]
            render(view: "index", model: map)

    }
}
