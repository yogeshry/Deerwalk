<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
        <asset:stylesheet src='component-wise/loginForm.css'/>

    </head>
    <body>


    <g:set var="errorUsername"><g:fieldError field="username" bean="${user}"/></g:set>
    <g:set var="errorFirstname"><g:fieldError field="firstname" bean="${user}"/></g:set>
    <g:set var="errorLastname"><g:fieldError field="lastname" bean="${user}"/></g:set>
    <g:set var="errorEmail"><g:fieldError field="email" bean="${user}"/></g:set>
    <g:set var="errorPassword"><g:fieldError field="password" bean="${user}"/></g:set>
    <g:if test="${errorUsername == ""}"><g:set var="errorUsername">username</g:set></g:if>
    <g:if test="${errorFirstname == ""}"><g:set var="errorFirstname">firstname</g:set></g:if>
    <g:if test="${errorLastname == ""}"><g:set var="errorLastname">lastname</g:set></g:if>
    <g:if test="${errorEmail == ""}"><g:set var="errorEmail">email</g:set></g:if>
    <g:if test="${errorPassword == ""}"><g:set var="errorPassword">password</g:set></g:if>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <form action="/user/save" method="POST">
        <div class="container">
            <div class="d-flex justify-content-center h-100">

                    <div class="card">

                        <div class="card-header">
                            <h3>Register</h3>
                            <div class="d-flex justify-content-end social_icon">
                                <span><i class="fab fa-facebook-square"></i></span>
                                <span><i class="fab fa-google-plus-square"></i></span>
                                <span><i class="fab fa-twitter-square"></i></span>
                            </div>
                        </div>

                        <div class="card-body">
                            <form>
                                <div class="input-group form-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i class="fas fa-user"></i></span>
                                    </div>
                                    <input type="text" placeholder="${errorUsername}" class='formLogin form-control' name="username" id="username">
                                    %{--placeholder is the field used in domain--}%
                                </div >
                                <div class="input-group form-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i class="fas fa-user"></i></span>
                                    </div>
                                    <input type="text" placeholder="${errorFirstname}" class='formLogin form-control' name="firstname" id="firstname">
                                </div>
                                <div class="input-group form-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i class="fas fa-user"></i></span>
                                    </div>
                                    <input type="text" placeholder="${errorLastname}" class='formLogin form-control' name="lastname" id="lastname">
                                </div>

                                <div class="input-group form-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i class="fas fa-user"></i></span>
                                    </div>
                                    <input type="text" placeholder="${errorEmail}" class='formLogin form-control' name="email" id="email">
                                </div>

                                <div class="input-group form-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i class="fas fa-key"></i></span>
                                    </div>
                                    <input type="password"  placeholder="${errorPassword}" class="formLogin form-control" name="password" id="password">
                                </div>


                                <div class="form-group">
                                    <input  type="submit" value="Sign up" class="btn float-right login_btn">
                                </div>
                            </form>
                        </div>

                        <div class="card-footer">
                            <div class="d-flex justify-content-center links">
                                Have an account?<a href="/login/auth">Sign In</a>
                            </div>

                        </div>

                    </div>
            </div>
        </div>
    </form>

    </body>



</html>
