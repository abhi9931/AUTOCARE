<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Auto Service</title>
<style type="text/css">
.tabContainer {
	position: absolute;
	top: 20%;
	/* overflow: hidden; 
  border: 1px solid #ccc;
  background-color: #f1f1f1;*/
  width: 76.68%; 
}
.tabContainer .buttonContainer{
height: 10%;
}
.tabContainer .buttonContainer button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
 /*  padding: 10px; */
  transition: 0.3s;
  font-size: 17px;
  width: 10%;
  height: 100%;
  font-family: sans-serif;
  font-size: 15px;
  background-color: #eee;
}
.tabContainer .buttonContainer button:hover {
  background-color: #ddd;
}
.tabContainer .tabPanel{
height: 60%;
background-color: gray;
color: white;
text-align: center;
/* padding-top: 105px;
padding: 10px; */
box-sizing: border-box;
font-family: sans-serif;
font-size: 20px;
display: none;
}
.title{
position: absolute;
	top: 10%;
font-family: sans-serif;
color: aqua;
padding-left: 35%;
text-align: center;
}
 .prev-next{
float: right;
padding: 20px;
} 
 .prev-next button{
 font-family: sans-serif;
 font-size: 20px;
 background-color: golden-rod;
 }
 .table-row{
 float: left;
 }
</style>
</head>
<body style="padding: 20px">
 <h2 class="title">Worksheet Items</h2>
	<div class="tabContainer">
	<div class="buttonContainer">
		<button class="tablinks" onclick="showPanel(0, '#f44336')">Brake</button>
		<button class="tablinks" onclick="showPanel(1, '#f44336')">Engine-Tune</button>
		<button class="tablinks" onclick="showPanel(2, '#f44336')">Emission</button>
		<button class="tablinks" onclick="showPanel(3, '#f44336')">Exhaust</button>
		<button class="tablinks" onclick="showPanel(4, '#f44336')">Interior</button>
		<button class="tablinks" onclick="showPanel(5, '#f44336')">Light</button>
		<button class="tablinks" onclick="showPanel(6, '#f44336')">Suspension</button>
		<button class="tablinks" onclick="showPanel(7, '#f44336')">Road-Test</button>
		<button class="tablinks" onclick="showPanel(8, '#f44336')">Under-Body</button>
		<button class="tablinks" onclick="showPanel(9, '#f44336')">Under-Hornest</button>
		</div>
	

	<div id="Brake" class="tabPanel">
		<c:import url="WorksheetItems/Brake.jsp"/>
	</div>

	<div id="Engine-Tune" class="tabPanel">
		<c:import url="WorksheetItems/Engine-Tune.jsp"/>
	</div>

	<div id="Emission" class="tabPanel">
		<c:import url="WorksheetItems/Emission.jsp"/>
	</div>

	<div id="Exhaust" class="tabPanel">
		<c:import url="WorksheetItems/Exhaust.jsp"/>
	</div>

	<div id="Interior" class="tabPanel">
		<c:import url="WorksheetItems/Interior.jsp"/>
	</div>

	<div id="Light" class="tabPanel">
		<c:import url="WorksheetItems/Light.jsp"/>
	</div>
	
	<div id="Suspension" class="tabPanel">
		<c:import url="WorksheetItems/Suspension.jsp"/>
	</div>
	
	<div id="Road-Test" class="tabPanel">
		<c:import url="WorksheetItems/Road-Test.jsp"/>
	</div>
	
	<div id="Under-Body" class="tabPanel">
		<c:import url="WorksheetItems/Under-Body.jsp"/>
	</div>
	
	<div id="Under-Hornest" class="tabPanel">
		<c:import url="WorksheetItems/Under-Hornest.jsp"/>
	</div>
	<div class="prev-next">
	<button class="prev-tab" onclick="previous()">Previous</button>
	<button class="next-tab" onclick="next()">Next</button>
	</div>
	</div>
	<script>
	var tabButtons=document.querySelectorAll(" .tabContainer .buttonContainer button ");
	var tabPanels=document.querySelectorAll(" .tabContainer .tabPanel "); 
	var tabIndex=0;
	
	/* location.reload(true); */
	
	function showPanel(panelIndex, colorCode){
		tabButtons.forEach(
				function(node){
			node.style.backgroundColor="";
			node.style.color="";
			tabIndex=panelIndex;			
		}
				);
		tabButtons[panelIndex].style.backgroundColor=colorCode;
		tabButtons[panelIndex].style.color="white";
		tabPanels.forEach(
				function(node){
			node.style.display="none";
		}
				);
		tabPanels[panelIndex].style.display="block";
		tabPanels[panelIndex].style.backgroundColor=colorCode;
	}
	showPanel(0, '#f44336');
	
	function next(){
		if(tabIndex < tabPanels.length-1){
			showPanel(tabIndex+1, '#f44336');			
		}
	}	
	
	function previous(){
		if(tabIndex > 0){
			showPanel(tabIndex-1, '#f44336');			
		}
	}
	/*
 function openCurrent(evt, cityName) {
  var i, tabPanel, tablinks;
  tabPanel = document.getElementsByClassName("tabPanel");
  for (i = 0; i < tabPanel.length; i++) {
    tabPanel[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}
document.getElementById("defaultOpen").click(); */
</script>
</body>
</html>