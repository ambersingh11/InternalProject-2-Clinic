(function(){
		
		document.getElementById("patcode").addEventListener("blur", ajaxCall);
		document.getElementById("docCode").addEventListener("blur", ajaxCall2);
		xhttp=false;
		if(window.XMLHttpRequest)
		{
			xhttp=new XMLHttpRequest();
		}
		else if(window.ActiveXObject) {

		   xhttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		i=1;
	})();

	function ajaxCall(){

		xhttp.onreadystatechange = function() {
			  if (xhttp.readyState == 4 && xhttp.status == 200) {
				  var jsonObj = JSON.parse(xhttp.responseText); 
			      document.getElementById("patname").value = jsonObj.patientName;
			      document.getElementById("patage").value = jsonObj.age;
			      document.getElementById("patphone").value = jsonObj.handPhone;
			      document.getElementById("patmail").value = jsonObj.email;
			      document.getElementById("patage").value = jsonObj.age;
			      document.getElementById(jsonObj.gender).checked = true;
			  }
			};
		xhttp.open("POST","TestValidate",true);
		xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		xhttp.send("patientCode="+document.getElementById("patcode").value);
	}
	
	function ajaxCall2(){

		xhttp.onreadystatechange = function() {
			  if (xhttp.readyState == 4 && xhttp.status == 200) {
				  var jsonObj = JSON.parse(xhttp.responseText); 
			      document.getElementById("docName").value = jsonObj.userName;
			  }
			};
		xhttp.open("POST","EmpValidate",true);
		xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		xhttp.send("empCode="+document.getElementById("docCode").value);
	}
	
	function addTest(){
		var table=document.getElementById("table2");
		var row=table.insertRow(1);
		var cell1=row.insertCell(0);
		var cell2=row.insertCell(1);
		var cell3=row.insertCell(2);
		cell1.innerHTML="<input type='text' id='tCode"+i+"' onBlur='ajaxCall3("+i+")'>";
		cell2.innerHTML="<input type='text' id='tName"+i+"'>";
		cell3.innerHTML="<input type='text' id='amount"+i+"'>";
		i++;
		
	}
	function ajaxCall3(i){
		//alert("hi");
		//document.getElementById("tName"+i).value=document.getElementById("tCode"+i).value;
		xhttp.onreadystatechange = function() {
			  if (xhttp.readyState == 4 && xhttp.status == 200) {
				  var jsonObj = JSON.parse(xhttp.responseText); 
			      document.getElementById("tName"+i).value = jsonObj.testName;
			      document.getElementById("amount"+i).value = jsonObj.amount;
			      calcTotal(i);
			  }
			};
		xhttp.open("POST","TestValidate",true);
		xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		xhttp.send("testCode="+document.getElementById("tCode"+i).value);
	}
	
	function calcTotal(i){
		var total=0;
		for(var j=1;j<=i;j++){
			total += parseInt(document.getElementById("amount"+j).value);
		}
		//alert(total);
		document.getElementById("total").innerHTML=total;
	}