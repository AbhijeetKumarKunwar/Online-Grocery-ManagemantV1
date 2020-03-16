<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>

<body style="background-color:powderblue;">
<form:form method="" action="" modelattribute="">
<center><h1 style="front-size:300%;">Welcome to the Customer Page</h1></center>
<center>
<p>Welcome to India's Largest Online Grocery store , this portal is Synonyms of trust,  more than millions trust us its your time Now :)</p>
<p>if you are looking for Grocery item's and daily uses product then you are at right place</p>
<h2>This is the List of item's You can shop here:</h2>
<table>
<tr>
<td><b><sf:label path="frutAndVeg">Fruit and Vegitable</sf:label>></td>
</tr>
<tr>
<td><b><sf:label path="fodAndOil">Foodgrains and oil & Masala</sf:label></td>
</tr>
<tr>
<td><b><sf:label path="NonVeg">Eggs,Meat and Fish</sf:label></td>
</tr>
<tr>
<td><b><sf:label path="drinks">Bevrages</sf:label></td>
</tr>
<tr>
<td><b><sf:label path="snacks">Snacks and Branded food</sf:label></td>
</tr>
<tr>
<td><b><sf:label path="clening">Cleaning and household</sf:label></td>
</tr>
</table>
<br>
<a href="">Browse here for shopping above items :)</a>
<br>
<br>
<table cellpadding="4">
<tr>
<td>
<input path="logOut" type="button" id="logout" action="" value="Logout">
</td>
</tr>
<tr>
<input type="button" id="hlp" action="" value="Help">
</tr>
<tr>
<input type="button" id="psw" action="" value="Change Password">
</tr>
</table>
</center>
</form:form>
</body>

</html>