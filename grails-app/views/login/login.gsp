<
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<r:require modules="bootstrap" />
<meta name="layout" content="main" />

<title>Admin Login</title>

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
		<br>
		<br>
			<g:if test="${session.UserLoggedin}">
				<legend>
					Login as :${session.UserLoggedin}
					}
				</legend>
				<g:link controller="Login" action="loggedinhomepage"
					class="btn btn-lg btn-success"> my Home Page 
											</g:link>
				<br>
				<br>
				<g:link controller="Login" action="logout"
					class="btn btn-lg btn-danger"> Log Out </g:link>
			</g:if>
			<g:else>


				<g:form action="admin_login_function" method="post" class="form-signin">
					<div class="input">
						<br />
						<legend>
							<h2>Admin Sign in</h2>
						</legend>
						<g:if test="${flash.message}">
								<div class="alert alert-danger">
									${flash.message}
								</div>
							
						</g:if>
						<label for='username'>Username:</label> <input id="username"
							type='text' name='username' class="input-block-level"
							placeholder="Username" }' /> <br /> <label for='password'>Password:</label>
						<input id="password" class="input-block-level" type='password'
							name='password' placeholder="*****" />

					</div>


					<div class="buttons">
						<span class="formButton"> <input type="submit"
							value="Login" class="btn btn-large btn-info"></input> <%--<g:link
								controller="login" action="SignupAsReceptionist"
								class="btn btn-large btn-success">Sign up </g:link>
						--%></span>
					</div>
				</g:form>
			</g:else>
		</div>
	</div>

</body>
</html>
