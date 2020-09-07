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
input {
	font-weight: bold;
}

td {
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Worksheet Item</h2>
		<table align="left" >

			<tr>
				<td>Brake :</td>
				<td><select name="brake" >
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Oil :</td>
				<td><select name="oil">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Lube :</td>
				<td><select name="lube">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Filter :</td>
				<td><select name="filter">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			</tr>
			
			<tr>
				<td>Fluid Level :</td>
				<td><select name="fluidlevel">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Light :</td>
				<td><select name="light">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
		<td width="10%"></td>
				<td>Battery :</td>
				<td><select name="bat">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Wiper :</td>
				<td><select name="wiper">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			</tr>
			
			<tr>
				<td>Odometer :</td>
				<td><select name="odo">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Under Hood Inspection :</td>
				<td><select name="uhi">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Transmission :</td>
				<td><select name="trans">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Steering :</td>
				<td><select name="steering">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			</tr>
			
			<tr>
				<td>Suspension :</td>
				<td><select name="sus">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Wheel Alignment :</td>
				<td><select name="wa">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Tires :</td>
				<td><select name="tire">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
		<td width="10%"></td>
				<td>Exhaust :</td>
				<td><select name="exh">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			</tr>
			
			<tr>
				<td>Cooling :</td>
				<td><select name="cool">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Charging :</td>
				<td><select name="chg">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Vehicle Diagnostics :</td>
				<td><select name="vd">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Heating :</td>
				<td><select name="heet">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			</tr>
			
			<tr>
				<td>Aircondition :</td>
				<td><select name="ac">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
		<td width="10%"></td>
				<td>Windshield :</td>
				<td><select name="ws">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				<td>Horn :</td>
				<td><select name="horn">
				<option value="RA">RA</option>
				<option value="NA">NA</option>
				<option value="OK">OK</option>
				<option value="DA">DA</option>
				</td>
			<td width="10%"></td>
				
			</tr>
			
<tr height="15"></tr>
			<tr>
				<td align="center" colspan="2"><input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" /> 
					<input
					type="submit" value="Submit"></td><td><input
					type="submit" value="Complete"></td>
					<td><input
					type="submit" value="Lock"></td>
					<td><input
					type="submit" value="Unlock"></td>
					
			</tr>

		</table>
	</div>
</body>
</html>