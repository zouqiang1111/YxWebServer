<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>测试@SessionAttributes注解</h2>
<form action="login" method="post">
    <table>
        <tr>
            <td colspan="2">登录窗口</td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="loginname"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"/>
        </tr>
    </table>
</form>
</body>
</html>
