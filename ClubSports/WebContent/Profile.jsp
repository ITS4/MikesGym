<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/global.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>profile..............</title>
<script>
	$(document).ready(function() {
		$("button").click(function() {
			$("#div1").fadeIn();
			$("#div2").fadeIn("slow");
			$("#div3").fadeIn(3000);
		});
	});
</script>
</head>
<p>
	<c:forEach var="member" items="${profileList}">

		<body>
			<header>
			<div class="wrapper">
				<a href="#"><img src="img/Logo.jpg" alt="mysquare logo"
					title="mysquare - checkin and go home!" /></a> <span id="usernav"><a
					href="#">Logout</a> - <a href="#">Settings</a> - <a href="#">My
						Profile<span><img src="img/user_avatar_s.jpg" /></span>
				</a></span>
			</div>
			</header>



			<div id="content" class="clearfix">
				<section id="left">
				<div id="userStats" class="clearfix">
					<div class="pic">
						<a href="#"><img src="img/user_avatar.jpg" width="150"
							height="150" /></a>
					</div>

					<div class="data">

						<h1>${member.firstName}${member.lastName}</h1>
						<h3>
							<td>${member.address},${member.town},${member.county}
						</h3>
						<h4>
							<a href="http://spyrestudios.com/">something!!!</a>
						</h4>
						<div class="socialMediaLinks">
							<a href="http://twitter.com/jakerocheleau" rel="me"
								target="_blank"><img src="img/twitter.png"
								alt="@jakerocheleau" /></a> <a
								href="http://gowalla.com/users/JakeRocheleau" rel="me"
								target="_blank"><img src="img/gowalla.png" /></a>
						</div>
						<div class="sep"></div>
						<ul class="numbers clearfix">
							<li>Reputation<strong>185</strong></li>
							<li>Checkins<strong>200</strong></li>
							<li class="nobrdr">Days missed<strong>127</strong></li>
						</ul>
					</div>
				</div>

				<h1>About Me:</h1>

				<tr>
					<td>${member.memId}</td>
					<td>${member.email}</td>
					<td>${member.firstName}</td>
					<td>${member.lastName}</td>

					<td>${member.mobile}</td>
					<td>${member.title}</td>
					<td>${member.startDate}</td>
					<td>${member.endDate}</td>
					<td>${member.dob}</td>
				</tr>
				<p>Lorem ipsum dolor sit amet, ${member.firstName}
					${member.lastName}consectetur adipisicing elit, sed do eiusmod
					tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
					minim veniam, quis nostrud exercitation ullamco laboris nisi ut
					aliquip ex ea commodo consequat. Duis aute irure dolor in
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum.</p>
				<div id="div1"
					style="width: 80px; height: 80px; display: none; background-color: red;"></div>
				<br>
				<div id="div2"
					style="width: 80px; height: 80px; display: none; background-color: green;"></div>
				<br>
				<div id="div3"
					style="width: 80px; height: 80px; display: none; background-color: blue;"></div>


				</section>

				<section id="right">
				<div class="gcontent">
					<div class="head">
						<h1>Payment Status</h1>
					</div>
					<div class="boxy">


						<div class="badgeCount">
						<p>You owe "this" EURO!</p>
						<p><a href="#" class=button-link>Pay now with paypal!</a></p>

					</div>
				</div>

				<div class="gcontent">
					<div class="head">
						<h1>Friends List</h1>
					</div>
					<div class="boxy">
						<p>Your friends - 106 total</p>

						<div class="friendslist clearfix">
							<div class="friend">
								<a href="#"><img src="img/friend_avatar_default.jpg"
									width="30" height="30" alt="Jerry K." /></a><span class="friendly"><a
									href="#">Jerry K.</a></span>
							</div>

							<div class="friend">
								<a href="#"><img src="img/friend_avatar_default.jpg"
									width="30" height="30" alt="Katie F." /></a><span class="friendly"><a
									href="#">Katie F.</a></span>
							</div>

							<div class="friend">
								<a href="#"><img src="img/friend_avatar_default.jpg"
									width="30" height="30" alt="Ash K." /></a><span class="friendly"><a
									href="#">Ash K.</a></span>
							</div>

							<div class="friend">
								<a href="#"><img src="img/friend_avatar_default.jpg"
									width="30" height="30" alt="Sponge B." /></a><span
									class="friendly"><a href="#">Sponge B.</a></span>
							</div>

							<div class="friend">
								<a href="#"><img src="img/friend_avatar_default.jpg"
									width="30" height="30" alt="Frank" /></a><span class="friendly"><a
									href="#">Frank</a></span>
							</div>

							<div class="friend">
								<a href="#"><img src="img/friend_avatar_default.jpg"
									width="30" height="30" alt="Alexa S." /></a><span class="friendly"><a
									href="#">Alexa S.</a></span>
							</div>
						</div>

						<span><a href="#">See all...</a></span>
					</div>
				</div>
				</section>
			</div>
		</body>
	</c:forEach>
</html>

</body>
</html>