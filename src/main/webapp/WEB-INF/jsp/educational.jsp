<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  
  
  <head>

   <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     
    <title>Educational details</title>
   
    <style type="text/css">
            .errormsg {
                color: red;
            }
        </style>
    
  </head>
  <body>
   
 
     <div class="container mt-5"> 
   
     <form:form action ="processform" method="post" modelAttribute="EducationalDetailsEntity" >
    
    <section id="top">
    <h2>Educational Details</h2><br>
    </section>
   
   
    <section id="left">
    
    <div class="form-group">
    <label for="nameOfCollege">Name Of College</label>
    <form:input path="nameOfCollege" cssClass="form-control" placeholder="Enter here"  />
     <small><form:errors path="nameOfCollege" cssClass="errormsg" /></small>
    </div>
    
  
     
   
    <div class="form-group">
    <label for="degree">Degree</label>
    <form:select path="degree" cssClass="form-control" >
        <form:option value =""> select degree</form:option>
        <form:option value ="BE"> B.E</form:option>
        <form:option value ="deploma"> Deploma</form:option>
        <form:option value ="ba"> B.A.</form:option>
        <form:option value ="b tech"> B Tech</form:option>
    </form:select>
    
    <form:errors path="degree" cssClass="errormsg" />
    </div>
   
   
   
    <div class="form-group">
    <label for="university">University</label>
    <form:input  path="university" cssClass="form-control" placeholder="Enter here"  /> 
    <small><form:errors path="university" cssClass="errormsg" /></small>
    </div>
   
   
   
    <div class="form-group">
    <label for="yearOfPassing">Year Of Passing</label>
    <form:input path="yearOfPassing" cssClass="form-control" patteren="[0-9]{2}"  />
    <small><form:errors path="yearOfPassing" cssClass="errormsg" /></small>
    </div>
        
    <div class="form-group">
    <label for="percentage">Percentage(enter only numbers)</label>
    <form:input path="percentage" cssClass="form-control" patteren="[0-9]{5}" />
    <small><form:errors path="percentage" cssClass="errormsg" /></small>
    </div>
    
    
    
    <div class="form-group">
    <label for="masters">Masters Degree</label>
    <form:select path="degreeM" cssClass="form-control" >
        <form:option value =""> select degree</form:option>
        <form:option value ="MA">MA</form:option>
        <form:option value ="MBA"> MBA</form:option>
        <form:option value ="M tech"> M Tech</form:option>
    </form:select>
    
    <form:errors path="degreeM" cssClass="errormsg" />
    </div>
    
    
      
    <div class="form-group">
    <label for="nameOfCollege">Name Of College</label>
    <form:input type="text" path="collegeNameM" cssClass="form-control" placeholder="Enter here" />
    <small><form:errors path="collegeNameM" cssClass="errormsg" /></small>
    </div>
       
   
   
   
    <div class="form-group">
    <label for="university">University</label>
    <input type="text" name="universityM" placeholder="Enter here">
    </div>
   
   
   
    <div class="form-group">
    <label for="yearOfPassing">Year Of Passing</label>
    <input type="text" name="yearOfPassingM" patteren="[0-9]{4}" >
    </div>
    
    
    
    <div class="form-group">
    <label for="skills">Technical Skills</label>
    <select name="technicalSkills" multiple>
        <option value ="sql"> SQL</option>
        <option value ="c"> C</option>
        <option value ="c++"> C++</option>
        <option value ="java">JAVA</option>
        <option value =".net"> .NET</option>
    
     </select>
     </div>
    
     </section>
    
    
    
    <input type="submit"  Value ="Submit">
    <input type="reset"  Value ="Reset">
    <br>
    <br>
    
    
     </table>
    </form:form>

  </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  


  </body>
</html>