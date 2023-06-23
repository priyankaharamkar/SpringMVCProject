<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
<jsp:include page="master.jsp"></jsp:include>
<table>
<tr>
	<th>NAME</th>
	<th>EMAIL</th>
	<th>CONTACT</th>
	<th>DELETE</th>
	<th>UPDATE</th>
</tr>

<c:forEach var="s" items="${studrecord}">
   <tr>
		<td>${s.getName()}</td>
		<td>${s.getEmail()}</td>
		<td>${s.getContact()}</td>
		<td><a href='del?userid=${s.getId()}'>Delete</a></td>
		<td><a href='upda?userid=${s.getId()}&name=${s.getName()}&email=${s.getEmail()}&contact=${s.getContact()}'>Update</a></td>
		
	</tr>
</c:forEach>
</table>
</body>
</html>