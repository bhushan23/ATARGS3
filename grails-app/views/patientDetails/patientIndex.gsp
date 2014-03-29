<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Poona Diagnostics Services</title>
<r:require modules="bootstrap" />
<r:layoutResources />
<meta name="layout" content="main" />
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'offcanvas.css')}" type="text/css">

</head>

<body>


	<div class="container" style="">
		<br>

		<div class="row row-offcanvas row-offcanvas-right">

			<div class="col-xs-12 col-sm-9">
				<p class="pull-right visible-xs">
					<button type="button" class="btn btn-primary btn-xs"
						data-toggle="offcanvas">Toggle nav</button>
				</p>
				<div class="jumbotron">
					<h1>Poona Diagnostics Services</h1>
					<p>Welcome to PDS, we provide all sorts of imaging and scanning
						services alongwith our team of experts .</p>
				</div>
				<div class="row">
					<div class="col-6 col-sm-6 col-lg-4">
						<h4>Online Appointment</h4>
						<p>With facilities such as online appointment scheduling and
							getting online report, you don't have to visit the hospital again
							and again. Schedule an appointment with few clicks and get your
							report on your e-mail account.</p>
						<p>
							<a class="btn btn-default" href="requirnment" role="button">View
								details &raquo;</a>
						</p>
					</div>
					<!--/span-->
					<div class="col-6 col-sm-6 col-lg-4">
						<h4>Procedure Preparation</h4>
						<p>Certain procedures require a specific patient preparation
							to produce quality images.</p>
						<p>
							<a class="btn btn-default"
								href="${createLink(uri: '/patientDetails/procedurePreparation')}"
								role="button">View details &raquo;</a>
						</p>
					</div>
					<!--/span-->
					<div class="col-6 col-sm-6 col-lg-4">
						<h4>Download Report</h4>
						<p>Enter One Time password and Download report.</p>
						<p>

							<a class="btn btn-default"
								href="${createLink(uri: '/document/getReport')}"
								role="Download Report">View details &raquo;</a>
						</p>
						<h4>SMS based Appointment</h4>
						<p>Learn More about SMS Based appointment.</p>
						<p>

							<a class="btn btn-default"
								href="${createLink(uri: '/learnmore/sms')}"
								role="SMS Appointment">Learn more &raquo;</a>
						</p>

					</div>


					<!--/span-->
				</div>
				<!--/row-->
			</div>
			<!--/span-->

			<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar"
				role="navigation">
				<div class="list-group">
					<a href="#" class="list-group-item active">Radiology</a> <a
						href="requirnment" class="list-group-item">Schedule an
						appointment</a> <a href="${createLink(uri: '/document/getReport')}"
						class="list-group-item">Get Report</a>
				</div>
			</div>
			<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="Div1"
				role="navigation">
				<div class="list-group">
					<a class="list-group-item active">Contact Us</a> <a
						class="list-group-item"> <br /> 020 - 2431 4661 <br /> 020 -
						2433 7313
					</a>

				</div>
			</div>
			<!--/span-->
		</div>
		<!--/row-->

		<hr>

		<footer>
			<p>&copy; Poona Diagnostic Services</p>
		</footer>

	</div>
	<!--/.container-->


</body>
</html>
