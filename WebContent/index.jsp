<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clinical Lab</title>
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

</head>

<body>
<fmt:setBundle basename="MessageResources" var="msg" scope="page"/>
<fmt:setLocale value="${param.locale}"/>
<%@ include file="Header.jsp" %>
<section>
	<form method="post" id="frm" action="">
	<table id="login">
		<tr>
			<td><label><fmt:message key="forms.label.userName" bundle="${msg}"/></label></td>
			<td><input type="text" name="userName" id="userName" placeholder="UserName" onblur="loadForm()"></td>
		</tr>
		<tr>
			<td><label><fmt:message key="forms.label.labCode" bundle="${msg}"/></label></td>
			<td><input type="text" name="labCode" id="labCode" placeholder="Lab Code" ></td>
		</tr>
		<tr>
			<td><label><fmt:message key="forms.label.passWord" bundle="${msg}"/></label></td>
			<td><input type="password" name="passWord" id="passWord"placeholder="Password"></td>
		</tr>
		<tr>
			<td><label><fmt:message key="forms.label.role" bundle="${msg}"/></label></td>
			<td>
				<select name="role" id="role">
					<option value="ADM">Administrator</option>
					<option value="MGR">Manager</option>
					<option value="LABTCH">Lab Technician</option>
					<option value="OPTR">Operator</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" name="login" id="sub" value="<fmt:message key='forms.label.submit' bundle="${msg}"/>" ></td>
		</tr>
	</table>
	</form> 

</section>
<%@ include file="Footer.jsp" %>

</body>
<script type="text/javascript">
(function(){
	//alert("self executing");
	document.getElementById("sub").addEventListener("click", function(event){
		
		//alert("inside validate: passWord="+passWord);
		if(document.getElementById("passWord").value==passWord)
			document.getElementById("frm").setAttribute("action", "Login.jsp");
		else{
			alert("invalid credentials");
			event.preventDefault();
		}
	});
})();

var passWord;
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
			  var jsonObj = JSON.parse(xhttp.responseText); 
		      document.getElementById("labCode").value = jsonObj.labCode;
		      document.getElementById("role").value = jsonObj.role;
		      passWord=jsonObj.passWord;
		      
		  }
		};
	xhttp.open("POST","EmpValidate",true);
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xhttp.send("userName="+document.getElementById("userName").value);
}

		


</script>
</html>