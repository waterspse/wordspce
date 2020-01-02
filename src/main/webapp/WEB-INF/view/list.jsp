<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="list"  method="post">
		<table>
				<tr>
					<td>编号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>年龄</td>
				</tr>
				<c:forEach  items="${list}" var="l">
						<tr>
								<td>${l.id }</td>
								<td>${l.name }</td>
								<td>${l.sex }</td>
								<td>${l.age }</td>
						</tr>
				</c:forEach>
		</table>
</form>
</body>
</html>