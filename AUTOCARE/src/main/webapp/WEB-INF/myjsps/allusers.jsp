<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
/* body {
	background-color: lightgray;
}

h2 {
	width: 70%;
}

table, th, td {
	border: 3px solid red;
	border-collapse: collapse;
	text-align: center;
	font-size: 20px;
	font-weight: bold;
	width: 70%;
}

.mytable-head {
	background-color: lightblue;
	width: 150%
}

tr:nth-child(even) {
	background-color: rgb(91, 241, 77);
}

tr:nth-child(odd) {
	background-color: milkwhite;
}

#button {
	font-size: 20px;
	font-weight: bold;
	width: 40%;
	float: right;
}

input[type=submit], [type=button] {
	text-align: center;
	color: red;
	background-color: goldenrod;
	border-radius: 10px;
	font-size: 20px;
	font-weight: bold;
} */
.mytable-head{
border: 2px solid red;
	border-collapse: collapse;
	text-align: center;
	font-weight: bold;
}

 .mytable-column{
border: 1px solid red;
	border-collapse: collapse;
	text-align: center;
	font-weight: bold;
}
</style> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Auto Service</title>
</head>
<body>
	<div>
	<h2>All Users</h2>
	<table align="center">
			<thead class="mytable-head">
				<tr>
				<td class="mytable-column"> Name </td>
					<td class="mytable-column"> Username </td>
					<td class="mytable-column"> Email </td>
					<td class="mytable-column"> Phone </td>
					<td class="mytable-column"> Address </td>
					<td class="mytable-column"> Staff Type </td>
					<td class="mytable-column"> Role </td>  
					 <td class="mytable-column"> Status </td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="users" items="${MyStaff }">
					<tr>
					<td class="mytable-column">${users.name}</td>
						<td class="mytable-column">${users.username}</td>
						<td class="mytable-column">${users.email}</td>
						<td class="mytable-column">${users.phone}</td>
						<td class="mytable-column">${users.address}</td>
						<td class="mytable-column">${users.type}</td>
						<td class="mytable-column">${users.role}</td>
						<c:choose>
						<c:when test="${users.status eq 0 }">
						<td class="mytable-column"> Inactive</td>
						</c:when>
						<c:when test="${users.status eq 1 }">
						<td class="mytable-column"> Active</td>
						</c:when>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>