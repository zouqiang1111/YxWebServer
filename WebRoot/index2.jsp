<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>测试接收JSON格式的数据</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/json/testRequestBody",
                dataType: "json",
                contentType: "application/json",
                data: JSON.stringify({
                    id: 1,
                    name: "SpringMVC 企业应用实战"
                }),
                async: true,
                success: function (data) {
                    console.log(data);
                    $("#id").html(data.id);
                    $("#name").html(data.name);
                    $("#author").html(data.author);
                },
                error: function () {
                    alert("数据发送失败");
                }
            });
        });
    </script>
    <style type="text/css">
        span, p {
            font-family: 宋体;
            font-size: 16px;
            color: #1d1007;
        }

        span {
            color: blue;
        }
    </style>
</head>
<body>
<h2>测试接收JSON格式的数据</h2>
<p>
    编号：<span id="id"></span>
</p>
<p>
    书名：<span id="name"></span>
</p>
<p>
    作者：<span id="author"></span>
</p>
</body>
</html>
