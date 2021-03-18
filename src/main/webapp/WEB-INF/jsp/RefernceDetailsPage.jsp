<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>
<html>
<head>
<title>Refernce Detail Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<style type="text/css">
.errormsg {
	color: red;
}
</style>

</head>
<body>
	<jsp:include page="dashboard.jsp" flush="true" />
	<div class="container mt-3">

		<div class="row">
			<h4 class="text-center mb-3">${message}</h4>
			<div class="col-md-offset-3 col-md-6 offset-md-3">

				<h2 class="text-center mb-3">Reference details</h2>
				<form:form action="handleReferncedetails" id="myForm"
					modelAttribute="refernceDetails" method="POST">
					<input type="hidden" value="${refernceDetails.id}" name="id" />
					<div class="form-group">
						<label class="control-label" for="name">Name of Person</label>

						<form:input path="refernceName" id="name" cssClass="form-control"
							placeholder="Enter person name" />
						<small> <form:errors path="refernceName"
								cssClass="errormsg" /></small>
					</div>


					<div class="form-group">
						<label class="control-label" for="designation">Designation</label>

						<form:input path="designation" size="30" cssClass="form-control"
							placeholder="Enter designation  name" />
						<small> <form:errors path="designation"
								cssClass="errormsg" /></small>
					</div>

					<div class="form-group">
						<label class="control-label" for="email">Email id</label>

						<form:input path="emailId" size="30" cssClass="form-control"
							placeholder="Enter email id  " />

						<small> <form:errors path="emailId" cssClass="errormsg" /></small>
					</div>

					<div class="form-group">
						<label class="control-label" for="phone">Contact No</label>

						<form:input path="contactNo" id="phone" cssClass="form-control"
							placeholder="Enter contact  no" />

						<small> <form:errors path="contactNo" cssClass="errormsg" /></small>
					</div>

					<div class="form-group">

						<label class="control-label" for="address">Address </label>

						<form:textarea path="address" id="address" cssClass="form-control"
							rows="3" placeholder="Enter the address here" />
						<small> <form:errors path="address" cssClass="errormsg" /></small>
					</div>

					<div class="form-group">
						<label class="control-label" for="name of organization">Name
							Of Organization</label>

						<form:input path="organization" id="name of organization"
							cssClass="form-control" placeholder="Enter organization  name" />
						<small> <form:errors path="organization"
								cssClass="errormsg" /></small>
					</div>


					<div class="form-group">



						<form:button type="submit" class="btn btn-success text-center">Add</form:button>

					</div>


				</form:form>


			</div>

		</div>

	</div>
</body>
</html>