<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>YoyoWallet - Register</title>
</head>
<body>
<form:form method="post" modelAttribute="registerForm">
		<table>
			<tr>
				<td>First Name: </td>
				<td><form:input path="fname" /></td>
				<td><form:errors path="fname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name: </td>
				<td><form:input path="lname" /></td>
				<td><form:errors path="lname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Username: </td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email: </td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password: </td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Mobile No: </td>
				<td><form:input path="mobileNo" /></td>
				<td><form:errors path="mobileNo" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Preferred Currency: </td>
				<td><form:input path="currency" /></td>
				<td><form:errors path="currency" cssClass="error" /></td>
			</tr>
			<tr>
				<td>City: </td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Country: </td>
				<td><form:input path="country" /></td>
				<td><form:errors path="country" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Pin Code: </td>
				<td><form:input path="pinCode" /></td>
				<td><form:errors path="pinCode" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>