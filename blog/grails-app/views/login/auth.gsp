<html>
<head>
	<meta name="layout" content="main"/>
	<title>Login</title>
	<asset:stylesheet src='component-wise/loginForm.css'/>
</head>


<html>
<body>

<br/>
<br/>
<br/>
<br/>
<br/>

%{--starts template--}%

<div class="container">
	<div class="d-flex justify-content-center h-100">

		<s2ui:form type='login' focus='username'>

			<div class="card">

				<div class="card-header">
					<h3>Sign In</h3>
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
							<input type="text" placeholder="username" class='formLogin form-control' name="${securityConfig.apf.usernameParameter}" id="username">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password"  placeholder="password" class="formLogin form-control" name="${securityConfig.apf.passwordParameter}" id="password">
						</div>
						<div class="row align-items-center remember">
							<input type="checkbox"  placeholder="remember" class="checkbox" name="${securityConfig.rememberMe.parameter}" id="remember_me" checked="checked"/>
							Remember Me
						</div>
						<div class="form-group">
							<input  type="submit" value="Login" class="btn float-right login_btn">
						</div>
					</form>
				</div>

				<div class="card-footer">
					<div class="d-flex justify-content-center links">
						Don't have an account?<a href="/user/create">Sign Up</a>
					</div>
					<div class="d-flex justify-content-center">
						<g:link controller='register' action='forgotPassword'><g:message code='spring.security.ui.login.forgotPassword'/></g:link>
					</div>
				</div>

			</div>
		</s2ui:form>
	</div>
</div>

%{--ends template--}%

</body>
</html>