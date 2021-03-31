<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>
<html>
<head>
<title>NV-Personal_Details</title>
<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">


<style type="text/css">
.errormsg {
	color: red;
}
select.form-control:not([size]):not([multiple]) {
     height: none !important;
}
</style>

</head>
<body>
	<jsp:include page="dashboard.jsp" flush="true" />


	<div class="container mt-4">

		<div class="row">
		
		
			<div class="col-md-offset-2 col-md-8 offset-md-1">
				<h1 class="text-center mb-3" style="color: #c1272d">
					<strong>Personal details</strong>
				</h1>
				<form:form action="handlePersonaldetails"
					modelAttribute="personalDetailsInfo" method="POST">


					<!-- Full Name -->
					<div class="form-group row">
						<label for="fullname" class="col-sm-3 col-form-label">Full
							Name</label>
						<div class="col-sm-3">
							<form:input path="userFirstName" class="form-control"
								id="fullname" placeholder="FirstName" required="required" />
							<small> <form:errors path="userFirstName"
									cssClass="errormsg" /></small>
						</div>
						<div class="col-sm-3">
							<form:input path="userMiddleName" class="form-control"
								id="fullname" placeholder="MiddleName" required="required" />
							<small> <form:errors path="userMiddleName"
									cssClass="errormsg" /></small>
						</div>
						<div class="col-sm-3">
							<form:input path="userLastName" class="form-control"
								id="fullname" placeholder="LastName" required="required" />
							<small> <form:errors path="userLastName"
									cssClass="errormsg" /></small>
						</div>
					</div>

					<!-- //Date Of Birth -->
					<div class="form-group row">
						<label for="Date Of Birth" class="col-sm-3 col-form-label">Date
							Of Birth</label>
						<div class="col-sm-4">
							<form:input path="birthDate" dateformat="DD/MM/YYYY" type="date"
								class="form-control" id="Date Of Birth" required="required" />
							<small> <form:errors path="birthDate" cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //Nationality Id-->
					<div class="form-group row">
						<label for="Nationality" class="col-sm-3 col-form-label">Nationality</label>
						<div class="col-sm-4">
							<form:input path="nationality" class="form-control"
								id="Nationality" placeholder="Indian" required="required" />
							<small> <form:errors path="nationality"
									cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //gender -->
					<div class="form-group row ">
						<label for="exampleFormControlSelect1"
							class="col-sm-3 col-form-label">Select Your Gender</label>
						<div class="form-check form-check-inline col-sm-2">
							<form:radiobutton class="form-check-form:input" path="gender"
								name="inlineRadioOptions" id="inlineRadio1" value="Male" />
							<label class="form-check-label" for="inlineRadio1">Male</label>
						</div>
						<div class="form-check form-check-inline col-sm-2 ">
							<form:radiobutton class="form-check-form:input" path="gender"
								name="inlineRadioOptions" id="inlineRadio2" value="Female" />
							<label class="form-check-label" for="inlineRadio2">Female</label>
						</div>
						<div class="form-check form-check-inline col-sm-2 ">
							<form:radiobutton class="form-check-form:input" path="gender"
								name="inlineRadioOptions" id="inlineRadio3" value="Others" />
							<label class="form-check-label" for="inlineRadio3">Others</label>
						</div>
					</div>
					<!-- Maritial Status -->
					<div class="form-group row ">
						<label for="exampleFormControlSelect1"
							class="col-sm-3 col-form-label">Maritual Status</label>
						<div class="col-sm-4">
							<form:select class="form-control" required="required"
								path="maritialStatus" id="exampleFormControlSelect1">

								<form:option value="Single">Single</form:option>
								<form:option value="Married">Married</form:option>
								<form:option value="Unmarried">Unmarried</form:option>
								<form:option value="Widow">Widow</form:option>
								<form:option value="Seperated">Seperated</form:option>
								<form:option value="Divorced">Divorced</form:option>
							</form:select>
						</div>
					</div>

					<!-- About -->
					<div class="form-group row">
						<label for="About" class="col-sm-3 col-form-label">About
							Yourself</label>
						<div class="col-sm-8">
							<form:textarea class="form-control" path="about" id="About"
								rows="2" required="required"></form:textarea>

							<small> <form:errors path="about" cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //email-id -->
					<div class="form-group row">
						<label for="inputEmail3" class="col-sm-3 col-form-label">Email</label>
						<div class="col-sm-6">
							<form:input path="emailId" type="email" class="form-control"
								id="inputEmail3" placeholder="Email" required="required" />
							<small> <form:errors path="emailId" cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //Linkedin Id-->
					<div class="form-group row">
						<label for="Linkedin" class="col-sm-3 col-form-label">Linkedin
							Id</label>
						<div class="col-sm-6">
							<form:input path="linkedinId" class="form-control" id="Linkedin"
								placeholder="https://www.linkedin.com/in/username"
								required="required" />
							<small> <form:errors path="linkedinId"
									cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //Skype Id -->
					<div class="form-group row">
						<label for="Skype" class="col-sm-3 col-form-label">Skype
							Id</label>
						<div class="col-sm-6">
							<form:input path="skypeId" class="form-control" id="Skype"
								placeholder="Skype Id" required="required" />
							<small> <form:errors path="skypeId" cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //contact no -->
					<div class="form-group row">
						<label for="Contact
							Number"
							class="col-sm-3 col-form-label">Contact Number</label>
						<div class="col-sm-6">
							<form:input path="phoneNo" class="form-control"
								id="Contact
							Number"
								placeholder="Contact Number(eg.9878674534)" required="required" />
						</div>
						<small> <form:errors path="phoneNo" cssClass="errormsg" /></small>

					</div>
					<!-- //current Address -->
					<div class="form-group row">
						<label for="address" class="col-sm-3 col-form-label">Current
							Address</label>
						<div class="col-sm-8">
							<form:textarea class="form-control" path="currentAddress"
								id="address" rows="2" required="required"></form:textarea>
							<small> <form:errors path="currentAddress"
									cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //Country -->
					<div class="form-group row">
						<label for="Country" class="col-sm-3 col-form-label">Country</label>
						<div class="col-sm-5">
							<form:input path="country" class="form-control" id="Country"
								placeholder="Country Name" required="required" />

							<small> <form:errors path="country" cssClass="errormsg" /></small>
						</div>
					</div>
					<!-- //City -->
					<div class="form-group row">
						<label for="City" class="col-sm-3 col-form-label">City</label>
						<div class="col-sm-5">
							<form:input path="city" class="form-control" id="City"
								placeholder="City" required="required" />
						</div>
						<small> <form:errors path="city" cssClass="errormsg" /></small>
					</div>
					<!-- //Language Knowns -->
					<div class="form-group row">
						<label for="Language Knowns" class="col-sm-3 col-form-label">Language
							Knowns</label>
						<div class="col-sm-6">
							<form:input path="languageKnown" class="form-control"
								id="Language Knowns" placeholder="Use comma for seperation"
								required="required" />
						</div>
						<small> <form:errors path="languageKnown"
								cssClass="errormsg" /></small>
					</div>


					<div class="form-group row">
						<div class="col-sm-offset-3 col-sm-9">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<img
		src="data:image/png;base64,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"
		alt="NewVision" style="float: right; width: 200px; height: 150px;">


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>