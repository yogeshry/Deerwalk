package blog

import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])

class EmailController {

    def index() { }
    def send() {
        def multipartFile = request.getFile('attachment')
        def list = params.address.split(',')
        def name_list = params.name.split(',')
        int i = 0
        for (String address: list) {
            sendMail {
                multipart true
                to address
                subject params.subject
                def map = [name: name_list[i] ]
                html(view: "/email/_myTemplate", model: map)
                if (multipartFile && !multipartFile.empty) {
                    File tmpFile = new File(System.getProperty("java.io.tmpdir") + System.getProperty("file.separator") + multipartFile.getOriginalFilename())
                    multipartFile.transferTo(tmpFile)
                    attach tmpFile
                }
            }
            i = i + 1
        }

        flash.message = "Message sent at "+new Date()
        redirect action:"index"
    }
}
