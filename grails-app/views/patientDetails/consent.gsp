<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
 <meta name="layout" content="main" />

    <title>Poona Diagnostice Services - Schedule an Appointment</title>
	<r:require modules="bootstrap"/>
	<r:layoutResources/>

</head>

<body>
   <br>
<br>
<br>
    <div class="container">

        <div class="masthead">
            <h3 class="text-muted">Schedule an Appointment</h3>
            <ul class="nav nav-justified">
                <li class="active"><a href="#">Date and Time</a></li>
                <li><a href="personal.html" onclick="CannotSkip()">Personal Details</a></li>
                <li><a href="#" onclick="CannotSkip()">Scan of</a></li>
                <li><a href="#" onclick="CannotSkip()">Questionnaire</a></li>
                <li><a href="#" onclick="CannotSkip()">Consent and Undertaking</a></li>
                <li><a href="#" onclick="CannotSkip()">Finish</a></li>
            </ul>
        </div>
<div class="progress progress-striped active" style="margin:0px;height:5px">
			<div class="progress-bar progress-bar-info" style="width: 72%">	</div>
		</div>
        
        <!-- Jumbotron -->
        <div class="jumbotron">
            <h1>Consent and Undertaking<g:link action="finish" class="btn btn-info"> Next Step &raquo;</g:link></h1>
            <h4>Step 5 of 6</h4>
             <h5>Scan of | Consent and Undertaking</h5>
            
        </div>

        <!-- Example row of columns -->
        <div class="row">
            <div class="col-lg-4">
                <p>&nbsp I agree with all the terms and conditions. I agree that I have been informed about all the
                risks involved in performing MRI/CT Scan. I agree with anaesthesia/sedation as may be necessary.</p>
                <p>Note : This is just a request to perform the scan/imaging. The date and time given to you for appointment may change
                    and administrator can change/reject the appointment without further notice.
                </p>
                <p>All rights reserved. Dispute under Pune Judriction.</p>
				<p><input type="checkbox" name="1" />&nbsp I have read all the terms</p>
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
