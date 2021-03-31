
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>NV-Show_Refernce_Details</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"
	integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog=="
	crossorigin="anonymous" />



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

			<div class="container text-center">
 	<%@include file="message.jsp"%>
				<a href="refernceDetails" class="btn btn-success mt-2">Add Another
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
	<img
		src="data:image/png;base64,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"
		alt="NewVision" style="float: right; width: 200px; height: 150px;">
		<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>

</html>