<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Achievements And Honours</title>
    
    <style type="text/css">
   
            .errormsg 
            {
                color: red;
            }
        
   </style>
    
  </head>
  <body>


<jsp:include page = "dashboard.jsp" flush = "true" />


 <div class="container mt-5">   
    
<form:form action="AchievementsFormProcessing" method="post" modelAttribute="AchievementsAndHonoursEntity">
  
   <center><b><span style="font-size:35px;color:#c1272d"><label><u>Achievements And Honours</u></label></span></b></center>
  <br>
  <hr>
  <div class="form-group">
    <center><b><span style="font-size:30px;color:#c1272d"><label>Participation</label></span></b></center>
  </div>
  
  <div class="form-group">
   <form:input path="particationevent1" size="200" cssClass="form-control" placeholder="Enter First Partication Event" />
   <small><b><form:errors path="particationevent1" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="particationevent2" size="200" cssClass="form-control" placeholder="Enter Second Partication Event" />
    <small><b><form:errors path="particationevent2" cssClass="errormsg" /></b></small>
  </div>
  
  
  <div class="form-group">
    <form:input path="particationevent3" size="200" cssClass="form-control" placeholder="Enter Third Partication Event" />
    <small><b><form:errors path="particationevent3" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="particationevent4" size="200" cssClass="form-control" placeholder="Enter Fourth Partication Event" />
    <small><b><form:errors path="particationevent4" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="particationevent5" size="200" cssClass="form-control" placeholder="Enter Fifth Partication Event" />
    <small><b><form:errors path="particationevent5" cssClass="errormsg" /></b></small>
  </div>
  
  <br>
  
  
  <div class="form-group">
    <center><b><span style="font-size:30px;color:#c1272d"><label>Certification</label></span></b></center>
  </div>
  
  <div class="form-group">
    <form:input path="certification1" size="200" cssClass="form-control" placeholder="Enter First Certification" />
    <small><b><form:errors path="certification1" cssClass="errormsg" /></b></small>
  </div>
  
  
  <div class="form-group">
    <form:input path="certification2" size="200" cssClass="form-control" placeholder="Enter Second Certification" />
    <small><b><form:errors path="certification2" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="certification3" size="200" cssClass="form-control" placeholder="Enter Third Certification" />
    <small><b><form:errors path="certification3" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="certification4" size="200" cssClass="form-control" placeholder="Enter Fourth Certification" />
    <small><b><form:errors path="certification4" cssClass="errormsg" /></b></small>
 </div>
  
  <div class="form-group">
    <form:input path="certification5" size="200" cssClass="form-control" placeholder="Enter Fifth Certification" />
    <small><b><form:errors path="certification5" cssClass="errormsg" /></b></small>
  </div>
  
  <br>
  
  
  
  <div class="form-group">
    <center><label><b><span style="font-size:30px;color:#c1272d">Awards and Honours</span></b></label></center>
  </div>
  
  <div class="form-group">
    <form:input path="awardsandhonoursdetails1" size="200" cssClass="form-control" placeholder="Enter First Award and Honour" />
    <small><b><form:errors path="awardsandhonoursdetails1" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="awardsandhonoursdetails2" size="200" cssClass="form-control" placeholder="Enter Second Award and Honour" />
    <small><b><form:errors path="awardsandhonoursdetails2" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="awardsandhonoursdetails3" size="200" cssClass="form-control" placeholder="Enter Third Award and Honour" />
    <small><b><form:errors path="awardsandhonoursdetails3" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="awardsandhonoursdetails4" size="200" cssClass="form-control" placeholder="Enter Fourth Award and Honour" />
    <small><b><form:errors path="awardsandhonoursdetails4" cssClass="errormsg" /></b></small>
  </div>
  
  <div class="form-group">
    <form:input path="awardsandhonoursdetails5" size="200" cssClass="form-control" placeholder="Enter Fifth Award and Honour" />
    <small><b><form:errors path="awardsandhonoursdetails5" cssClass="errormsg" /></b></small>
   </div>
   
  
  <div class="container text-center">
  
  <button type="submit" class="btn btn-primary" style="background-color:#c1272d">Submit</button>
  <br><br>
  <button type="submit" class="btn btn-primary" style="background-color:#c1272d">Reset</button>
  
  </div>
<hr>
</form:form>  
   
  </div>
  
  <img src="data:image/png;base64,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" alt="NewVision" style="float:right;width:200px;height:150px;">
  
  
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
  
  </body>
</html>