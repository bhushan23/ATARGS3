	<!DOCTYPE html>

<html>
<head>
<title>Book My Scan</title>
<style>
a {
	font-size: 22px;
	color: #000000;
	text-decoration: none;
}

a:visited {
	font-size: 22px;
	color: #000000;
	text-decoration: underline;
}

a:hover {
	color: #444444;
}
</style>
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
</head>
<body>
	<div class="container">

		<br />
		<div class="hero-unit">

			<legend>
				<h1>select machine</h1>
			</legend>
			<div class="progress progress-striped active">
				<div class="progress-bar progress-bar-info" style="width: 33%">
					<span class="sr-only">67% Complete (success)</span>
				</div>

			</div>
			<g:link action="SelectDate" params="[machine:'CT']">
				<h2>CT Scan</h2>
			</g:link>

			<g:link action="SelectDate" params="[machine:'MRI']">
				<h2>MRI Scan</h2>
			</g:link>

		</div>
	</div>

</body>