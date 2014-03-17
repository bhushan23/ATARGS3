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
					<li><a href="getNewApp">New Appointments</a></li>

					<li><a href="uploadReport">Upload Reports</a></li>
					<li><a href="viaSMS">Appointments taken via SMS</a></li>

				</ul>

			</div>

			<div class="col-sm-10 col-sm-offset-2 main">
				<h1 class="page-header">Edit Appointment</h1>


				<div class="table-responsive">
					<g:form action="saveAppChanges">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Field</th>
									<th>Value</th>
								</tr>
							</thead>
							<g:each in="${req_entry }">
								<tr>

									<td>First Name</td>
									<td><input type="text" name="firstname" size="40" value="${it.firstname }"/></td>
								</tr>
								<tr>

									<td>Middle Name</td>
									<td><input type="text" name="middlename" size="40" value="${it.middlename }"/></td>
								</tr>
								<tr>
									<td>Last Name</td>
									<td><input type="text" name="lastname" size="40" value="${it.lastname }"/></td>
								</tr>
								<tr>
									<td>Gender</td>
									<td><select name="gender"  value="${it.gender}">

											<option value="Male">Male</option>
											<option value="Female">Female</option>

									</select></td>
								</tr>
								<tr>
									<td>Age</td>
									<td><input type="text" name="age" size="40" value="${it.age }"/></td>
								</tr>
								<tr>
									<td>Mobile No.</td>
									<td><input type="text" name="mobile" size="40" value="${it.mobile }" /></td>
								</tr>
								<tr>
									<td>Email</td>
									<td><input type="email" name="email" size="40" value="${it.email }"></td>
								</tr>
								<tr>
									<td>Address</td>
									<td><input type="text" name="address" size="40" value="${it.address }"></td>
								</tr>
								<tr>
									<td>Pincode</td>
									<td><input type="text" name="pincode" size="40" value="${it.pincode }"></td>
								</tr>
								<tr>
									<td>City</td>
									<td><input type="text" name="city" size="40" value="${it.city }"/></td>
								</tr>
								<tr>
									<td>State</td>
									<td><input type="text" name="state" size="40" value="${it.state }"/></td>
								</tr>
								<tr>

									<td>Machine</td>
									<td><input type="text" name="machine" size="40" value="${it.machine }"/></td>
								</tr>
								
								<tr>

									<td>Scan of</td>
									<td><input type="text" name="scanpart" size="40" value="${it.scanof }"/></td>
								</tr>
								<tr>

									<td>Disease(s)(if any)</td>
									<td><textarea name="diseasehistory" rows="4" cols="40"
											style="width: 25%" >${it.disease }</textarea><br>
									(Separate multiple entries by ' <b>;</b> ' <br>&nbsp e.g.:- Diabetes<b>;</b>Kidney Disease<b>;</b>Liver Disease)</td>

								</tr>
								<tr>

									<td>Harmful Item(s)(if any)</td>
									<td><textarea name="harmful" rows="4" cols="40"
											style="width: 25%" >${it.harmfulitems }</textarea><br>
									(Separate multiple entries by ' <b>;</b> ' <br>&nbsp e.g.:- Aneurysm clips<b>;</b>Hearing aid(s)<b>;</b>Body piercing)</td>

								</tr>
								<tr>
									<td>Clinical History</td>
									<td><textarea name="history" rows="4" cols="40"
											style="width: 25%">${it.clinicalhistory }</textarea></td>
								</tr>
								<tr>
									<td>Pregnant</td>
									<td>
										
											<input type="text" name="pregnant" value="${it.pregnant }" />(Yes/No)
										
										<br> <br><input type="submit" value="Done" class="btn btn-large btn-success" />

									</td>


								</tr>
							</g:each>
						</table>
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







<%--<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.ico">

<title>Poona Diagnostice Services</title>

<r:require modules="bootstrap" />
<style type="text/css" href="${resource(dir:'css', file:'dash.css') }"
	type="stylesheet"></style>
<r:layoutResources />
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Dashboard</a></li>
					<li><a href="#">Settings</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Help</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search...">
				</form>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Overview</a></li>
					<li><a href="#">Reports</a></li>
					<li><a href="#">Analytics</a></li>
					<li><a href="#">Export</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Nav item</a></li>
					<li><a href="">Nav item again</a></li>
					<li><a href="">One more nav</a></li>
					<li><a href="">Another nav item</a></li>
					<li><a href="">More navigation</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Nav item again</a></li>
					<li><a href="">One more nav</a></li>
					<li><a href="">Another nav item</a></li>
				</ul>
			</div>
			<h1 class="page-header">Control Panel</h1>


			<div class="table-responsive">
			<g:form action="saveSmsChanges">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Field</th>
							<th>Value</th>
						</tr>
					</thead>
					<g:each in="${req_entry }">
					<tr>
					
						<td>First Name</td>
						<td><input type="text" name="firstname" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="lastname" /></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><select name="gender">
								
									<option value="Male">
										Male
									</option>
									<option value="Female">
										Female
									</option>
								
						</select></td>
					</tr>
					<tr>
						<td>Age</td>
						<td><input type="text" name="age" /></td>
					</tr>
					<tr>
						<td>Mobile No.</td>
						<td><input type="text" name="mobile" value="${it.mobile }"/></td>
					</tr>
					<tr>
						<td>City</td>
						<td><input type="text" name="city" /></td>
					</tr>
					<tr>
						<td>State</td>
						<td><input type="text" name="state" /></td>
					</tr>
					<tr>
					 <td>Referral Doctor</td>
					 <td>
					 <select name="referral" >
                         <g:each in="${doctors}">
									<option value="${it.id}">
										${it.firstname} ${it.lastname }
									</option>
				
						</g:each>
						
									<option value="0">
										Doctor Not Listed
									</option>
						</select>
						</td>
					</tr>
					<tr>
						<td>Clinical History</td>
						<td><input type="text" name="history" /></td>
					</tr>
					<tr>
						<td></td>
						<td>
 			
			<g:link  action="saveSmsChanges"  class="btn btn-info">Done</g:link>
			
			</td>
					</tr>
					</g:each>
				</table>
				</g:form>
			</div>
		</div>
	</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>
	<script src="../../docs-assets/js/holder.js"></script>
	<r:layoutResources disposition="defer"/>
</body>
</html>
--%>


