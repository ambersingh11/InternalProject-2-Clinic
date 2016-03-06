<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clinical Lab</title>
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script type="text/javascript">
function loadForm() {  
	//alert("in onLoadForm");
	var xhttp=false;


	if(window.XMLHttpRequest)
	{
		xhttp=new XMLHttpRequest();
	}
	else if(window.ActiveXObject) {

	   xhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xhttp.onreadystatechange = function() {
		  if (xhttp.readyState == 4 && xhttp.status == 200) {
			  
		    document.getElementById("labCode").value = xhttp.responseText;
		  }
		};
	xhttp.open("POST","Validate",true);
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xhttp.send("labCode="+document.getElementById("userName").value);
}

</script>
</head>

<body>
<fmt:setBundle basename="MessageResources" var="msg" scope="page"/>
<fmt:setLocale value="${param.locale}"/>
<%@ include file="Header.jsp" %>
<section>
	<form action="#" method="post">
	<table id="login">
		<tr>
			<td><label><fmt:message key="forms.label.userName" bundle="${msg}"/></label></td>
			<td><input type="text" name="userName" id="userName" placeholder="UserName"></td>
		</tr>
		<tr>
			<td><label><fmt:message key="forms.label.labCode" bundle="${msg}"/></label></td>
			<td><input type="text" name="labCode" id="labCode" placeholder="Lab Code" onblur="loadForm()"></td>
		</tr>
		<tr>
			<td><label><fmt:message key="forms.label.passWord" bundle="${msg}"/></label></td>
			<td><input type="password" name="passWord" placeholder="Password"></td>
		</tr>
		<tr>
			<td><label><fmt:message key="forms.label.role" bundle="${msg}"/></label></td>
			<td>
				<select name="role">
					<option value="ADM">Administrator</option>
					<option value="MGR">Manager</option>
					<option value="LABTCH">Lab Technician</option>
					<option value="OPTR">Operator</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" name="login" value="<fmt:message key='forms.label.submit' bundle="${msg}"/>" ></td>
		</tr>
	</table>
	</form> 

</section>
<%@ include file="Footer.jsp" %>

</body>
</html>