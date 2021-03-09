<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body>

<jsp:include page = "dashboard.jsp" flush = "true" /> 
	<form action="PersonalDetailsProcessing" method="post">
		<table align="center" width="700" height="800">

			<tr>
				<th>Name</th>
				<td><input type="text" name="userFirstName" maxlength="20"
					placeholder="firstName" required style="color: black" ;/></td>

				<td><input type="text" name="userMiddleName" maxlength="20"
					placeholder="middleName" required style="color: black" ;/></td>

				<td><input type="text" name="userLastName" maxlength="20"
					placeholder="LastName" required style="color: black" ;/></td>
			</tr>

			<tr>
				<th>Date Of Birth</th>
				<td><input type="text" name="birthDate" maxlength="10"
					placeholder="dd/mm/yyyy" required style="color: black" ;/></td>
			</tr>

			<tr>
				<th>Nationality</th>
				<td><input type="text" name="nationality" maxlength="10"
					placeholder="nationality" required style="color: black" ;/></td>
			</tr>

			<tr>
				<th>Gender</th>
				<td>Male <input type="radio" id="male" name="gender"
					value="male"></td>
				<td>Female <input type="radio" id="female" name="gender"
					value="female"></td>
				<td>other <input type="radio" id="other" name="gender"
					value="other">
				</t>
			</tr>

			<tr>
				<th>Maritial Status</th>
				<td><select type="maritialStatus" name="maritialStatus"
					style="color: black" ;required>
						<option value="Single" style="color: black";>Single</option>
						<option value="Married" style="color: black";>Married</option>
						<option value="Unmarried" style="color: black";>Unmarried</option>
						<option value="Widow" style="color: black";>Widow</option>
						<option value="Seperated" style="color: black";>Seperated</option>
						<option value="Divorced" style="color: black";>Divorced</option>
				</select></td>
			</tr>

			<tr>
				<th>Email-id</th>
				<td><input type="email" name="emailId" style="color: black"
					; placeholder="email-id" required></td>
			</tr>

			<tr>
				<th>Linkedin Id</th>
				<td><input type="email" name="linkedinId" style="color: black"
					;
		placeholder="linkedin Id" required></td>
			</tr>

			<tr>
				<th>Skype Id</th>
				<td><input type="text" name="skypeId" style="color: black"
					;
		placeholder="Skype Id" required></td>
			</tr>

			<tr>
				<th>Contact Number</th>
				<td><input type="text" name="phoneNo" style="color: black"
					; placeholder="enter contact number" required maxlength="10"></td>
			</tr>

			<tr>
				<th>Current Address</th>
				<td><textarea rows="5" cols="25" name="currentAddress"
						style="color: black" ;
	placeholder="enter your address" required></textarea></td>
			</tr>


			<tr>
				<th>Country</th>
				<td><input type="text" name="country" maxlength="20"
					placeholder="country" required style="color: black" ;/></td>
			</tr>
			
			<tr>
				<th>City</th>
				<td><input type="text" name="city" maxlength="20"
					placeholder="city" required style="color: black" ;/></td>
			</tr>

			<tr>
				<th>Language Known</th>
				<td><input type="text" name="languageKnown" maxlength="50"
					placeholder="Use comma for seperation" required
					style="color: black" ;/></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit" style="color: black" ;/> <input type="reset"
					value="Reset" style="color: black" ;/></td>
			</tr>


		</table>
	</form>
</body>
</html>