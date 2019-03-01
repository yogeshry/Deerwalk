package blog

import grails.rest.RestfulController
import grails.validation.ValidationException

import java.awt.print.Book

import static org.springframework.http.HttpStatus.*

class BookController extends RestfulController {
    static responseFormats = ['json', 'xml']
    BookController() {
        super(Book)
    }
}