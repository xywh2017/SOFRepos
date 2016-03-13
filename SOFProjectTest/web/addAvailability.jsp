<%@page import="CSP600.LecturerBean"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="CSP600.UserBean"  %>
<!doctype html>
<%-- 
    Document   : index
    Created on : Feb 4, 2016, 5:21:43 PM
    Author     : user
--%>
<!--
	Prologue by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
                 
		<title>Home</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
                <link rel="stylesheet" href="css/sky-forms.css" type="text/css" />
                <link rel="stylesheet" href="css/sky-forms-red.css" type="text/css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
	</head>
	<body>

		<!-- Header -->
			<div id="header">

				<div class="top">

					<!-- Logo -->
						<div id="logo">
							<span class="image avatar48"><img src="images/UITM.png" alt="" /></span>
							<h1 id="title">Welcome</h1>
							<p><%
                                                                LecturerBean currentUser = (LecturerBean) session.getAttribute("currentSessionUser");
                                                            %>

                                                                <%= currentUser.getLecturerFullname() %></p>
						</div>

					<!-- Nav -->
						<nav id="nav">
							<!--

								Prologue's nav expects links in one of two formats:

								1. Hash link (scrolls to a different section within the page)

								   <li><a href="#foobar" id="foobar-link" class="icon fa-whatever-icon-you-want skel-layers-ignoreHref"><span class="label">Foobar</span></a></li>

								2. Standard link (sends the user to another page/site)

								   <li><a href="http://foobar.tld" id="foobar-link" class="icon fa-whatever-icon-you-want"><span class="label">Foobar</span></a></li>

							-->
							<ul>
								<li><a href="homeLecturer.jsp" id="top-link" class="skel-layers-ignoreHref"><span class="icon fa-home">Home</span></a></li>
								<li><a href="home-profile.jsp" id="portfolio-link" class="skel-layers-ignoreHref"><span class="icon fa-user">Lecturer</span></a></li>
								<li><a href="home-availability.jsp" id="about-link" class="skel-layers-ignoreHref"><span class="icon fa-th">Presentation</span></a></li>
								<li><a href="#contact" id="contact-link" class="skel-layers-ignoreHref"><span class="icon fa-envelope">Contact</span></a></li>
							</ul>
						</nav>

				</div>

				<div class="bottom">

					<!-- Social Icons -->
						<ul class="icons">
							<li><a href="#" class="icon fa-sign-out"><span class="label">Logout</span></a></li>
						</ul>

				</div>

			</div>

		<!-- Main -->
			<div id="main">

				<!-- Intro -->
					

            <form action="availability" class="sky-form">
                <header>Availability Form</header>
                                <center>
				<fieldset>					

					
					<section>
						<label class="checkbox">
                                                    <input type="checkbox" name="checkbox-inline" checked><i></i>Test1 <br>
                                                    
						</label>
					</section>
					
					<section>
						<label class="checkbox">
                                                    <input type="checkbox" name="checkbox-inline" checked><i></i>Test2 <br>
                                                    
						</label>
					</section>
                                        
                                </fieldset>                                        </center>
				
                                    <center><button type="submit" class="button">Add</button></center>
				
           <!--     </form>              
            <form action="addPresentation" class="sky-form">-->
           
           <h1 style="font-size: 20px;"><center><br><br>Other available time not stated above<br><br></center></h1>
                                <center>
									
                                    <fieldset>	                                    
                                    <section>
						<label class="select">
                                                    <table  id="options-table">					
                                                    <tr style="padding: 2px 2px 2px 2px; text-align: center; font-size: 12pt;">
                                                            <td>Day</td>
                                                            <td>Start</td>
                                                            <td>End</td>
                                                            <td>&nbsp;</td>
                                                            <td>&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                    <td><select name="presentationDay" id="" style="width:100%;" >
                                                                                    <option selected disabled >Choose day</option>
                                                                                    <option>Monday</option>
                                                                                    <option>Tuesday</option>
                                                                                    <option>Wednesday</option>
                                                                                    <option>Thursday</option>
                                                                                    <option>Friday</option>
                                                        </select></td>
                                                    <td><input type="time" name="presentationStart" style="padding: 2px 2px 2px 2px; margin-bottom:5px; margin-left:30px;  height:90%; border-color:#e5e5e5; border-width: 2px; border-style: solid; background-color: white;" /></td> 
                                                    <td><input type="time" name="presentationEnd" style="padding: 2px 2px 2px 2px; margin-bottom:5px; margin-left:0px; height:90%; border-color:#e5e5e5; border-width: 2px; border-style: solid; background-color: white;" /></td> 
                                                  <!--  <td><button type="submit" name="submit" class="button" onclick="myFunction()" style="margin-left: 10px; font-size:11pt; text-align:center; width:80%; height:37px;">Add</button></td>-->
                                                    <td><input type="button" class="del" name="action" value="Delete" style="padding: 5px 0px 4px 5px; font-size:12pt; text-align:center; width:100%"/></td>
                                                    
                                                    </tr>                  
                                                    <tr id="test">
                                                    <td><select name="presentationDay" id="" style="width:100%;"> 
                                                                                    <option selected disabled >Choose day</option>
                                                                                    <option>Monday</option>
                                                                                    <option>Tuesday</option>
                                                                                    <option>Wednesday</option>
                                                                                    <option>Thursday</option>
                                                                                    <option>Friday</option>
                                                        </select></td>
                                                    <td><input type="time"   name="presentationStart" style="padding: 2px 2px 2px 2px; margin-bottom:5px; margin-left:30px;  height:90%; border-color:#e5e5e5; border-width: 2px; border-style: solid; background-color: white;"/></td>
                                                    <td><input type="time"   name="presentationEnd" style="padding: 2px 2px 2px 2px; margin-bottom:5px; margin-left:0px; height:90%; border-color:#e5e5e5; border-width: 2px; border-style: solid; background-color: white;" /></td>
                                                  <!--  <td><button type="submit" name="submit" class="button" onclick="myFunction()" style="margin-left: 10px; font-size:11pt; text-align:center; width:80%; height:37px;">Add</button></td>-->
                                                    <td><input type="button" class="add" name="action" value="Add More" style="padding: 5px 0px 4px 5px; font-size:12pt; text-align:center; width:100%"></td>
                                            
                                                    </tr>
                                                    </table>
                                                    

						</label>
					</section>
					
					
                                    </fieldset>
			
                                    </center>
				<footer>
                                  <center><button type="submit" name="submit" class="button">Add</button></center>
				</footer>
               </form> 
						<!--<label class="input">
							<i class="icon-append icon-lock"></i>
							<input type="password" placeholder="Confirm password">
							<b class="tooltip tooltip-bottom-right">Lecturer's first name</b>
						</label>-->
					
				
					
				<!--<fieldset>
					<div class="row">
						<section class="col col-6">
							<label class="input">
								<input type="text" placeholder="First name">
							</label>
						</section>
						<section class="col col-6">
							<label class="input">
								<input type="text" placeholder="Last name">
							</label>
						</section>
					</div>
					
					<section>
						<label class="select">
							<select>
								<option value="0" selected disabled>Gender</option>
								<option value="1">Male</option>
								<option value="2">Female</option>
								<option value="3">Other</option>
							</select>
							<i></i>
						</label>
					</section>
					
					<section>
						<label class="checkbox" style="text-align:left"><input type="checkbox" name="checkbox"><i></i>I agree to the Terms of Service</label>
						<label class="checkbox" style="text-align:left"><input type="checkbox" name="checkbox"><i></i>I want to receive news and  special offers</label>
					</section>
				</fieldset>-->

                            
               
        
        
    	<div class="clear"></div>
    
							<!--<footer>
								<!--<a href="#portfolio" class="button scrolly">Magna Aliquam</a>-->
                                                      <!--  </footer>-->
					

				<!-- Portfolio 
					<section id="portfolio" class="two">
						<div class="container">

							<header>
								<h2>Portfolio</h2>
							</header>

							<p>Vitae natoque dictum etiam semper magnis enim feugiat convallis convallis
							egestas rhoncus ridiculus in quis risus amet curabitur tempor orci penatibus.
							Tellus erat mauris ipsum fermentum etiam vivamus eget. Nunc nibh morbi quis
							fusce hendrerit lacus ridiculus.</p>

							<div class="row">
								<div class="4u 12u(mobile)">
									<article class="item">
										<a href="#" class="image fit"><img src="images/pic02.jpg" alt="" /></a>
										<header>
											<h3>Ipsum Feugiat</h3>
										</header>
									</article>
									<article class="item">
										<a href="#" class="image fit"><img src="images/pic03.jpg" alt="" /></a>
										<header>
											<h3>Rhoncus Semper</h3>
										</header>
									</article>
								</div>
								<div class="4u 12u(mobile)">
									<article class="item">
										<a href="#" class="image fit"><img src="images/pic04.jpg" alt="" /></a>
										<header>
											<h3>Magna Nullam</h3>
										</header>
									</article>
									<article class="item">
										<a href="#" class="image fit"><img src="images/pic05.jpg" alt="" /></a>
										<header>
											<h3>Natoque Vitae</h3>
										</header>
									</article>
								</div>
								<div class="4u 12u(mobile)">
									<article class="item">
										<a href="#" class="image fit"><img src="images/pic06.jpg" alt="" /></a>
										<header>
											<h3>Dolor Penatibus</h3>
										</header>
									</article>
									<article class="item">
										<a href="#" class="image fit"><img src="images/pic07.jpg" alt="" /></a>
										<header>
											<h3>Orci Convallis</h3>
										</header>
									</article>
								</div>
							</div>

						</div>
					</section>

				<!-- About Me 
					<section id="about" class="three">
						<div class="container">

							<header>
								<h2>About Me</h2>
							</header>

							<a href="#" class="image featured"><img src="images/pic08.jpg" alt="" /></a>

							<p>Tincidunt eu elit diam magnis pretium accumsan etiam id urna. Ridiculus
							ultricies curae quis et rhoncus velit. Lobortis elementum aliquet nec vitae
							laoreet eget cubilia quam non etiam odio tincidunt montes. Elementum sem
							parturient nulla quam placerat viverra mauris non cum elit tempus ullamcorper
							dolor. Libero rutrum ut lacinia donec curae mus vel quisque sociis nec
							ornare iaculis.</p>

						</div>
					</section>

				<!-- Contact --
					<section id="contact" class="four">
						<div class="container">

							<header>
								<h2>Contact</h2>
							</header>

							<p>Elementum sem parturient nulla quam placerat viverra
							mauris non cum elit tempus ullamcorper dolor. Libero rutrum ut lacinia
							donec curae mus. Eleifend id porttitor ac ultricies lobortis sem nunc
							orci ridiculus faucibus a consectetur. Porttitor curae mauris urna mi dolor.</p>

							<form method="post" action="#">
								<div class="row">
									<div class="6u 12u(mobile)"><input type="text" name="name" placeholder="Name" /></div>
									<div class="6u 12u(mobile)"><input type="text" name="email" placeholder="Email" /></div>
									<div class="12u">
										<textarea name="message" placeholder="Message"></textarea>
									</div>
									<div class="12u">
										<input type="submit" value="Send Message" />
									</div>
								</div>
							</form>

						</div>
					</section>

			</div>

		<!-- Footer 
			<div id="footer">

				<!-- Copyright --
					<ul class="copyright">
						<li>&copy; Made with <3. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
					</ul>

			</div>-->

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollzer.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>
                        <script src="assets/js/jquery-1.7.min.js"></script>
                        <script src="assets/js/addrow.js"></script>

	</body>
</html>