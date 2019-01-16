<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <title><g:message code="default.create.label" args="[entityName]" /></title>
    <asset:stylesheet src="own.css"/>
</head>
<body>
<br/>
<br/>
<br/>
<br/>


<!------ Include the above in your HEAD tag ---------->

<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div class="card card-signup my-5">
                <div class="card-body">
                    <h5 class="card-title text-center">Sign Up</h5>
                    <g:form  controller="user" action="save">
                        <div class="form-label-group">
                            <input type="text" id="inputusername" class="form-control" placeholder="username" required autofocus>
                            <label for="inputusername">Username</label>
                        </div>
                        <div class="form-label-group">
                            <input type="text" id="inputname" class="form-control" placeholder="name" required autofocus>
                            <label for="inputname">Full Name</label>
                        </div>
                        <div class="form-label-group">
                            <input type="email" id="inputEmail" class="form-control" placeholder="email" required autofocus>
                            <label for="inputEmail">Email address</label>
                        </div>
                        <div class="form-label-group">
                            <input type="password" id="inputPassword" class="form-control" placeholder="password" required>
                            <label for="inputPassword">Password</label>
                        </div>


                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" value="save">Sign Up</button>
                        <hr class="my-4">
                        <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> Sign up with Google</button>
                        <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> Sign up with Facebook</button>
                    </g:form>
                </div>
            </div>
        </div>
    </div>
</div>

<br/>
<br/>
<br/>
<br/>
<g:form  controller="user" action="save">
    <label>Name: </label>
    <g:textField name="name"/><br/>

    <label>Email: </label>
    <g:textField name="email"/><br/>
    <g:actionSubmit value="save"/>
</g:form>

</body>
</html>

