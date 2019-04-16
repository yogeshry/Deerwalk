package blog

import grails.plugin.springsecurity.annotation.Secured
import grails.plugins.rest.client.RestBuilder

import static groovyx.net.http.ContentType.XML

@Secured(['permitAll'])
class MiscController {

    def index() { }
    def request() {
        def doc = new XmlParser().parse("https://www.goodreads.com/author/show/"+params.id+"?format=xml&key="+params.key)
        def writer = new StringWriter()
        def nodePrinter = new XmlNodePrinter(new PrintWriter(writer))
        nodePrinter.preserveWhitespace = true
        nodePrinter.print doc
        render view: '/misc/myxml', model: [xmlstring: writer.toString()]
    }
    def about() { }

    def contact() { }

}

