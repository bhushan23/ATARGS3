<!DOCTYPE html>
<html lang="en">
<head>

<meta name="layout" content="main">
<r:require modules="bootstrap" />
<r:layoutResources />
<title>Edit Appointment</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'dashboard.css')}" type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>

<!-- Custom styles for this template -->
<link href="dashboard.css" rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
	
</script>
<script>
	$(document).ready(function() {
		$("#searchtext").hide();
		$("#search").click(function() {
			$("#searchtext").toggle();
		});
	});
</script>

</head>


<body>

	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-2 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="index">Dashboard</a></li>
					
					<li><a href="manageReceptionAccounts">Manage Reception Accounts</a></li>
					<li><a href="manageDoctorAccounts">Manage Doctor Accounts</a></li>
					
					<li><a href="feedres">Feedback</a></li>
					<li><a href="ControlPanel">Settings</a></li>
					<li><a href="changePassword">Change Password</a></li>
				</ul>

			</div>

			<div class="col-sm-10 col-sm-offset-2 main">
				<h1 class="page-header">Change Password</h1>


				<div class="table-responsive">
					<g:form action="passwordChanged">
						<table class="table table-striped">
							<tr>
								<td><g:if test="${flash.messageCurPass}">
										<div class="alert alert-danger">
											${flash.messageCurPass}
										</div>
									</g:if></td>
								<td><g:if test="${flash.messageEmptyPass}">
										<div class="alert alert-danger">
											${flash.messageEmptyPass}
										</div>
									</g:if></td>
								<td><g:if test="${flash.messageNewPass}">
										<div class="alert alert-danger">
											${flash.messageNewPass}
										</div>
									</g:if></td>
							</tr>
							</table>
						<table class="table table-striped">
							
							<thead>
								<tr>
									<th>Field</th>
									<th>Value</th>
								</tr>
							</thead>
							<tr>
								<td>Enter current password</td>
								<td><input type="password" name="curpassword" value="" /></td>
							</tr>
							<tr>
								<td>Enter new password</td>
								<td><input type="password" name="newpassword" value="" /></td>
							</tr>
							<tr>
								<td>Confirm new password</td>
								<td><input type="password" name="confirmpassword" value="" />
								</td>
							</tr>
						</table>
						<br>
						<input type="submit" value="Done"
							class="btn btn-large btn-success" />
					</g:form>
				</div>
			</div>
		</div>
	</div>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>

</body>
</html>



