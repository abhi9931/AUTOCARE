<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<style type="text/css">
table , th, td{
border: 1px solid red;
	border-collapse: collapse;
	text-align: center;
	font-weight: bold;
}
</style>
</head>
<body>
<table width="100%" height="100%">
<tr height="5%">
<td colspan="3" bgcolor="lightblue" align="center">
<tiles:insertAttribute name="HEADER"/>
</td>
</tr>
<tr height="85%">
<td width="20%" bgcolor="#c3d599" align="left">
<tiles:insertAttribute name="LMENU"/>
</td>
<td width="80%" bgcolor="#c3a599" align="justify">
<tiles:insertAttribute name="BODY"/>
<%-- </td>
<td width="20%" bgcolor="#c3d599" align="right">
<tiles:insertAttribute name="RMENU"/>
</td> --%>
</tr>
<tr height="10%">
<td colspan="3" bgcolor="green" align="center">
<tiles:insertAttribute name="FOOTER"/>
</td>
</tr>
</table>
</body>
</html>