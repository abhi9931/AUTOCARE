<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
#left{
display: inline-block;
margin-left: 0px;
padding-right: 65%;
}
#right{
/* padding-left : 65%; */
display: inline-block;
margin-right: 0px;
}
</style>
</head>
<div id="left">
	<font color="red" size=12px>Autocare</font>
</div>
<div id="right">
	<c:import url="mymenu.jsp" />
</div>
</html>