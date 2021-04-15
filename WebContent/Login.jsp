<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="LoginCheck">
		<table>
			<tr>
				<td>Hotel Name</td>
				<td><input type="text" name="hotelname"></td>
			</tr>
			<tr>
				<td>Location</td>
				<td><input type="text" name="location"></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="date" name="date"></td>
			</tr>
			<tr>
				<td>No of Day</td>
				<td><input type="number" name="days"></td>
			</tr>
			<tr>
				<td>No of People</td>
				<td><input type="number" name="people"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>

		</table>

	</form>
</body>
</html>