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
<form:form method="post" action="checkboxForm2" modelAttribute="user3">
    <table>
        <tr>
            <td>
                <form:checkboxes items="${courseMap}" path="courses"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
