<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Auto Service</title>
<style type="text/css">
input{
font-weight: bold;
}
td{
font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2 style="margin-top: 0px">Add  Car</h2>
		<table>

			<tr>
				<td>Car Type :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>Car Year :</td>
				<td><input type="date"></td>
			</tr>

			<tr>
				<td>Rego :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>VIN :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>Cylinder :</td>
				<td><input type="number" value="2"></td>
			</tr>

			<tr>
				<td>Model :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>Make :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>Fuel TYpe :</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td align="center" colspan="2"><input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
					type="submit" value="Add"></td>
			</tr>

		</table>
	</div>
</body>
</html>