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
            <div class="col-9">
                <p><i>${this.article.user.firstname}</i></p>
                <p><i>${this.article.createdAt.format("yyyy-MM-dd")}</i></p>
                <h8 class="display-4">${this.article.title}</h8>
                <hr class="my-4">
                <asset:image src="${this.article.imagePath}" style="max-height:100%; max-width:100%"/>
                <p><i>${this.article.imageCaption}</i></p>
                <hr class="my-4">
                <p  style="line-height:1.8;font-size:16px">${this.article.textBody}</p>
            </div>
        </div>
        <br/>
        %{--only authorized user can edit and delete--}%
        <sec:ifLoggedIn>
        <g:form resource="${this.article}" method="DELETE">
            <fieldset class="buttons">
                <g:link class="edit" action="edit" resource="${this.article}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                <input class="delete" type="submit" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
            </fieldset>
        </g:form>
        </sec:ifLoggedIn>
    </div>
</body>
</html>
