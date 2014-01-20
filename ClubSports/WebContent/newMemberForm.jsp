<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Member Sign up</title>
 <link href="css/Style.css" rel="stylesheet" type="text/css" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>

</head>
<body>
<div>
	<div class="container">
		<section class="NewMember">
		<form name="NewMember" id="NewMember" action="NewMemberController"
			method="post" accept-charset="utf-8">
			<table border="0">
				<tbody>



					<tr>
						<td><label for="email">Email:</label></td>
						<td><input id="email" maxlength="45" name="email" type="text" /></td>
					</tr>

					<tr>
						<td><label for="password">Password:</label></td>
						<td><input id="password" maxlength="45" name="password"
							type="password" /></td>
					</tr>

					<tr>
						<td><label for="firstName">First Name:</label></td>
						<td><input id="firstName" maxlength="45" name="firstName"
							type="text" /></td>
					</tr>

					<tr>
						<td><label for="lastName">Last Name: </label></td>
						<td><input id="lastName" maxlength="45" name="lastName"
							type="text" /></td>
					</tr>

					<tr>
						<td><label for="address">Address:</label></td>
						<td><input id="address" maxlength="45" name="address"
							type="text" /></td>
					</tr>

					<tr>
						<td><label for="town">Town:</label></td>
						<td><input id="town" maxlength="45" name="town" type="text" />
						</td>
					</tr>

					<tr>
						<td><label for="county">County:</label></td>
						<td><input id="county" maxlength="45" name="county"
							type="text" /></td>
					</tr>
					<tr>
						<td><label for="mobile">Phone Number:</label></td>
						<td><input id="mobile" maxlength="45" name="mobile"
							type="text" /></td>
					</tr>
					<tr>
						<td><label for="title">Title:</label></td>
						<td><input id="title" maxlength="45" name="title" type="text" /></td>
					</tr>
					<tr>
						<td><label for="dob">Date of Birth </label></td>
						<td><input id="dob" maxlength="45" name="dob" type="text" />
						</td>
					</tr>
					<tr>
						<td><label for="startDate">Start Date: </label></td>
						<td><input id="startDate" maxlength="45" name="startDate"
							type="text" /></td>
					</tr>

					<tr>
						<td align="right"><input name="Submit" type="submit"
							value="Submit" /></td>
					</tr>

				</tbody>
			</table>




		</form>
	</section>
	</div>
</div>	
	
	<script>
$('#NewUser').submit(function() {
  alert('email sctipt later on');
  return true;
});
</script>
	
</body>
</html>
