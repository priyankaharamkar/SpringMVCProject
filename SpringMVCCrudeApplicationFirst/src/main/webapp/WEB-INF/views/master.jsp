<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
<form name="frm" action="search" method="POST">
<ul class="navbar">
<li><a href='addstudent'>Add New Student</a></li>
<li><a href='view'>View All Student</a></li>
<li><input type="text" name="name" value="" style="height:40px;width:200px;"></li>
<li><input type="submit" name="s" value="Search Student" style="height:40px;width:200px;"></li>
</ul>
</form>
</body>
</html>