<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>NV-ExperienceDetails</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
    .h1, h1{
    text-align:center
    }
    .text-danger{
    	font-size: 1.4em;
    }
    
    </style>
</head>

<body>
    <div class="container mt-3">
        <div class="container__experience">
            <div class="shadow p-3 mb-5 bg-white rounded">
            <h1>Work Experience</h1>
            <i class="mb-5">Fill out the form. Asterisk (<span class="text-danger">*</span>) means required.</i>
                <div class="container__experience__header">
                    <form:form action="saveExperienceDetail" modelAttribute="experienceproject" method="Post">
                        <!-- <div class="form-group row">
                            <label for="staticEmail" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Please Select Experience</label>
                            <div class="col-sm-10">
                                <select>
                                    <option>Fresher</option>
                                    <option>Experience</option>
                                </select>
                            </div>
                        </div> -->
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><u>Experience 1:</u></label>
                            <div class="col-sm-10">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Name Of Company</label>
                            <div class="col-sm-10">
                                <form:input type="text" path="companyName" class="form-control" 
                                    placeholder="Enter your company name" />
                                <form:errors path="companyName" class="text-danger" />
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Designation</label>
                            <div class="col-sm-10">
                                <form:input type="text" path="designation" class="form-control" 
                                    placeholder="Enter your designation" />
								<form:errors path="designation" class="text-danger" />
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Name Of Project</label>
                            <div class="col-sm-4">
                                <form:input type="text" path="projectName" class="form-control" 
                                    placeholder="Enter your project name"  />
                                 <form:errors path="projectName" class="text-danger" />   
                            </div >
                            <div class="col-sm-4">
                                <form:input type="text" path="projectDescription" class="form-control" 
                                    placeholder="Enter your project description" />
                                <form:errors path="projectDescription" class="text-danger" />
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Joining Date / From</u></label>
                            <div class="col-sm-10">
                                <form:input type="date" path="joiningDate" />
                                <form:errors path="joiningDate" class="text-danger" />
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Leaving Date / To</u></label>
                            <div class="col-sm-10">
                                <form:input type="date" path="leavingDate" />
                            </div>
                        </div>
                        <!-- <div class="form-group row">
                            <label class="col-sm-2 col-form-label"><u>Experience 2:</u></label>
                            <div class="col-sm-10">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Name Of Company</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputPassword"
                                    placeholder="Enter your company name" required>
                            </div>
                        </div>
						                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Designation</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputPassword"
                                    placeholder="Enter your designation" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Name Of Project</label>
                            <div class="col-sm-4">
                                <input type="text" class="form-control" id="inputPassword"
                                    placeholder="Enter your project name" required>
                            </div >
                            <div class="col-sm-4">
                                <input type="text" class="form-control" id="inputPassword"
                                    placeholder="Enter your project description" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Joining Date / From</label>
                            <div class="col-sm-10">
                                <input type="date" id="birthday" name="birthday">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><span class="text-danger">*</span>Leaving Date / Tos</label>
                            <div class="col-sm-10">
                                <input type="date" id="birthday" name="birthday">
                            </div>
                        </div> -->
                        <!-- <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label"><u>Current Organization Detail:</u></label>
                            <div class="col-sm-10">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Name of current/present organization</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputPassword"
                                    placeholder="Enter your organization" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Designation</u></label>
                            <div class="col-sm-10">
                                <div class="col-sm-10">
                                    <select>
                                        <option>Front-End Developer</option>
                                        <option>Back-End Developer</option>
                                        <option>DB Admin</option>
                                        <option>Java Developer</option>
                                        <option>C# Developer</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Joining Date / From</u></label>
                            <div class="col-sm-10">
                                <div class="col-sm-10">
                                    <input type="date" path="joiningDate" id="birthday" name="birthday">
                                </div>
                            </div>
                        </div>-->
                        <div class="form-group row container">
                            <button type="reset" class="btn btn-danger">Reset</button>
                            <div class="col-sm-10">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-primary">Submit</button>
                                </div>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
      </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>