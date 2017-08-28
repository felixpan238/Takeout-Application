<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Menu Item</title>
</head>
<body>

<form:form method="POST" action="/menu/menuitem">
<table>
    <tr>
        <td>Display name</td>
        <td><form:input path="display_name" /></td>
    </tr>
    <tr>
        <td>Category</td>
        <td><form:select path="category">
    		<form:options items="${category}" />
			</form:select>
		</td>
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