<%@page contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>
    <head></head>
    <body style="font-size: 30px">
    a1 的内容<br>
    <a href="../a2.jsp">访问a2</a><br>
    <a href="<%=request.getContextPath()%>/a2.jsp">再访问a2</a>
    </body>

</html>