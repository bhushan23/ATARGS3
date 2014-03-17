<!DOCTYPE html>
<html>
<head>
<r:require modules="bootstrap" />
<meta name="layout" content="main" />
<title>Welcome to SAN Center</title>

<title>Login</title>

<style type="text/css">
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	max-width: 300px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
</head>
<body>

	<div class="container">
		<div class="hero-unit">
			<g:form class="loginlink">
				<g:if test="${session.UserLoggedin}">
					<legend> Login as :${session.UserLoggedin} } </legend>
					 <g:link controller="Login" action="loggedinhomepage" class="btn btn-lg btn-success"> my Home Page 
											</g:link>
											<br>
											<br>
											<g:link controller="Login" action="logout" class="btn btn-lg btn-danger"> Log Out </g:link>  
				</g:if>
				<g:else>
					<g:link controller="Login" action="login" class="btn btn-large btn-danger">
						<b><i>Login as Admin</b>
						</i>
					</g:link>
					<g:link controller="Login" action="loginAsReceptionist" class="btn btn-large btn-info">
						<b><i>Login as Receptionist</b>
						</i>
					</g:link>
					<g:link controller="Login" action="loginAsDoctor" class="btn btn-large btn-success">
						<b><i>Login as Doctor</b>
						</i>
					</g:link>
				</g:else>
			</g:form>

		</div>
	</div>
</body>
<footer>
	<p>This is in developement phase</p>
</footer>
</html>
