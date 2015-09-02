<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<html>
    <head>

    </head>
    <body style="font-size: 30px;color: red;">
        <%
            //通过请求对象，获得错误提示
            String msg = (String) request.getAttribute("error_msg");
        %>
        <!--相当与out.print() -- >
        <%=msg%>

    </body>

</html>