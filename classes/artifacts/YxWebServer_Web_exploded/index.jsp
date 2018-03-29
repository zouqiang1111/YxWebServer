<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>数据绑定测试</title>
</head>
<body>
<h2>数据绑定测试</h2>
<a href="pathVariableTest/1">测试@PathVariable注解</a><br>
<a href="requestHeaderTest">测试@RequestHeader注解</a><br>
<a href="cookieValueTest">测试@CookieValue注解</a><br>
<a href="loginForm1">测试@ModelAttribute(value="")注释返回具体类的方法</a><br>
<a href="loginForm2">测试@ModelAttribute注释void返回值的方法</a><br>
<a href="loginForm3">测试@ModelAttribute注释返回具体类的方法</a><br>
<a href="loginForm4">测试@ModelAttribute和@RequestMapping同时注释一个方法</a><br>
<a href="loginForm5">测试@ModelAttribute注释一个方法的参数</a><br>
</body>
</html>
