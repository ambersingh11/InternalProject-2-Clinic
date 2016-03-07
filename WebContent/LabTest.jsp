<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Lab Test</title>
<link type="text/css" href="css/myStyles.css" rel="stylesheet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<div id="hdtop">
<h2>Dr.Paul's Path Lab</h2>

</div>
<div class="raj">
<h3>Lab Code : <c:out value="${sessionScope.labCode}"/></h3>
</div>
<hr/>
<div id="navmid">
<ul>
		<li><a href="home.html"><span style ="padding-left:5px">home</span></a></li>
		<li><a href="create.html">Create Test Order</a></li>
		<li><a href="add.html">Add Test Results</a></li>
		<li><a href="view.html">View Test Report</a></li>
		
		</ul>
</div>
<div id="content">

	<table>
		<tr>
			<td>Order no.</td>
			<td><input type="text" name="orderno" id="orderid"></td>
			<td>Collection Date</td>
			<td><input type="date" name="coldate" /></td>
			<td>Collection Type</td>
			<td><input type="radio" name="coltype">Lab <input type="radio" name="coltype">Home</td>
		</tr>
		<tr>
			<td>Patient Code</td>
			<td><input type="text" name="patientcode" id="patcode"></td>
			<td>Patient Name</td>
			<td><input type="text" name="patientname" id="patname"></td>
			<td>Age</td>
			<td><input type="text" name="age" id="patage"></td>
		</tr>
		<tr>
			<td>HandPhone</td>
			<td><input type="text" name="handphone" id="patphone"></td>
			<td>Email</td>
			<td><input type="text" name="email" id="patmail"></td>
			<td>Gender</td>
			<td><input type="radio" name="gender" id="male">Male <input type="radio" name="gender" id="female">Female</td>
		</tr>
		<tr>
			<td>Doctor Code</td>
			<td><input type="text" name="doctorcode" id="docCode"></td>
			<td colspan="2">Doctor Name</td>
			<td colspan ="2"><input type="text" name="doctorname" id="docName"></td>
			
		</tr>
	</table>

</div>
<div id="content2">
	<table id="table2">
		<tr>
			<td>Test Code</td>
			<td>Test name</td>
			<td>Amount</td>
		</tr>
		<tr>
			<td>Total</td>
			<td colspan="2" id="total"></td>
		</tr>
	</table>
</div>
<div id="content3">
	<input type="button" id="add" value="Add Test" onClick="addTest()">
	<input type="submit" id="sub" value="Confirm Tests" >
</div>
<hr/>
<div id="ftbottom">
<h6>Contact Administrator</h6>
</div>

</body>
<script src="scripts/LabTestScript.js"></script> 
</html>

