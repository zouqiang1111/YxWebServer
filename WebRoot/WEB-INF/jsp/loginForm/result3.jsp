<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html">
<html>
<head>
    <title>测试@ModelAttribute</title>
</head>
<body>
访问request作用范围域中的user对象：${requestScope.user.loginname}<br>
访问request作用范围域中的user对象：${requestScope.user.password}<br>
</body>
</html>