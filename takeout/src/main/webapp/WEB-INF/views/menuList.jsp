<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>List of menu items</h2>

	<c:if test="${not empty lists}">

		 
		<table border="1" cellpadding="5">
            
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Category</th>
                <th>Description</th>
                <th>Price</th>
            </tr>
            
             
        
			<c:forEach var="menuItems" items="${lists}">
			  <tr>
				 <td><c:out value="${menuItems.id}" /></td>
                    <td><c:out value="${menuItems.displayName}" /></td>
                    <td><c:out value="${menuItems.category}" /></td>
                    <td><c:out value="${menuItems.description}" /></td>
                    <td><c:out value="${menuItems.price}" /></td>
				 </tr>
			</c:forEach>
		</table>

	</c:if>
</body>
</html>