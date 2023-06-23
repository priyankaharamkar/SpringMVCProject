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
<jsp:include page="master.jsp"/><br><br>
<form name="frm" action="save" method="POST">
<input type="text" name="name" value="" placeholder="Enter the Name"class="control"/><br><br>
<input type="text" name="email" value=""placeholder="Enter the Email"class="control"/><br><br>
<input type="text" name="contact" value=""placeholder="Enter the Contact"class="control"/><br><br>
<input type="submit" name="s" value="Add New Student" class="control"/><br><br>
${msg}
</form>
</body>
</html>