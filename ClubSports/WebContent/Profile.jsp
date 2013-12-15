<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is your profile..............</title>
</head>
<body>

<h1>This is my Profile</h1>
        <table  class="table table-bordered">
            <tr>
                <th>memId</th>
                <th>email</th>
                <th>first name</th>
                <th>last name</th>
                <th>address</th>
                <th>town</th>
                <th>county</th>
                <th>mobile</th>
                <th>title</th>
                <th>start date</th>
                <th>end date</th>
                <th>dob</th>
               
            </tr>
            <c:forEach var="member" items="${profileList}" >
                <tr>
                    <td>${member.memId}</td>
                    <td>${member.email}</td>
                    <td>${member.firstName}</td>
                    <td>${member.lastName}</td>
                    <td>${member.address}</td>
                    <td>${member.town}</td>
                    <td>${member.county}</td>
                    <td>${member.mobile}</td>
                    <td>${member.title}</td>
                     <td>${member.startDate}</td>
                    <td>${member.endDate}</td>
                    <td>${member.dob}</td>
                     </tr>
            </c:forEach>
       </table>
       
       
</body>
</html>