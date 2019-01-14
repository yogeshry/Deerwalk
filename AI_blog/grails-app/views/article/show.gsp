<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'article.label', default: 'Article')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
    <div class="jumbotron">
    <br/>
        <div class="flex-row">
            <div class="col-9"> <p><i>${this.article.user.name}</i></p>
                <p><i>${this.article.timestamp.format("yyyy-MM-dd")}</i></p>
                <h8 class="display-4">${this.article.title}</h8>
                <hr class="my-4">

                <asset:image src="${this.article.imagePath}" style="max-height:100%; max-width:100%" />
                <p><i>${this.article.imageCaption}</i></p>
                <hr class="my-4">
                <p class="lead">${this.article.textBody}</p></div>
            
        </div>
        <br/>


    </div>

    </body>
</html>
