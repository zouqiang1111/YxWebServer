<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>测试表单数据格式化</title>
</head>
<body>
<h2>测试表单数据格式化</h2>
<form action="formatTest" method="post">
    <table>
        <tr>
            <td><label>日期类型：</label></td>
            <td><input type="text" id="birthday" name="birthday"></td>
        </tr>
        <tr>
            <td><label>整数类型：</label></td>
            <td><input type="text" id="total" name="total"></td>
        </tr>
        <tr>
            <td><label>百分数类型：</label></td>
            <td><input type="text" id="discount" name="discount"></td>
        </tr>
        <tr>
            <td><label>货币类型类型：</label></td>
            <td><input type="text" id="money" name="money"></td>
        </tr>
        <tr>
            <td><input type="submit" id="submit" value="提交"/></td>
        </tr>
    </table>
</form>
</body>
</html>
