<!DOCTYPE html>
<html>
	<head>
		<title><g:if env="development"> An Error has occured Exception</g:if><g:else>Error</g:else></title>
		<meta name="layout" content="main" />
<r:require modules="bootstrap" />
<meta name="layout" content="main" />
		<g:if env="development"><link rel="stylesheet" href="${resource(dir: 'css', file: 'errors.css')}" type="text/css"></g:if>
<style type="text/css">
		#errorclass{
			position: fixed;
			top:20%;
			left:10%;
		}
		</style>
	</head>
	<body>
		<div class ="hero-unit" id="errorclass">
			<g:if env="development">
			<g:renderException exception="${exception}" />
		</g:if>
		<g:else>
		
				<h3>	An error has occurred </h3>
		<h3>Try refreshing Page or Try after some time </h3>
		<a class="home" href="${createLink(uri: '/')}"><g:message
								code="Click here for Home Page" /></a>
		</g:else>
	</body>
</html>
