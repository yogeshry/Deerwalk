package blog

import grails.plugin.springsecurity.annotation.Secured
import grails.plugins.rest.client.RestBuilder
import com.icegreen.greenmail.util.*

import static groovyx.net.http.ContentType.XML

@Secured(['permitAll'])
class MiscController {

    def index() { }
    def about() {
        def mailService
        def greenMail


        Map mail = [message:'hello world', from:'from@piragua.com', to:'ygsh.spcry5@gmail.com', subject:'subject']

        mailService.sendMail {
            to mail.to
            from mail.from
            subject mail.subject
            body mail.message
        }

        assertEquals(1, greenMail.getReceivedMessages().length)

        def message = greenMail.getReceivedMessages()[0]

        assertEquals(mail.message, GreenMailUtil.getBody(message))
        assertEquals(mail.from, GreenMailUtil.getAddressList(message.from))
        assertEquals(mail.subject, message.subject)
    }


    def contact() {
        RestBuilder rest = new RestBuilder()
        def resp = rest.get("https://www.goodreads.com/author/list/18541?format=xml&key=X30DMRw9UGAmwFGHLPebKg")
        print(resp.xml)

        }

}

