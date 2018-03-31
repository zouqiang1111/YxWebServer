<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<h2>注册页面</h2>
<form:form method="post" action="register">
    <table>
        <tr>
            <td>姓名：</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>性別：</td>
            <td><form:input path="sex"/></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><form:password path="password"/></td>
        </tr>
        <%--<tr>--%>
            <%--<td>hidden标签：</td>--%>
            <%--<td><form:hidden path="id"/></td>--%>
        <%--</tr>--%>
        <tr>
            <td>个性签名：</td>
            <td><form:textarea path="remark" rows="5" cols="20"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
