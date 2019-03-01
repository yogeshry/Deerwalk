package blog

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.config.Config
import grails.core.support.GrailsConfigurationAware

@Secured(['ROLE_ADMIN'])
class ArticleController implements GrailsConfigurationAware {

    ArticleService articleService
    FileUploadService fileUploadService

    String csvMimeType                                                              //the type of response for csv file
    String encoding                                                                 //the encoding type of csv response
    List<String> lines                                                              //the csv lines to be downloaded

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)

        respond articleService.list(params), model: [articleCount: articleService.count()]
    }

    @Secured(['permitAll'])
    def show(Long id) {
        respond articleService.get(id)
    }

    def create() {
    }

    def save() {

        def downloadedFile = request.getFile('image')                   //fetching uploaded file using request
        String baseImageName = UUID.randomUUID().toString()             //universally unique filename to save image
        String fileUploaded = fileUploadService.uploadFile(downloadedFile, "${baseImageName}.jpg", "D:\\CurrentLooks\\Projects\\Deerwalk\\blog\\grails-app\\assets\\images\\articleImages")
        //downloadedFile saved using fileUploadService

        //if image is successfully saved
        if (fileUploaded) {
            def user = getAuthenticatedUser()                            //get the instance of user that has logged in
            def article = new Article(title: params.title, textBody: params.textBody,
                    imagePath: 'articleImages/' + baseImageName + '.jpg', imageCaption: params.imageCaption,
                    user: user, updatedAt: new Date(), createdAt: new Date(),
                    deletedAt: new Date(), deleted: false)
            if (article == null) {
                notFound()
                return
            }

            try {
                articleService.save(article)
            } catch (ValidationException e) {
                respond article.errors, view: 'create'
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
            respond article.errors, view: 'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'article.label', default: 'Article'), article.id])
                redirect article
            }
            '*' { respond article, [status: OK] }
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
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'article.label', default: 'Article'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }

    def bulkSave() {
        def notFirstLine = 0               //ignore firstline in CSV file
        request.getFile('filecsv')
                .inputStream              // regex to parse CSV file
                .splitEachLine(',(?=(?:[^\\"]*\\"[^\\"]*\\")*[^\\"]*$)') { fields ->
            if (notFirstLine++ != 0) {
                def article = new Article(title: fields[0].trim().replaceAll('^\"|\"$', ''),//regex to replace end and start "
                        textBody: fields[1].trim().replaceAll('^\"|\"$', ''),
                        imageCaption: fields[2].trim().replaceAll('^\"|\"$', ''),
                        imagePath: fields[3].trim(),
                        deletedAt: new Date().parse('mm:dd:yyyy 00:00:00', "00:00:0000 00:00:00"),
                        createdAt: new Date(),
                        updatedAt: new Date(),
                        user: getAuthenticatedUser())

                if (article.hasErrors() || articleService.save(article) == null) {
                    render("Could not import domainObject  ${article.errors}")
                }

                render("Importing domainObject  ${article.toString()}")
            }

        }

    }

    //prepareCSV for download
    def prepareCSV() {
        //lines stores all the data separated by comma||CSV
        lines = ["title,textBody,imageCaption,imagePath,createdAt,deletedAt,updatedAt,Author"] +
                Article.findAll().collect {
                    ['"' + it.title + '"', '"' + it.textBody + '"', '"' + it.imageCaption + '"', '"' + it.imagePath + '"', it.createdAt, it.deletedAt, it.updatedAt, it.user.firstname].join(',')
                } as List<String>
        for (int a = 0; a < 30000; a++) {
            for (int b = 0; b < 1000000; b++) {
                //delay
            }
        }
    }

    //outstream lines as book.csv
    def download() {
        final String filename = 'book.csv'
        def outs = response.outputStream
        response.status = OK.value()
        response.contentType = "${csvMimeType};charset=${encoding}";
        response.setHeader "Content-disposition", "attachment; filename=${filename}"
        lines.each { String line ->
            outs << "${line}\n"
        }
        outs.flush()
        outs.close()
    }

    def search(String q) {
        if (!q) {
            render status: NOT_FOUND
            return
        }
        respond ArticleSearchService.search(q)
    }

    def saveLarge() {

        final String filename = 'book.csv'
        def outs = response.outputStream
        response.status = OK.value()
        response.contentType = "${csvMimeType};charset=${encoding}";
        response.setHeader "Content-disposition", "attachment; filename=${filename}"
        new File("D:\\CurrentLooks\\Projects\\a.csv").eachLine {
            String line -> outs << "${line}\n"
        }
        outs.flush()
        outs.close()

    }

    @Override
    void setConfiguration(Config co) {
        csvMimeType = co.getProperty('grails.mime.types.csv', String, 'text/csv')
        encoding = co.getProperty('grails.converters.encoding', String, 'UTF-8')


    }


}