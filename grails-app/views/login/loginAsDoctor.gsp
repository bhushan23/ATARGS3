<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<r:require modules="bootstrap" />
<meta name="layout" content="main" />


<title>Doctor Login</title>

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
		<!-- 		<div class="hero-unit">
	-->
		<br /> <br />

		<g:if test="${session.UserLoggedin}">
			<legend>
				Logged in as :${session.UserLoggedin}
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

			<g:form action="doctor_login_function" method="post"
				class="form-signin">

				<div class="dialog">

					<legend>
						<h2>Doctor Sign in</h2>
					</legend>
					<br />
					<g:if test="${flash.message}">

						<div class="alert alert-danger">
							${flash.message}
						</div>
					</g:if>


					<table class="userForm">
						<tr class='prop'>
							<td valign='top' style='text-align: left;' width='20%'><label
								for='username'>Username</label></td>
							<td valign='top' style='text-align: left;' width='80%'><input
								id="username" type='text' name='username'
								class="input-block-level" value='${doctorlogin?.username}' /></td>
						</tr>
						<tr class='prop'>
							<td valign='top' style='text-align: left;' width='20%'><label
								for='password'>Password </label></td>
							<td valign='top' style='text-align: left;' width='80%'><input
								id="password" type='password' name='password'
								class="input-block-level" value='${doctorlogin?.password}' /></td>
						</tr>
					</table>
				</div>


				<div class="buttons">

					<span class="formButton"> <input type="submit"
						value="Log In" class="btn btn-large btn-info"></input> <!--  <g:link controller="login"
								action="doctor_login_function" class="btn btn-large btn-success">Log in </g:link>-->

						<g:link controller="login" action="SignupAsDoctor"
							class="btn btn-large btn-success">Sign Up </g:link>


					</span>
				</div>

			</g:form>
		</g:else>
		
	</div>


</body>
</html>