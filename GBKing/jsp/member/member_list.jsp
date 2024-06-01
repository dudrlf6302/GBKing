<%@page contentType="text/html;charset=UTF-8"%>
<%@page session="false"%>
<%@taglib prefix="c" 
    uri="http://java.sun.com/jstl/core_rt"%>

<html>
	<head>
		<title>스프링웹</title>
	</head>
	<body>
	<table border="1" width="100%">
		<c:forEach items="${list}" var="item">
			<tr>
				<td>${item.user_id}</td>
				<td>${item.user_name}</td>
				<td>${item.password}</td>
			</tr>
		</c:forEach>
	</table>
	</body>
</html>


