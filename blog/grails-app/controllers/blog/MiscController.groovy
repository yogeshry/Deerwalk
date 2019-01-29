package blog

import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class MiscController {

    def index() { }
    def about() { }
    def contact() { }

}
