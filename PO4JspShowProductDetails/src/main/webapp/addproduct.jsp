<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="productServlet">
		Enter name:<input type="text" name="name" required><br />
		Enter cost:<input type="text" name="cost" required><br />
		<input type="submit" value="Add">
</form>
	<form method="get" action="productServlet">
		<input type="submit" value="show added products">
	</form>
</body>
</html>