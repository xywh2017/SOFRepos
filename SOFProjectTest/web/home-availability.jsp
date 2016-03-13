 <%@page import="CSP600.LecturerBean"%>
 <%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
           %>
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

                                                                <%= currentUser.getLecturerFullname() %>
                                                             </p>
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
								<li><a href="home-profile.jsp" id="portfolio-link" class="skel-layers-ignoreHref"><span class="icon fa-user">Edit Profile</span></a></li>
								<li><a href="home-availability.jsp" id="about-link" class="skel-layers-ignoreHref"><span class="icon fa-th">Availability</span></a></li>
								<li><a href="#contact" id="contact-link" class="skel-layers-ignoreHref"><span class="icon fa-envelope">Contact</span></a></li>
							</ul>
						</nav>

				</div>

				<div class="bottom">

					<!-- Social Icons -->
						<ul class="icons">
							<li><a href="lecturerLogoutServlet" class="icon fa-sign-out"><span class="label">Logout</span></a></li>
						</ul>

				</div>

			</div>

		<!-- Main -->
			<div id="main">

					<section id="about" class="three">
						<div class="container">

							<header>
								<h2>Availability</h2>
							</header>

							<p><a href="addAvailability.jsp"><button type="submit" class="button" style="background-color:#EF3B3A">Check availability</button></a>

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