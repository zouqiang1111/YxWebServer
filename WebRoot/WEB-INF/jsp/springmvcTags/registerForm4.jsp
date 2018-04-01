<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>测试errors标签</title>
</head>
<body>
<h2>选择部门</h2>
<form:form method="post" action="register" modelAttribute="user4">
    <table>
        <tr>
            <td>姓名：</td>
            <td><form:input path="username"/></td>
            <td><span style="color: red"><form:errors path="username"/></span></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><form:input path="sex"/></td>
            <td><span style="color: red"><form:errors path="sex"/></span></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><form:input path="age"/></td>
            <td><span style="color: red"><form:errors path="age"/></span></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><form:password path="password"/></td>
            <td><span style="color: red"><form:errors path="password"/></span></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
