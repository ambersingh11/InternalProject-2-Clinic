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
