<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>

<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Login form</title>
    
    
    <link rel="stylesheet" href="css/reset.css">

    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Montserrat:400,700'>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="css/style.css">

    
    
    
  </head>

  <body>
      
<p id="demo"></p>


  
<div class="container">
  <div class="info">
    <h1>Login Form</h1><span>CSP 600 Progress Presentation Schedule</a></span>
  </div>
</div>
<div class="form">
    <div class="thumbnail"><img src="images/schedule_icon.png"/></div>
    <form action="lecturerLogin" class="register-form">
    <input type="text" name="lecturerID" placeholder="Lecturer ID"/>
    <input type="password" name="lecturerPassword" placeholder="Password"/>
    <button>Login</button>
    <p class="message">An admin? | <a href="#">Click here</a></p>
    <p class="message">New user | <a href="registerLecturer.jsp">Register here</a></p>
  </form>
  <form action="adminLogin" class="login-form">
    <input type="text" name="adminid" placeholder="Admin ID"/>
    <input type="password" name="adminpassword" placeholder="Password"/>
    <button>Login</button>
    <p class="message">Not an admin? | <a href="#">Login here</a></p>
  </form>
</div>
<video id="video" autoplay="autoplay" loop="loop" poster="polina.jpg">
  <source src="http://andytran.me/A%20peaceful%20nature%20timelapse%20video.mp4" type="video/mp4"/>
</video>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

    
    
    
  </body>
</html>

