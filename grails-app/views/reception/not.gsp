<
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<r:require modules="bootstrap" />
<meta name="layout" content="main" />

<title>Notify</title>

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


			<g:form action="notifymanually" method="post" class="form-signin">
				<div class="input">
					<br />
					<legend>
						<h2>Send nessage</h2>
					</legend>
					<label for="mobile">Mobile No</label> <input id="mobile"
						type="text" name="mobile" class="input-block-level"
						placeholder="918983062202" }' /> <br /> <label for='password'>Message</label>
					<input id="msg" name="msg" class="input-block-level" type='text'
						placeholder="message" />

				</div>

			<span class="formButton"> <input type="submit"
							value="Send" class="btn btn-large btn-info"></input> 
							</span>
			</g:form>
		</div>


	</div>


</body>
</html>
