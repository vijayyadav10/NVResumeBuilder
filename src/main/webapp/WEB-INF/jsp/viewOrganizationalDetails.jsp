<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Organizational Details</title>
</head>
<body>
	<jsp:include page="dashboard.jsp" flush="true" />
	<p>${orgDetails}</p>
</body>
</html>