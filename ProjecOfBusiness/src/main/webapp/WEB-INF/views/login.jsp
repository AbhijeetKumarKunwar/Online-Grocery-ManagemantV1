<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
	<center>
		<h1>LogIn form</h1>
		
		<form:form modelAttribute="log" action="/login" method="POST" >
			<table>
				<tr>
					<td><form:label path="userName">Enter E-mail:</form:label></td>
					<td><form:input path="userName" name="userName" id="userName" /></td>
					<td><form:errors path="userName"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="password">Password:</form:label></td>
					<td><form:password path="password" name="password" id="password" /></td>
					<td><form:errors path="password"></form:errors></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" name="LogIn" id="submit"></td>
					
				</tr>
			</table>
			<p>${message}</p>
		</form:form>
	</center>
</body>
</html>