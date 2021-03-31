<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page = "dashboard.jsp" flush = "true" />
<p>${resumeTemplateEntity.personalDetailsEntity.userFirstName}</p>
<p>${resumeTemplateEntity.educationalDetailsEntity.nameOfCollege}</p>
<p>${resumeTemplateEntity.experienceDetailsEntity.companyName}</p>
<p>${resumeTemplateEntity.projectDetailsEntity.projectDescription}</p>
<p>${resumeTemplateEntity.organizationalDetailsEntity.comName}</p>



</body>
</html>