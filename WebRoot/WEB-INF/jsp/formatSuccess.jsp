<%--
  Created by IntelliJ IDEA.
  User: ZouQiang
  Date: 2018/4/1
  Time: 23:39
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>测试表单数据格式化</title>
</head>
<body>
<h3>测试表单数据格式化</h3>
<form:form modelAttribute="formatForm" method="post" action="">
    <table>
        <tr>
            <td><label>日期类型：</label></td>
            <td><form:input path="birthday"/></td>
        </tr>
        <tr>
            <td><label>整数类型：</label></td>
            <td><form:input path="total"/></td>
        </tr>
        <tr>
            <td><label>百分数类型：</label></td>
            <td><form:input path="discount"/></td>
        </tr>
        <tr>
            <td><label>货币类型类型：</label></td>
            <td><form:input path="money"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
