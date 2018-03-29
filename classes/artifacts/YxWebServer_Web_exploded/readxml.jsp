<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>测试接收XML格式的数据</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $.ajax("${pageContext.request.contextPath}/readxml", {
                dataType: "xml",
                type: "POST",
                async: true,
                success: function (xml) {
                    console.log(new XMLSerializer().serializeToString(xml));
                    var book2 = $(xml).find('book2');
                    var id = book2.children('id').text();
                    var name = book2.children('name').text();
                    var author = book2.children('author').text();
                    var tr = $("<tr align='center'/>");
                    $("<td/>").html(id).appendTo(tr);
                    $("<td/>").html(name).appendTo(tr);
                    $("<td/>").html(author).appendTo(tr);
                    $("#booktable").append(tr);
                },
                error: function () {
                    alert("数据接收失败");
                }
            });
        });
    </script>
    <style>
        th {
            color: red;
            font-family: 宋体;
        }
    </style>
</head>
<body>
<h2>测试返回XMl格式的数据</h2>
<table id="booktable" border="1" style="border-collapse: collapse;">
    <tr align="center">
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
    </tr>
</table>
</body>
</html>
