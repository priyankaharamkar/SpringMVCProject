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
  <jsp:include page="master.jsp"></jsp:include>
  <form name="frm" action="rupdate" method="POST">
  <input type="hidden" name="id" value="${i}" style="height:40px;width:400px;"><br><br>
  <input type="text" name="name" value="${name}"placeholder="Enter the Name" style="height:40px;width:400px;"><br><br>
  <input type="text" name="email" value="${email}"placeholder="Enter the Email" style="height:40px;width:400px;"><br><br>
  <input type="text" name="contact" value="${contact}"placeholder="Enter the Contact" style="height:40px;width:400px;"><br><br>
  <input type="submit" name="s" value="Update Record" style="height:40px;width:400px;"><br><br>
   </form>
</body>
</html>