<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h3>List-of-Students-Using-JSTL</h3>
<hr>
	<table border="2">
	
	
	<c:forEach var="books" items="${book}">
		<tr>
			<td>${book.bNo}</td>
			<td>${book.bAuthor}</td>
			<td>${book.bName}</td>
			<td>${book.bPrice}</td>
			
		</tr>
	</c:forEach>
	</table>


<hr>
</body>
</html>