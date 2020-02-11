<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Description</title>

</head>
<body>
	<form action="getDescriptionServlet" method="post">
			What is this dog's favorite activity? <input list="activities"
				name="activity" size="10">

			<datalist id="activities">
				<option value="Sleep">
				<option value="Fetch">
				<option value="Stuffed Toy">
			</datalist>
					<p>

			<input type="submit" value="Get description" />
		</form>
</body>
</html>