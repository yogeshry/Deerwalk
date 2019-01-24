package blog

import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class MiscController {

    def index() {
        render 'sdfdsf'
    }
    def about() { }
    def contact() { }

}
