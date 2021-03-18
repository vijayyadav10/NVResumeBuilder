<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page = "dashboard.jsp" flush = "true" />
<p>${personalDetails.userFirstName}</p>
<p>${personalDetails.userMiddleName}</p>

<p>${educationalDetails}</p>

<p>${organizationalDetails}</p>

<p>${experienceDetails}</p>

<p>${projectDetails}</p>

<p>${achievementsAndHonours}</p>
<p>${refernceDetailsdata}</p>

</body>
</html>