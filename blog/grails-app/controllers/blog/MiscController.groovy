package blog

import grails.plugin.springsecurity.annotation.Secured
import grails.plugins.rest.client.RestBuilder

import static groovyx.net.http.ContentType.XML

@Secured(['permitAll'])
class MiscController {

    def index() { }
    class Book {

        String name
        String isbn

    }
    def request() {
        def doc = new XmlParser().parse("https://www.goodreads.com/author/show/"+params.id+"?format=xml&key="+params.key)
//        def writer = new StringWriter()
//        def nodePrinter = new XmlNodePrinter(new PrintWriter(writer))
//        nodePrinter.preserveWhitespace = true
//        nodePrinter.print doc

        def books = []

        doc.author.books.book.each {
            bk ->
                def book = new Book()

                book.name = "${bk.title.text()}"
                book.isbn = "${bk.ratings_count.text()}"
                books<< book
        }



        def map = [id: "${doc.author.id.text()}", name:"${doc.author.name.text()}", link:"${doc.author.link.text()}", books:books]
        render(view: "/misc/myxml", model: map)
//        render view: '/misc/myxml', model: [xmlstring: writer.toString()]
    }
    def about() { }

    def contact() { }

}

