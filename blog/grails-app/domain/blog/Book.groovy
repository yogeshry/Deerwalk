import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
@Secured(['permitAll'])
@Resource(uri='/books')
class Book {

    String title

    static constraints = {
        title blank:false
    }
}