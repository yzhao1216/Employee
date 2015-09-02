<%@page contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>
    <head></head>
    <body style="font-size: 30px">
        a2 的内容<br>
    <a href="biz01/a1.jsp">访问a1</a>
    <a href="<%=request.getContextPath()%>/a1.jsp">zai</a>
    </body>

</html>