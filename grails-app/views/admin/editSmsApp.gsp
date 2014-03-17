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
					<li><a href="manageApp">Manage Confirmed Appointments</a></li>
					<li><a href="manageReceptionAccounts">Manage Reception
							Accounts</a></li>
					<li><a href="manageDoctorAccounts">Manage Doctor Accounts</a></li>
					
					<li><a href="viaSMS">Appointments taken via SMS</a></li>
					<li><a href="feedres">Feedback</a></li>
					<li><a href="${createLink(uri: '/adminSettings/ControlPanel')}">Settings</a></li>
					<%--<li id="search"><a href="#">Search</a></li>
				--%></ul>

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
									<td><input type="text" name="firstname" /></td>
								</tr>
								<tr>

									<td>Middle Name</td>
									<td><input type="text" name="middlename" /></td>
								</tr>
								<tr>
									<td>Last Name</td>
									<td><input type="text" name="lastname" /></td>
								</tr>
								<tr>
									<td>Gender</td>
									<td><select name="gender">

											<option value="Male">Male</option>
											<option value="Female">Female</option>

									</select></td>
								</tr>
								<tr>
									<td>Age</td>
									<td><input type="text" name="age" /></td>
								</tr>
								<tr>
									<td>Mobile No.</td>
									<td><input type="text" name="mobile" value="${it.mobile }" /></td>
								</tr>
								<tr>
									<td>Email</td>
									<td><input type="email" name="email"></td>
								</tr>
								<tr>
									<td>Address</td>
									<td><input type="text" name="address"></td>
								</tr>
								<tr>
									<td>Pincode</td>
									<td><input type="text" name="pincode"></td>
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
									<td><input type="checkbox" name="scanpart"
										value="Abdomen/Pelvis" /> Abdomen/Pelvis <br /> <input
										type="checkbox" name="scanpart" value="Angiogram" />
										Angiogram <br /> <input type="checkbox" name="scanpart"
										value="Brain" /> Brain <br /> <input type="checkbox"
										name="scanpart" value="Chest" /> Chest <br /> <input
										type="checkbox" name="scanpart" value="Joints" /> Joints <br />
										<input type="checkbox" name="scanpart" value="Neck" /> Neck <br />
										<input type="checkbox" name="scanpart" value="Orbits" />
										Orbits <br /> <input type="checkbox" name="scanpart"
										value="Spine" /> Spine <br /> <input type="checkbox"
										name="scanpart" value="Others" /> Others <br /></td>
								</tr>
								<tr>

									<td>Disease(s)(if any)</td>
									<td><input type="checkbox" name="diseasehistory"
										value="Allergic reaction to CT contrast (Gadolinium based)" />&nbsp
										Allergic reaction to CT contrast (Gadolinium based)<br /> <input
										type="checkbox" name="diseasehistory" value="Claustrophobia" />&nbsp
										Claustrophobia<br /> <input type="checkbox"
										name="diseasehistory" value="Diabetes" />&nbsp Diabetes<br />
										<input type="checkbox" name="diseasehistory"
										value="Drug Allergy" />&nbsp Drug Allergy<br /> <input
										type="checkbox" name="diseasehistory" value="Kidney Disease" />&nbsp
										Kidney Disease<br /> <input type="checkbox"
										name="diseasehistory" value="Liver Disease" />&nbsp Liver
										Disease<br /> <input type="checkbox" name="diseasehistory"
										value="Latex Allergy" />&nbsp Latex Allergy<br /></td>

								</tr>
								<tr>

									<td>Harmful Item(s)(if any)</td>
									<td><input type="checkbox" name="harmful"
										value="Cardiac pacemaker or implanted cardioverter defibrillator/ICD" />&nbsp
										Cardiac pacemaker or implanted cardioverter defibrillator/ICD<br />

										<input type="checkbox" name="harmful"
										value="Internal electrodes or wires (pacing wires, DBS or VNS wires)" />&nbsp
										Internal electrodes or wires (pacing wires, DBS or VNS wires)<br />

										<input type="checkbox" name="harmful"
										value="Artificial heart value, coil, filter and/or stent (Gianturco coil, IVC filter)" />&nbsp
										Artificial heart value, coil, filter and/or stent (Gianturco
										coil, IVC filter)<br /> <input type="checkbox" name="harmful"
										value="Aneurysm clip(s)" />&nbsp Aneurysm clip(s)<br /> <input
										type="checkbox" name="harmful"
										value="Neurostimulator-TENS Unit, Biostimulator, bone growth stimulator, DBS, VNS" />&nbsp
										Neurostimulator-TENS Unit, Biostimulator, bone growth
										stimulator, DBS, VNS<br /> <input type="checkbox"
										name="harmful"
										value="Implanted drug pump (for chemotherapy medicine, pain medicine)" />&nbsp
										Implanted drug pump (for chemotherapy medicine, pain medicine)<br />

										<input type="checkbox" name="harmful"
										value="External drug pump (for Insulin or other medicine)" />&nbsp
										External drug pump (for Insulin or other medicine)<br /> <input
										type="checkbox" name="harmful"
										value="IV access port (Port-a-Cath, Broviac, PICC line, Swan-Gantz, Thermodilution)" />&nbsp
										IV access port (Port-a-Cath, Broviac, PICC line, Swan-Gantz,
										Thermodilution)<br /> <input type="checkbox" name="harmful"
										value="Implanted post surgical hardware (pins, rods, screws, plates, wires)" />&nbsp
										Implanted post surgical hardware (pins, rods, screws, plates,
										wires)<br /> <input type="checkbox" name="harmful"
										value="Artificial joint and /or limb" />&nbsp Artificial joint
										and /or limb<br /> <input type="checkbox" name="harmful"
										value="Artificial eye and/or eyelid spring" />&nbsp Artificial
										eye and/or eyelid spring<br /> <input type="checkbox"
										name="harmful"
										value="Eye injury from a metal object (metal shavings, metal slivers)" />&nbsp
										Eye injury from a metal object (metal shavings, metal slivers)<br />

										<input type="checkbox" name="harmful"
										value="Ear (Cochlear) implant, middle ear implant" />&nbsp Ear
										(Cochlear) implant, middle ear implant<br /> <input
										type="checkbox" name="harmful" value="Hearing aid(s)" />&nbsp
										Hearing aid(s)<br /> <input type="checkbox" name="harmful"
										value="False teeth/dentures, metallic removable dental work, braces, retainers" />&nbsp
										False teeth/dentures, metallic removable dental work, braces,
										retainers<br /> <input type="checkbox" name="harmful"
										value="Any type of implant held in place by a magnet" />&nbsp
										Any type of implant held in place by a magnet<br /> <input
										type="checkbox" name="harmful"
										value="Injured by a metal object (shrapnel, bullet, BB) and required medical attention" />&nbsp
										Injured by a metal object (shrapnel, bullet, BB) and required
										medical attention<br /> <input type="checkbox" name="harmful"
										value="Medication patch (nitroglycerine, nicotine, contraceptive, estrogen)" />&nbsp
										Medication patch (nitroglycerine, nicotine, contraceptive,
										estrogen)<br /> <input type="checkbox" name="harmful"
										value="Shunt or Sophy adjustable and programmable pressure valve" />&nbsp
										Shunt or Sophy adjustable and programmable pressure valve<br />

										<input type="checkbox" name="harmful"
										value="Spinal fixation device, spinal fusion and/or halo vest, spinal cord stimulator" />&nbsp
										Spinal fixation device, spinal fusion and/or halo vest, spinal
										cord stimulator<br /> <input type="checkbox" name="harmful"
										value="Surgical clips, staples or surgical mesh" />&nbsp
										Surgical clips, staples or surgical mesh<br /> <input
										type="checkbox" name="harmful"
										value="Tissue expander (breast)" />&nbsp Tissue expander
										(breast)<br /> <input type="checkbox" name="harmful"
										value="Penile implant" />&nbsp Penile implant<br /> <input
										type="checkbox" name="harmful" value="Pessary, IUD, Diaphragm" />&nbsp
										Pessary, IUD, Diaphragm<br /> <input type="checkbox"
										name="harmful" value="Radiation seeds (cancer treatment)" />&nbsp
										Radiation seeds (cancer treatment)<br /> <input
										type="checkbox" name="harmful"
										value="Body piercing, tattoo or permanent makeup" />&nbsp Body
										piercing, tattoo or permanent makeup<br /> <input
										type="checkbox" name="harmful" value="Wig, hair implants" />
										&nbsp Wig, hair implants<br /></td>

								</tr>
								<tr>
									<td>Clinical History</td>
									<td><textarea name="history" rows="4" cols="40"
											style="width: 25%"></textarea></td>
								</tr>
								<tr>
									<td></td>


									<td>
										<p>
											<input type="checkbox" name="pregnant" value="Yes" />&nbsp
											(If female) Are you pregnant?
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
			<g:form action="done">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Field</th>
							<th>Value</th>
						</tr>
					</thead>
					<tr>

						<td>Opening Time</td>
						<td><select name="start">
								<g:each in="${0..23}">
									<option value="${it}:00">
										${it}:00
									</option>
									<option value="${it}:30">
										${it}:30
									</option>
								</g:each>
						</select></td>
					</tr>
					<tr>
						<td>Closing Time</td>
						<td><select name="end" >
								<g:each in="${0..23}">
									<option value="${it}:00">
										${it}:00
									</option>
									<option value="${it}:30">
										${it}:30
									</option>
								</g:each>
						</select></td>
					</tr>

					</td>
					</tr>
					<tr>
						<td>SMS Username</td>
						<td><input type="text" name="smsuser" /></td>
					</tr>
					<tr>
						<td>SMS Password</td>
						<td><input type="password" name="smspass" /></td>
					</tr>
					<tr>
						<td>Time required for MRI</td>
						<td><input type="text" name="mriinterval" /> (in minutes)</td>
					</tr>
					<tr>
						<td>Time required for CT Scan</td>
						<td><input type="text" name="ctinterval" /> (in minutes)</td>
					</tr>
					<tr>
						<td></td>
						<td><g:actionSubmit class="btn btn-info" value="Done"/></td>
					</tr>
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
</body>
</html>
--%>