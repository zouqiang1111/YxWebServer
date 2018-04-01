<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>测试@ModelAttribute</title>
</head>
<body>
<h2>测试@ModelAttribute注释返回具体类的方法</h2>
<form action="login5" method="post">
    <table>
        <tr>
            <td><label>用户名：</label></td>
            <td><input type="text" name="loginname"/></td>
        </tr>
        <tr>
            <td><label>密 码：</label></td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"/>
        </tr>
    </table>
</form>
</body>
</html>