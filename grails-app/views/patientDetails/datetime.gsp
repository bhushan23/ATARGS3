<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
 

    <title>Poona Diagnostice Services- Schedule an Appointment</title>

      <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
</script>
   <g:javascript library="jquery" />
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'offcanvas.css')}"
	type="text/css">

<script src="${resource(dir: 'css', file: 'mobile.css')}">
	
</script>
<script src="${resource(dir: 'js', file: 'bootstrap.js')}">
	
</script>
<script src="${resource(dir: 'js', file: 'jquery-1.10.1.min.js')}">
</script>
<r:require modules="bootstrap"/>
<g:javascript library="application" />
<r:layoutResources />
   
</head>

<body>
    <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">PDS</a>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="PatientIndex.html">For Patients</a></li>
                    <li><a href="#about">For Referring Physicans</a></li>
                    <li><a href="#about">Meet Our Experts</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact Us</a></li>
                </ul>
            </div>
            <!-- /.nav-collapse -->
        </div>
        <!-- /.container -->
    </div>
    <!-- /.navbar -->
    <div class="container">

        <div class="masthead">
            <h3 class="text-muted">Schedule an Appointment</h3>
            <ul class="nav nav-justified">
                <li class="active"><a href="#">Date and Time</a></li>
                <li><a href="personal.html" onclick="CannotSkip()">Personal Details</a></li>
                <li><a href="#" onclick="CannotSkip()">MRI of</a></li>
                <li><a href="#" onclick="CannotSkip()">Questionare</a></li>
                <li><a href="#" onclick="CannotSkip()">Consent and Undertaking</a></li>
                <li><a href="#" onclick="CannotSkip()">Finish</a></li>
            </ul>
        </div>

        <!-- Jumbotron -->
        <div class="jumbotron jumbo">
            <h1>Date and Time</h1>
            <h4>Step 1 of 6</h4>
            
        </div>

        <!-- Example row of columns -->
        <div class="row" id="content">
            <div class="col-lg-4">
                Show date and time here
                <g:remoteLink action="loaddate" update="content">click</g:remoteLink>
            </div>
        </div>

        <hr>

        <footer>
            <p>&copy; 2013 Poona Diagnostic Services</p>
        </footer>

    </div>
    <!--/.container-->



   
    <script>
        function CannotSkip() {
            alert("Cannont Skip Steps. You will have to proceed serially.");
        }
    </script>
</body>
</html>
