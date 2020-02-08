<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to the Java EE World!</title>
</head>
<body>
	<h1>Dog Rater</h1>
	<h2>(Inspired by WeRateDogs(R) @dog_rates)</h2>

	<form action="getRatingServlet" method="post">
		What is this dog's name? <input type="text" name="name" size="10">
		<p>

			What is this dog's favorite activity? <input list="activities"
				name="activity" size="10">

			<datalist id="activities">
				<option value="Sleep">
				<option value="Fetch">
				<option value="Stuffed Toy">
			</datalist>
		<p>

			<input type="submit" value="Rate This Dog" />
	</form>
</body>
</html>