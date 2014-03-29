	<!DOCTYPE html>
<html lang="en">
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="layout" content="main" />
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'offcanvas.css')}"
	type="text/css">

<script src="${resource(dir: 'css', file: 'mobile.css')}">
	
</script>
<script src="${resource(dir: 'js', file: 'bootstrap.js')}">
	
</script>
<script src="${resource(dir: 'js', file: 'jquery-1.10.1.min.js')}">
</script>

<g:javascript library="application" />
<r:layoutResources />
   
</head>

<body>
  

    <div class="container">
<br>
        <div class="row row-offcanvas row-offcanvas-right">

            <div class="col-xs-12 col-sm-9">
                <p class="pull-right visible-xs">
                    <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
                </p>
                <div class="row">
                    <div class="col-6 col-sm-6 col-lg-4" style="width: 100%">
                        <h2>Making an appointment</h2>
                        <p>In order to make your scheduling experience the best it can be, please make sure that you fill the required details about your appointment according to the form provided to you by your referral doctor.</p>
                        <h4>Ensure the doctor's form contains all the following information:</h4>
                        <ul>
                            <li>Patient's full name & date of birth</li>
                            <li>Type of procedure requested (include body part)</li>
                            <li>Diagnosis</li>
                            <li>Clinical history/reason for procedure</li>
                            <li>Name of the requesting provider and/or attending provider</li>
                            <li>Insurance</li>
                            <li>Allergies, if having contrast</li>
                        </ul>
                        <h4>Provide the following information if available or required:</h4>
                        <ul>
                            <li>Height & weight of patient</li>
                            <li>Is patient claustrophobic</li>
                            <li>Sedation needs</li>
                        </ul>
                        <p><g:link class="btn btn-default" action="setMachine" role="button" params="[machine:'MRI']">MRI &raquo;</g:link></p>
                        <p><g:link class="btn btn-default" action="setMachine" role="button" params="[machine:'CT']">CT Scan &raquo;</g:link></p>
                    </div>
                </div>

            </div>
            <!--/span-->

          
			<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar"
				role="navigation">
				<div class="list-group">
					<a href="#" class="list-group-item active">Radiology</a>
					<a href="requirnment" class="list-group-item">Schedule an appointment</a>
					<a href="${createLink(uri: '/document/getReport')}" class="list-group-item">Get Report</a> 
				</div>
			</div>
			<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="Div1" role="navigation">
                <div class="list-group">
                    <a class="list-group-item active">Contact Us</a>
                    <a class="list-group-item">
                        <br />
                        020 - 2431 4661
                        <br />
                        020 - 2433 7313 </a>
                    <a class="list-group-item active">Working Hours</a>
                    <a class="list-group-item">7:00 AM to 7:00 PM<br />
                        Holidays:<br />
                        Republic Day, Independence Day</a>

                </div>
            </div>
          
            <!--/span-->
        </div>
        <!--/row-->

        <hr>

        <footer>
            <p>&copy; Company 2013</p>
        </footer>

    </div>
    <!--/.container-->

</body>
</html>
