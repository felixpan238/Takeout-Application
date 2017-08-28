<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Menu Item</title>
</head>
<body>

	<form:form method="post" action="/menu/menuitem">
		<h1>Add a Menu Item</h1>
		<table>
			<tr>
				<td>Display name</td>
				<td><form:input path="displayName" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><form:input path="category" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>