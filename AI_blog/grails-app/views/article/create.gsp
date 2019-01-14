<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'article.label', default: 'Article')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>




<br/>
    <br/>
    <br/>
    <br/>
    <g:form controller="user" action="save">
        <label>Name: </label>
        <g:textField name="name"/><br/>

        <label>Email: </label>
        <g:textField name="email"/><br/>
        <g:actionSubmit value="Save"/>
    </g:form>

    </body>
</html>
