<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>Show Refernce Details</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"
	integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog=="
	crossorigin="anonymous" />
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
<script type="text/javascript">
       function showhide() 
        {  
            var div = document.getElementById("newpost");  
            if (div.style.display !== "none") {  
                div.style.display = "none";  
            }  
            else {  
                div.style.display = "block";  
            }  
        }  </script>
</head>
<body>
	<jsp:include page="dashboard.jsp" flush="true" />



	<div class="container mt-3 " id="newpost">

		<div class="row">
			<h2 class="text-center mb-3">${message}</h2>
			<div class="container text-center">

				<a href="refernceDetails" class="btn btn-success">Add Another
					Refernce</a>

			</div>
			<div class="col-md-12">



				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">RefernceName</th>
							<th scope="col">Designation</th>
							<th scope="col">Email Id</th>
							<th scope="col">Contact No</th>
							<th scope="col">Organization</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${referncedetailsList }" var="refernce">
							<tr>

								<td>${refernce.refernceName}</td>
								<td>${refernce.designation }</td>
								<td>${refernce.emailId}</td>
								<td>${refernce.contactNo }</td>
								<td>${refernce.address }</td>
								<td>${refernce.organization }</td>
								<td><a href="delete/${refernce.id }"><i
										class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
									<a href="edit/${refernce.id }"><i
										class="fas fa-pen-nib text-primary" style="font-size: 30px;"></i></a>


								</td>



							</tr>
						</c:forEach>
					</tbody>
				</table>


				<div class="container text-center">

					<button onclick="showhide()" class="btn btn-success">close</button>


				</div>




			</div>


		</div>

	</div>
</body>

</html>