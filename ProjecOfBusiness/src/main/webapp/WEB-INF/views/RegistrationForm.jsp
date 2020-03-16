<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
	<center>
		<h1>Registration form</h1>
		
		<form:form modelAttribute="id" action="/RegistrationForm" method="POST" >
			<table>
				<tr>
					<td><form:label path="userName">UserName:</form:label></td>
					<td><form:input path="userName" name="userName" id="userName"/></td>
					<td><form:errors path="userName"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="password">Password:</form:label></td>
					<td><form:password path="password" name="password" id="password" /></td>
					<td><form:errors path="password"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="email">Email:</form:label></td>
					<td><form:input path="email"/></td>
					<td><form:errors path="email"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="number">Number:</form:label></td>
					<td><form:input path="number" name="userName" id="userName" /></td>
					<td><form:errors path="number"></form:errors></td>
				</tr>
				<tr>
					<td><form:radiobutton path="sex" value="M"/>Male </td>
					<td><form:radiobutton path="sex" value="F"/>Female </td>
					<td><form:errors path="sex"></form:errors></td>
				</tr>
				
				
				<tr>
					<td><input type="submit" value="Login" name="submit" id="submit"></td>
					<td><input type="reset" value="Cancel" name="reset" id="reset"></td>
					<td><a href="/login" >Login</a><td>
				</tr>
			</table>
			<p>${message}</p>
		</form:form>
	</center>
</body>
</html>