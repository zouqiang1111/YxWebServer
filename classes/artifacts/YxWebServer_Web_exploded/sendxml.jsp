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
            var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><book2><id>1</id><name>SpringMVC 企业应用实战</name><author>邹强</author></book2>";
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/sendxml",
                dataType: "xml",
                contentType: "application/xml",
                data: xmlData,
                async: true,
                success: function (data) {
                    console.log(new XMLSerializer().serializeToString(data));
                },
                error: function () {
                    alert("数据发送失败");
                }
            })
        });
    </script>
</head>
<body>
<h2>测试接收XMl格式的数据</h2>
</body>
</html>
