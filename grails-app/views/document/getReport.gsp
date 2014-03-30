

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
    <style type="text/css">
    #otpcontainer{

     position: fixed;
  top: 30%;
  
    }
    </style>
  </head>

  <body>
  

    <div class="container" >
     <div class="jumbotron" id="otpcontainer">
   
	<g:if test="${flash.messageOTP}">
									<div class="alert alert-danger">
										${flash.messageOTP}
									</div>
		</g:if>
     
        
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
