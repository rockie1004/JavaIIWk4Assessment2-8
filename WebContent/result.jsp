<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<h1>${userDogRating.getName()}!</h1>
<body>
	<p>${userDogRating.toString()}</p>
	<a href="index.jsp">Rate another dog!</a>
</body>
</html>