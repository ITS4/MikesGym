<!DOCTYPE html>
<html>

<head>
<title>Login</title>


<link href="css/MainStyle.css" rel="stylesheet" type="text/css" />


<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
</head>
<div class="container">
	<body>

		<section class="loginform cf">
			<form name="Existinglogin" action="LoginController" method="post"
				accept-charset="utf-8">
				<h1>Login Screen</h1>
				<ul>
					<li><label for="email">Email</label> <input type="email"
						name="email" placeholder="yourname@email.com">
					<li><label for="password">Password</label> <input
						type="password" name="password" placeholder="password">
					<li><input type="submit" value="Login"></li>
				</ul>
			</form>
		</section>

	</body>
</div>
</html>

