<%@page contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>
<head></head>
    <body style="font-size: 30px">
    <a href="<%=request.getContextPath()%>/a1.jsp">zai</a>
        <form action="<%=request.getContextPath()%>/some">
            username:<input name="username">
            <input type="submit" value="提交">
        </form>
    </body>

</html>