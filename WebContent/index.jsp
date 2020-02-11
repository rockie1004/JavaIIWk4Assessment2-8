<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start</title>
</head>
<body>
	<h1>Dog Rater</h1>
	<h2>--Inspired by WeRateDogs @dog_rates--</h2>

	<form action="getRatingServlet" method="post">
		What is this dog's name? <input type="text" name="name" size="10">
		<p>
		<p>

		<input type="submit" value="Rate This Dog" />
	</form>
	
</body>
</html>