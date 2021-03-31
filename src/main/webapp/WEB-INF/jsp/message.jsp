<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<%
	String message = (String)session.getAttribute("message");
	if(message!=null)
	{
	
%>
 <div class="alert alert-success alert-dismissible  text-center">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <h5><strong>Good job !!</strong> ${message}</h5>
  </div>
		
<%
	session.removeAttribute("message");
	}
%>
</body>
</html>