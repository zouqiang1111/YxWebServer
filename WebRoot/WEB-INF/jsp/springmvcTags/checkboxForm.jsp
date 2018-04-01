<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>选择课程</title>
</head>
<body>
<h2>选择课程</h2>
<form:form method="post" action="checkboxForm" modelAttribute="user3">
    <table>
        <tr>
            <td><form:checkbox path="courses" value="Java EE" label="Java EE"/>&nbsp;
                <form:checkbox path="courses" value="Mybatis" label="Mybatis"/>&nbsp;
                <form:checkbox path="courses" value="Spring MVC" label="Spring MVC"/><br>
                <form:checkboxes items="${courseList}" path="courses"/>
            </td>
        </tr>
    </table>
    <form:checkbox path="reader" value="true"/>已经阅读相关协议
</form:form>
</body>
</html>
