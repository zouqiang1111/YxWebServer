<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>测试接收JSON格式的数据</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $.post("${pageContext.request.contextPath}/json/testRequestBody2", null, function (data) {
                $.each(data, function () {
                    var tr = $("<tr align='center'/>");
                    $("<td/>").html(this.id).appendTo(tr);
                    $("<td/>").html(this.name).appendTo(tr);
                    $("<td/>").html(this.author).appendTo(tr);
                    $("#booktable").append(tr);
                })
            }, "json");
        });
    </script>
</head>
<body>
<h2>测试接收JSON格式的数据2</h2>
<table id="booktable" border="1" style="border-collapse: collapse;">
    <tr align="center">
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
    </tr>
</table>
</body>
</html>
