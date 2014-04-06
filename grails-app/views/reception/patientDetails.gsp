<!DOCTYPE html>
<html lang="en">
<head>

<meta name="layout" content="main">
<r:require modules="bootstrap" />
<r:layoutResources />
<title>Patient Details</title>

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
					<li><a href="changePassword">Change Password </a></li>
					<li><a href="patientHistory">Patient History </a></li>

				</ul>

			</div>

			<div class="col-sm-10 col-sm-offset-2 main">
				<h1 class="page-header">Patient Details</h1>


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
									<td>
										 ${it.firstname }
									</td>
								</tr>
								<tr>

									<td>Middle Name</td>
									<td>
										${it.middlename }
									</td>
								</tr>
								<tr>
									<td>Last Name</td>
									<td>
										${it.lastname }
									</td>
								</tr>
								<tr>
									<td>Gender</td>
									<td>
										${it.gender}
									</td>
								</tr>
								<tr>
									<td>Age</td>
									<td>
										${it.age }
									</td>
								</tr>
								<tr>
									<td>Mobile No.</td>
									<td>
										${it.mobile }
									</td>
								</tr>
								<tr>
									<td>Email</td>
									<td>
										${it.email }
									</td>
								</tr>
								<tr>
									<td>Address</td>
									<td>
										${it.address }
									</td>
								</tr>
								<tr>
									<td>Pincode</td>
									<td>
										${it.pincode }
									</td>
								</tr>
								<tr>
									<td>City</td>
									<td>
										${it.city }
									</td>
								</tr>
								<tr>
									<td>State</td>
									<td>
										${it.state }
									</td>
								</tr>
								<tr>

									<td>Machine</td>
									<td>
										${it.machine }
									</td>
								</tr>

								<tr>

									<td>Scan of</td>
									<td>
										<ul>
											<g:if test="${checkBoxInfo[0] == 1}">
												<li>Abdomen/Pelvis</li>
											</g:if>
											<g:if test="${checkBoxInfo[1] == 1}">
												<li>Angiogram</li>
											</g:if>
											<g:if test="${checkBoxInfo[2] == 1}">
												<li>Brain</li>
											</g:if>
											<g:if test="${checkBoxInfo[3] == 1}">
												<li>Chest</li>
											</g:if>
											<g:if test="${checkBoxInfo[4] == 1}">
												<li>Joints</li>
											</g:if>
											<g:if test="${checkBoxInfo[5] == 1}">
												<li>Neck</li>
											</g:if>
											<g:if test="${checkBoxInfo[6] == 1}">
												<li>Orbits</li>
											</g:if>
											<g:if test="${checkBoxInfo[7] == 1}">
												<li>Spine</li>
											</g:if>
											<g:if test="${checkBoxInfo[8] == 1}">
												<li>Others</li>
											</g:if>
										</ul>
									</td>



								</tr>
								<tr>

									<td>Disease(s)</td>
									<td>
										<ul>
											<g:if test="${checkBoxInfo[9] == 1}">
												<li>Allergic reaction to CT contrast (Gadolinium based)</li>
											</g:if>

											<g:if test="${checkBoxInfo[10] == 1}">
												<li>Claustrophobia</li>
											</g:if>

											<g:if test="${checkBoxInfo[11] == 1}">
												<li>Diabetes</li>
											</g:if>

											<g:if test="${checkBoxInfo[12] == 1}">
												<li>Drug Allergy</li>
											</g:if>

											<g:if test="${checkBoxInfo[13] == 1}">
												<li>Kidney Disease</li>
											</g:if>

											<g:if test="${checkBoxInfo[14] == 1}">
												<li>Liver Disease</li>
											</g:if>

											<g:if test="${checkBoxInfo[15] == 1}">
												<li>Latex Allergy</li>
											</g:if>
										</ul>
									</td>

								</tr>
								<tr>

									<td>Harmful Item(s)</td>
									<td>
										<ul>
											<g:if test="${checkBoxInfo[16] == 1}">
												<li>Cardiac pacemaker or implanted cardioverter
													defibrillator/ICD</li>
											</g:if>

											<g:if test="${checkBoxInfo[17] == 1}">
												<li>Implanted drug pump (for chemotherapy medicine,
													pain medicine)</li>
											</g:if>

											<g:if test="${checkBoxInfo[18] == 1}">
												<li>External drug pump (for Insulin or other medicine)</li>
											</g:if>

											<g:if test="${checkBoxInfo[19] == 1}">
												<li>Artificial joint and /or limb</li>
											</g:if>

											<g:if test="${checkBoxInfo[20] == 1}">
												<li>Artificial eye and/or eyelid spring</li>
											</g:if>

											<g:if test="${checkBoxInfo[21] == 1}">
												<li>Eye injury from a metal object (metal shavings,
													metal slivers)</li>
											</g:if>

											<g:if test="${checkBoxInfo[22] == 1}">
												<li>Ear (Cochlear) implant, middle ear implant</li>
											</g:if>

											<g:if test="${checkBoxInfo[23] == 1}">
												<li>Hearing aid(s)</li>
											</g:if>

											<g:if test="${checkBoxInfo[24] == 1}">
												<li>False teeth/dentures, metallic removable dental
													work, braces, retainers</li>
											</g:if>

											<g:if test="${checkBoxInfo[25] == 1}">
												<li>Injured by a metal object (shrapnel, bullet, BB)
													and required medical attention</li>
											</g:if>

											<g:if test="${checkBoxInfo[26] == 1}">
												<li>Body piercing, tattoo or permanent makeup</li>
											</g:if>

											<g:if test="${checkBoxInfo[27] == 1}">
												<li>Wig, hair implants</li>
											</g:if>
										</ul>
									</td>
								</tr>
								<tr>
									<td>Clinical History</td>
									<td>
										${it.clinicalhistory }
									</td>

								</tr>
								<tr>
									<td>Pregnant</td>


									<td>
										${it.pregnant} 
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


