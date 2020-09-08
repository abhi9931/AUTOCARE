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
select{
width: 100%;
}
</style>
</head>
<body>
	<div align="center">
		<h2 style="margin-top: 0px">Book Service</h2>
		<table>

			<tr>
				<td>Customer : </td>
				<td><select name="customer" >
				<option value="Nishant">Nishant</option>
				<option value="Vaishnavi">Vaishnavi</option>
				<option value="Pavan">Pavan</option>
				</td>
			</tr>

			<tr>
				<td>Car : </td>
				<td><select name="car" >
				<option value="Sedan">Sedan</option>
				<option value="Sports Car">Sports Car</option>
				<option value="Minivan">Minivan</option>
				<option value="Bike">Bike</option>
				</td>
			</tr>

			<tr>
				<td>Service :</td>
				<td><select name="service" >
				<option value="Gold Service">Gold Service</option>
				<option value="Silver Service">Silver Service</option>
				</td>
			</tr>

			<tr>
				<td align="center" colspan="2"><input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
					type="submit" value="Book"></td>
			</tr>

		</table>
	</div>
</body>
</html>