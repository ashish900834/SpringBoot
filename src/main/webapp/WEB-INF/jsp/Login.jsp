<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Add Student</title>
</head>
<h1>Add New Student</h1>
<body>
	<form action="/welcome/add" method="Post">
		<table>
			<tr>
				<td>Name    : <input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Age     : <input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>Address : <input type="text" name="addr" /></td>
			</tr>
			
			 <tr>
       <td></td>
			<td><input type="submit" /></td></tr>
		</table>
	</form>
</body>

</html>