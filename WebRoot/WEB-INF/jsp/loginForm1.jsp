<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>测试@ModelAttribute</title>
</head>
<body>
<h2>测试@ModelAttribute(value="")注释返回具体类的方法</h2>
<form action="login1" method="post">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input type="text" name="loginname" id="loginname"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"/></td>
        </tr>
    </table>
</form>
</body>
</html>