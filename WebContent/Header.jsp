<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<header>
	<fmt:setBundle basename="MessageResources" var="msg" scope="page"/>
	<div id="header">
		<h1>Dr. Paul's Path Labs</h1>
		<div id="hdLeft">
			<a href="index.jsp?locale=eng"><img src="images/eng.png" class="flags" id="eng"></a>
			<a href="index.jsp?locale=frn"><img src="images/frn.png" class="flags" id="frn"></a>
			<a href="index.jsp?locale=esp"><img src="images/esp.png" class="flags" id="esp"></a>
		</div>
		<div id="hdRight">
			<nav>
				<ul>
				<li><a href="patient.jsp">Patient</a></li>
				<li><a href="doctor.jsp">Doctor</a></li>
				<li><a href="lab_tests.jsp">Lab Tests</a></li>
				<li><a href="help.jsp">Help</a></li>
				</ul>
			</nav>
		</div>
	</div>
	</header>
</body>
</html>