<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
    </head>
    <body>
    <form name="frm" action="validate" method="POST">
       <input type="text" name="name" value="" class="control"/><br><br>
       <input type="text" name="pass" value=""class="control"/><br><br>
       <input type="submit" name="s" value="Login Here" class="control"/>
       <span>${msg}</span>
       </form>
       
    </body>
</html>
