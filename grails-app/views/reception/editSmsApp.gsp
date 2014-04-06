<!DOCTYPE html>
<html lang="en">
<head>

<meta name="layout" content="main">
<r:require modules="bootstrap" />
<r:layoutResources />
<title>Edit SMS Appointment</title>

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
					<li  ><a href="changePassword">Change Password </a> </li>
					<li><a href="patientHistory">Patient History </a> </li>
				</ul>

			</div>

			<div class="col-sm-10 col-sm-offset-2 main">
				<h1 class="page-header">Edit SMS Appointment</h1>


				<div class="table-responsive">
					<g:form action="done">
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
									<td><input type="text" name="firstname" value="${it.firstname }"/></td>
								</tr>
								<tr>

									<td>Middle Name</td>
									<td><input type="text" name="middlename" value="${it.middlename }"/></td>
								</tr>
								<tr>
									<td>Last Name</td>
									<td><input type="text" name="lastname" value="${it.lastname }"/></td>
								</tr>
								<tr>
									<td>Gender</td>
									<td><select name="gender">
											<g:if test="${it.gender == 'Male'}">
											<option value="Male" selected>Male</option>
											<option value="Female" >Female</option>
											</g:if>
											<g:elseif test="${it.gender == 'Female'}">
											<option value="Female" selected>Female</option>
											<option value="Male" >Male</option>
											</g:elseif>
											

									</select></td>
								</tr>
								<tr>
									<td>Age</td>
									<td><input type="text" name="age" value="${it.age }"/></td>
								</tr>
								<tr>
									<td>Mobile No.</td>
									<td><input type="text" name="mobile" value="${it.mobile }" /></td>
								</tr>
								<tr>
									<td>Email</td>
									<td><input type="email" name="email" value="${it.email }" size="40"/></td>
								</tr>
								<tr>
									<td>Address</td>
									<td><input type="text" name="address" value="${it.address }"/></td>
								</tr>
								<tr>
									<td>Pincode</td>
									<td><input type="text" name="pincode" value="${it.pincode }"/></td>
								</tr>
								<tr>
									<td>City</td>
									<td><input type="text" name="city" value="${it.city }"/></td>
								</tr>
								<tr>
									<td>State</td>
									<td><input type="text" name="state" value="${it.state }"/></td>
								</tr>
								<tr>
									<td>Referral Doctor</td>
									<td><select name="referral">
											<g:each in="${doctors}">
												<option value="${it.id}">
													${it.firstname}
													${it.lastname }
												</option>

											</g:each>

											<option value="0">Doctor Not Listed</option>
									</select></td>
								</tr>
								<tr>

									<td>Machine</td>
									<td><input type="text" name="machine" value="${it.machine }"/></td>
								</tr>
								<tr>

									<td>Scan of</td>
									<td><g:if test="${checkBoxInfo[0] == 1}">
											<input type="checkbox" name="scanpart" value="1" checked /> Abdomen/Pelvis <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="1" /> Abdomen/Pelvis <br />
										</g:else> <g:if test="${checkBoxInfo[1] == 1}">
											<input type="checkbox" name="scanpart" value="2" checked /> Angiogram <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="2" /> Angiogram <br />
										</g:else> <g:if test="${checkBoxInfo[2] == 1}">
											<input type="checkbox" name="scanpart" value="3" checked /> Brain <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="3" /> Brain <br />
										</g:else> <g:if test="${checkBoxInfo[3] == 1}">
											<input type="checkbox" name="scanpart" value="4" checked /> Chest <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="4" /> Chest <br />
										</g:else> <g:if test="${checkBoxInfo[4] == 1}">
											<input type="checkbox" name="scanpart" value="5" checked /> Joints <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="5" /> Joints <br />
										</g:else> <g:if test="${checkBoxInfo[5] == 1}">
											<input type="checkbox" name="scanpart" value="6" checked /> Neck <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="6" /> Neck <br />
										</g:else> <g:if test="${checkBoxInfo[6] == 1}">
											<input type="checkbox" name="scanpart" value="7" checked /> Orbits <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="7" /> Orbits <br />
										</g:else> <g:if test="${checkBoxInfo[7] == 1}">
											<input type="checkbox" name="scanpart" value="8" checked /> Spine <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="8" /> Spine <br />
										</g:else> <g:if test="${checkBoxInfo[8] == 1}">
											<input type="checkbox" name="scanpart" value="9" checked /> Others <br />
										</g:if> <g:else>
											<input type="checkbox" name="scanpart" value="9" /> Others <br />
										</g:else></td>

								</tr>
								<tr>

									<td>Disease(s)(if any)</td>
									<td><g:if test="${checkBoxInfo[9] == 1}">
											<input type="checkbox" name="diseasehistory" value="10"
												checked />&nbsp Allergic reaction to CT contrast (Gadolinium based)<br />
										</g:if> <g:else>
											<input type="checkbox" name="diseasehistory" value="10" />&nbsp Allergic reaction to CT contrast (Gadolinium based)<br />
										</g:else> <g:if test="${checkBoxInfo[10] == 1}">
											<input type="checkbox" name="diseasehistory" value="11"
												checked />&nbsp Claustrophobia<br />
										</g:if> <g:else>
											<input type="checkbox" name="diseasehistory" value="11" />&nbsp Claustrophobia<br />
										</g:else> <g:if test="${checkBoxInfo[11] == 1}">
											<input type="checkbox" name="diseasehistory" value="12"
												checked />&nbsp Diabetes<br />
										</g:if> <g:else>
											<input type="checkbox" name="diseasehistory" value="12" />&nbsp Diabetes<br />
										</g:else> <g:if test="${checkBoxInfo[12] == 1}">
											<input type="checkbox" name="diseasehistory" value="13"
												checked />&nbsp Drug Allergy<br />
										</g:if> <g:else>
											<input type="checkbox" name="diseasehistory" value="13" />&nbsp Drug Allergy<br />
										</g:else> <g:if test="${checkBoxInfo[13] == 1}">
											<input type="checkbox" name="diseasehistory" value="14"
												checked />&nbsp Kidney Disease<br />
										</g:if> <g:else>
											<input type="checkbox" name="diseasehistory" value="14" />&nbsp Kidney Disease<br />
										</g:else> <g:if test="${checkBoxInfo[14] == 1}">
											<input type="checkbox" name="diseasehistory" value="15"
												checked />&nbsp Liver Disease<br />
										</g:if> <g:else>
											<input type="checkbox" name="diseasehistory" value="15" />&nbsp Liver Disease<br />
										</g:else> <g:if test="${checkBoxInfo[15] == 1}">
											<input type="checkbox" name="diseasehistory" value="16"
												checked />&nbsp Latex Allergy<br />
										</g:if> <g:else>
											<input type="checkbox" name="diseasehistory" value="16" />&nbsp Latex Allergy<br />
										</g:else></td>
								</tr>
								<tr>

									<td>Harmful Item(s)(if any)</td>
									<td><g:if test="${checkBoxInfo[16] == 1}">
											<input type="checkbox" name="harmful" value="17" checked />&nbsp Cardiac pacemaker or implanted cardioverter defibrillator/ICD<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="17" />&nbsp Cardiac pacemaker or implanted cardioverter defibrillator/ICD<br />
										</g:else> <g:if test="${checkBoxInfo[17] == 1}">
											<input type="checkbox" name="harmful" value="18" checked />&nbsp Implanted drug pump (for chemotherapy medicine, pain medicine)<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="18" />&nbsp Implanted drug pump (for chemotherapy medicine, pain medicine)<br />
										</g:else> <g:if test="${checkBoxInfo[18] == 1}">
											<input type="checkbox" name="harmful" value="19" checked />&nbsp External drug pump (for Insulin or other medicine)<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="19" />&nbsp External drug pump (for Insulin or other medicine)<br />
										</g:else> <g:if test="${checkBoxInfo[19] == 1}">
											<input type="checkbox" name="harmful" value="20" checked />&nbsp Artificial joint and /or limb<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="20" />&nbsp Artificial joint and /or limb<br />
										</g:else> <g:if test="${checkBoxInfo[20] == 1}">
											<input type="checkbox" name="harmful" value="21" checked />&nbsp Artificial eye and/or eyelid spring<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="21" />&nbsp Artificial eye and/or eyelid spring<br />
										</g:else> <g:if test="${checkBoxInfo[21] == 1}">
											<input type="checkbox" name="harmful" value="22" checked />&nbsp Eye injury from a metal object (metal shavings, metal slivers)<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="22" />&nbsp Eye injury from a metal object (metal shavings, metal slivers)<br />
										</g:else> <g:if test="${checkBoxInfo[22] == 1}">
											<input type="checkbox" name="harmful" value="23" checked />&nbsp Ear (Cochlear) implant, middle ear implant<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="23" />&nbsp Ear (Cochlear) implant, middle ear implant<br />
										</g:else> <g:if test="${checkBoxInfo[23] == 1}">
											<input type="checkbox" name="harmful" value="24" checked />&nbsp Hearing aid(s)<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="24" />&nbsp Hearing aid(s)<br />
										</g:else> <g:if test="${checkBoxInfo[24] == 1}">
											<input type="checkbox" name="harmful" value="25" checked />&nbsp False teeth/dentures, metallic removable dental work, braces, retainers<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="25" />&nbsp False teeth/dentures, metallic removable dental work, braces, retainers<br />
										</g:else> <g:if test="${checkBoxInfo[25] == 1}">
											<input type="checkbox" name="harmful" value="26" checked />&nbsp Injured by a metal object (shrapnel, bullet, BB) and required medical attention<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="26" />&nbsp Injured by a metal object (shrapnel, bullet, BB) and required medical attention<br />
										</g:else> <g:if test="${checkBoxInfo[26] == 1}">
											<input type="checkbox" name="harmful" value="27" checked />&nbsp Body piercing, tattoo or permanent makeup<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="27" />&nbsp Body piercing, tattoo or permanent makeup<br />
										</g:else> <g:if test="${checkBoxInfo[27] == 1}">
											<input type="checkbox" name="harmful" value="28" checked />&nbsp Wig, hair implants<br />
										</g:if> <g:else>
											<input type="checkbox" name="harmful" value="28" />&nbsp Wig, hair implants<br />
										</g:else>
										</td>

								</tr>
								<tr>
									<td>Clinical History</td>
									<td><textarea name="history" rows="4" cols="40"
											style="width: 25%">${it.clinicalhistory }</textarea></td>
								</tr>
								<tr>
									<td></td>


									<td>
										<p>
											<g:if test="${it.pregnant=='Yes' }">
											<input type="checkbox" name="pregnant" value="Yes" checked/>&nbsp
											(If female) Are you pregnant?
											</g:if>
											<g:else>
											<input type="checkbox" name="pregnant" value="Yes" />&nbsp
											(If female) Are you pregnant?
											</g:else>
										</p>
										<br> <g:actionSubmit class="btn btn-info" value="Done" />
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


