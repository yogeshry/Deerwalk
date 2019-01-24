package blog

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.SpringSecurityService

@Secured(['ROLE_ADMIN'])
class ArticleController {

    ArticleService articleService
    FileUploadService fileUploadService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond articleService.list(params), model:[articleCount: articleService.count()]
    }
    @Secured(['permitAll'])
    def show(Long id) {
        respond articleService.get(id)
    }

    def create() {
    }
    def save() {
        String baseImageName = UUID.randomUUID().toString();
        // Saving image in a folder assets/channelImage/, in the web-app, with the name: baseImageName
        def downloadedFile = request.getFile('image')
        String fileUploaded = fileUploadService.uploadFile(downloadedFile, "${baseImageName}.jpg", "/assets/articleImages/" )
        if( fileUploaded ){
            def user = getAuthenticatedUser()
            def article = new Article(title:  params.title, textBody: params.textBody,
                    imagePath: 'articleImages/'+ baseImageName+'.jpg', imageCaption: params.imageCaption,
                    user: user,updatedAt: new Date(),createdAt: new Date(),
                    deletedAt: new Date(),deleted: false)
            if (article == null) {
                notFound()
                return
            }

            try {
                articleService.save(article)
            } catch (ValidationException e) {
                respond article.errors, view:'create'
                return
            }
            request.withFormat {
                form multipartForm {
                    flash.message = message(code: 'default.created.message', args: [message(code: 'article.label', default: 'Article'), article.id])
                    redirect article
                }
                '*' { respond article, [status: CREATED] }
            }
        }

    }

    def edit(Long id) {
        respond articleService.get(id)
    }

    def update(Article article) {
        if (article == null) {
            notFound()
            return
        }

        try {
            article.updatedAt = new Date()
            articleService.save(article)
        } catch (ValidationException e) {
            respond article.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'article.label', default: 'Article'), article.id])
                redirect article
            }
            '*'{ respond article, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        articleService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'article.label', default: 'Article'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'article.label', default: 'Article'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

    def bulkSave() {

        request.getFile( 'filecsv' )
                .inputStream
                .splitEachLine(',') { fields ->
            def article = new Article( title: fields[0].trim(),
                    textBody: fields[1].trim(),
                    deletedAt: new Date().parse("yyyy-M-d H:m:s", fields[1].trim()),
                    createdAt: new Date().parse("yyyy-M-d H:m:s", fields[2].trim()),
                    updatedAt: new Date().parse("yyyy-M-d H:m:s", fields[3].trim()),
                    articles: Article.get(1),
                    user: User.get(1))

            if (article.hasErrors() || article.save(flush: true) == null) {
                render ("Could not import domainObject  ${article.errors}")
            }

            render ("Importing domainObject  ${article.toString()}")
        }
    }


}
