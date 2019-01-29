<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'article.label', default: 'Article')}" />
    <title><g:message code="default.create.label" args="[entityName]" /></title>
    <asset:stylesheet src='component-wise/loginForm.css'/>
</head>

<body>
    %{--set placeholder for the input form either name of field or fieldError--}%
    <g:set var="errorTitle"><g:fieldError field="title" bean="${article}"/></g:set>
    <g:set var="errortextBody"><g:fieldError field="textBody" bean="${article}"/></g:set>
    <g:set var="errorImage"><g:fieldError field="image" bean="${article}"/></g:set>
    <g:set var="errorimageCaption"><g:fieldError field="imageCaption" bean="${article}"/></g:set>
    <g:if test="${errorUsername == ""}"><g:set var="errorUsername">username</g:set></g:if>
    <g:if test="${errortextBody == ""}"><g:set var="errortextBody">textBody</g:set></g:if>
    <g:if test="${errorImage == ""}"><g:set var="errorImage">image</g:set></g:if>
    <g:if test="${errorimageCaption == ""}"><g:set var="errorimageCaption">imageCaption</g:set></g:if>

    <br style = "line-height:5"><br>

    %{--form to post the article--}%
    <form action="save" method="POST" enctype="multipart/form-data">
        <div class="container">
            <div class="d-flex justify-content-center h-100">
                <div class="card" style="height: 470px">
                    <div class="card-header">
                        <h3>Create Post</h3>
                    </div>
                    <div class="card-body">
                        <form>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" placeholder="${errorTitle}" class='formLogin form-control' name="title" id="title">
                                %{--placeholder is the field used in domain--}%
                            </div >
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" placeholder="${errortextBody}" class='formLogin form-control' name="textBody" id="textBody">
                            </div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="imageCaption"  placeholder="${errorimageCaption}" class="formLogin form-control" name="imageCaption" id="imageCaption">
                            </div>
                            <h7 style="color: #ffe8a1">Select Picture:</h7>
                            <input type="file" name="image"/>
                            <div class="form-group">
                                <input  type="submit" value="Post" class="btn float-right login_btn">
                            </div>
                        </form>
                        <br/><br/>
                        <div>
                            <h6 style="color: #ffe8a1">Or, save uploading CSV</h6>
                            %{--uploadCSV and save all in database--}%
                            <g:uploadForm action="bulkSave">
                                <input type="file" name="filecsv"/>
                                <input  type="submit" class="btn float-right login_btn">
                            </g:uploadForm>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>

</body>
</html>
