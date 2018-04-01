<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>测试@SessionAttributes注解</title>
</head>
<body>
<div>
    <p>访问request作用范围域中的user对象：${requestScope.user.username}</p>
    <p>访问request作用范围域中的user对象：${requestScope.user.loginname}</p>
    <p>访问request作用范围域中的user对象：${requestScope.user.password}</p>
    <p>访问session作用范围域中的user对象：${sessionScope.user.username}</p>
    <p>访问session作用范围域中的user对象：${sessionScope.user.loginname}</p>
    <p>访问session作用范围域中的user对象：${sessionScope.user.password}</p>
</div>
</body>
</html>