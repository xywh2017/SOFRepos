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
                                                                  UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");
                                                            %>
			
                                                            <%= currentUser.getAdminName()%></p>
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
								<li><a href="home.jsp" id="top-link" class="skel-layers-ignoreHref"><span class="icon fa-home">Home</span></a></li>
								<li><a href="home-lecturer.jsp" id="portfolio-link" class="skel-layers-ignoreHref"><span class="icon fa-user">Lecturer</span></a></li>
								<li><a href="home-presentation.jsp" id="about-link" class="skel-layers-ignoreHref"><span class="icon fa-th">Presentation</span></a></li>
								<li><a href="#contact" id="contact-link" class="skel-layers-ignoreHref"><span class="icon fa-envelope">Contact</span></a></li>
							</ul>
						</nav>

				</div>

				<div class="bottom">

					<!-- Social Icons -->
						<ul class="icons">
							<!--<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
							<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>-->
							<li><a href="adminLogoutServlet" class="icon fa-sign-out"><span class="label">Logout</span></a></li>
						</ul>

				</div>

			</div>

		<!-- Main -->
			<div id="main">
                            
				<!-- About Me-->
					<section id="about" class="three">
						<div class="container">

							<header>
								<h2>Manage Presentation</h2>
							</header>

							<p><a href="addPresentation.jsp"><button type="submit" class="button" style="background-color:#EF3B3A">Create</button></a>
                                                        <a href="updatePresentation.jsp"><button type="submit" class="button" style="background-color:#EF3B3A">Update</button></a>
                                                            <a href="deletePresentation.jsp"><button type="submit" class="button" style="background-color:#EF3B3A">Remove</button></a></p>

						</div>
					</section>

				
			</div>
                
		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollzer.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>