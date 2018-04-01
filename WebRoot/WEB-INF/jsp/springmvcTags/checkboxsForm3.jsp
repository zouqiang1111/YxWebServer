<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>选择部门</title>
</head>
<body>
<h2>选择部门</h2>
<form:form method="post" action="checkboxsForm3" modelAttribute="employee">
    <table>
        <tr>
            <td>
                <form:checkboxes items="${deptList}" path="depts" itemLabel="deptName" itemValue="id"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
