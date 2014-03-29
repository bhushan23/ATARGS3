<%--

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.ico">
    <meta name="layout" content="main">
	<r:require modules="bootstrap" />
	<r:layoutResources />
    <title>Carousel Template for Bootstrap</title>

 <!-- Bootstrap core CSS -->
    <link href="${resource(dir: 'css', file: 'carousel.css')}" rel="stylesheet">
	<script src="${resource(dir: 'js', file: 'holder.js')}">
    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
   
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    

    <!-- Custom styles for this template -->
    <link href="carousel.css" rel="stylesheet">
    <script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
	
</script>
  </head>
<!-- NAVBAR
================================================== -->
  <body>
    


    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      </ol>
      <div class="carousel-inner">
        <div class="item active">
          <div class="container">
            <div class="carousel-caption">
              <h1>Download Report</h1>
              <br>
              <br>
             <h2><p> <g:form controller="Document" action="download">
			<label for='pid'>Enter your otp:</label>
			<input id="otp" type='text' name='otp' value='${patientDetails?.otp}' />
			<p><br><g:actionSubmit class="btn btn-lg btn-primary"  value="Download" action="download" params="[p:otp]"/></p> 
			</g:form></p></h2>
             
            </div>
          </div>
        </div>
        
    </div><!-- /.carousel -->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../docs-assets/js/holder.js"></script>
  
  </body>
</html>
--%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="layout" content="main">
	<r:require modules="bootstrap" />
	<r:layoutResources />
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.ico">

    <title>Download Report</title>

    <!-- Bootstrap core CSS -->
    <link href="${resource(dir: 'css', file: 'jumbotron-narrow.css')}" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="jumbotron-narrow.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  

    <div class="container">
      <div class="header">
        <ul class="nav nav-pills pull-right">
          <li><a class="home" href="${createLink(uri: '/')}"><g:message
								code="Home" /></a></li>
        </ul>
        <h1 class="text-muted">Download Your Report</h1>
      </div>
	<g:if test="${flash.messageOTP}">
									<div class="alert alert-danger">
										${flash.messageOTP}
									</div>
		</g:if>
      <div class="jumbotron">
        
        <h2 class="text-muted"><p> <g:form controller="Document" action="feedback">
			<label for='pid'>Enter your otp:</label>
			<input id="otp" type='text' name='otp' value='${patientDetails?.otp}' />
			<p><br><g:actionSubmit class="btn btn-lg btn-primary"  value="Download" action="feedback" /></p> 
			</g:form></p></h2>
      </div>


      

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
