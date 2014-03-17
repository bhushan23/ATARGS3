<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]>  -->


<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title><g:layoutTitle default="Center" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="shortcut icon"
	href="${resource(dir: 'images', file: 'favicon1.png')}"
	type="image/x-icon">
<link rel="apple-touch-icon"
	href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
<link rel="apple-touch-icon" sizes="114x114"
	href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">




<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'bootstrap-responsive.css')}"
	type="text/css">

<script src="${resource(dir: 'css', file: 'mobile.css')}">
	
</script>
<script src="${resource(dir: 'js', file: 'bootstrap.js')}">
	
</script>
<script src="${resource(dir: 'js', file: 'jquery-1.10.1.min.js')}">
</script>

<g:layoutHead />
<g:javascript library="application" />
<r:layoutResources />
</head>
<body>
	<header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav"
		role="banner">
		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target=".bs-navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="../" class="navbar-brand">ATARGS</a>
			</div>
			<nav class="collapse navbar-collapse bs-navbar-collapse"
				role="navigation">
				<ul class="nav navbar-nav">
					<li>
					<li><a class="home" href="${createLink(uri: '/')}"><g:message
								code="Home" /></a></li>
				<li>
				
				<a	<g:link controller="PatientDetails" action="patientIndex"> <g:message code="For Patients" /></g:link>> </a>
				</li>
								
				<li>
				
				<a	<g:link controller="login" action="loginAsDoctor"> <g:message code="For Referral Physians" /></g:link>> </a>
				</li>
				
				<li>
				<a	<g:link> <g:message code="Meet our Experts" /></g:link>> </a>
				</li>
				
				<li>
				<a	<g:link> <g:message code="About us" /></g:link>> </a>
				</li>
				
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><g:if test="${session.UserLoggedin}">
							<a
								<g:link controller="Login" action="loggedinhomepage"> <g:message code="Hi, ${session.UserLoggedin}" /></g:link>>
							</a>
						</g:if> <g:else>
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Login Here <b class="caret"></b></a>
						<ul class="dropdown-menu">
                    <li><a><g:link controller="Login" action="loginAsDoctor"> For Referral Doctors </g:link></a></li>
					 <li><a><g:link controller="Login" action="loginAsReceptionist"> For Receptionist </g:link></a></li>
					 <li><a><g:link controller="Login" action="login"> For Admin </g:link></a></li>
					
						</ul>
						
						</g:else></li>
					<li><g:if test="${session.UserLoggedin}">
							<a
								<g:link controller="Login" action="logout"> <g:message code="Logout" /></g:link>>
							</a>
						</g:if></li>
				</ul>

				</ul>
			</nav>
		</div>
	</header>
	<g:layoutBody />
	<div class="footer" role="contentinfo"></div>
	<div id="spinner" class="spinner" style="display: none;">
		<g:message code="spinner.alt" default="Loading&hellip;" />
	</div>
		
	<r:layoutResources />
	
</body>
</html>
