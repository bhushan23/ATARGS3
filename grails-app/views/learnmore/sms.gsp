!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'carousel.css')}" type="text/css">
<script src="${resource(dir: 'js', file: 'holder.js')}">
	
</script>
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
<r:layoutResources />
<title>Appointment by SMS</title>


</head>



<body>

<div class="container">

      <hr class="featurette-divider">

<div class="hero-unit">
 <legend> <h1>  Appointment By SMS</h1></legend>
</div>
      <div class="row featurette">
     
        <div class="col-md-9">
          <h2 class="featurette-heading">Available Appointment of a day<br><span class="text-muted"><br>PDS 2014-01-25 CT</span></h2>
          <p class="lead"> Above example search and suggests available appointments of <b>CT machine for 25th January 2014 </b><br><br>Type <b>PDS YYYY-MM-DD MACHINE{MRI OR CT}</b> and send SMS to 56263456</p>
        </div>
        <div class="col-md-3">
          <img class="featurette-image img-responsive" src='${resource(dir: "images", file: "inputdate.jpg")}' alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-3">
          <img class="featurette-image img-responsive" src='${resource(dir: "images", file: "reply.png")}' alt="Generic placeholder image">
        </div>
        <div class="col-md-9">
          <h2 class="featurette-heading">Get Available Appointments</h2>
          <p class="lead">You will receive List of available appointments of a date you messaged earlier</p>
        </div>
      </div>

<hr class="featurette-divider">

      <div class="row featurette">
     
        <div class="col-md-9">
          <h2 class="featurette-heading">Confirm Appointment by SMS<br><span class="text-muted">Reply Accordingly<br> PDS 1 <br>PDS 2<br>PDS 3</span></h2>
          <p class="lead"> Confirm Your Appointments by replying <br>Refer Suggested Date and Time</p>
        </div>
        <div class="col-md-3">
          <img class="featurette-image img-responsive" src='${resource(dir: "images", file: "replyconfirm.jpg")}' alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-3">
          <img class="featurette-image img-responsive" src='${resource(dir: "images", file: "can.jpg")}' alt="Generic placeholder image">
        </div>
        <div class="col-md-9">
          <h2 class="featurette-heading">Cancel Appointments<span class="text-muted"><br>PDS CAN</span></h2>
          <p class="lead">Cancel Your Appointment By Messaging PDS CAN</p>
        </div>
      </div>
      <hr class="featurette-divider">

    

    </div><!-- /.container -->


</body>
</html>
