<%@page pageEncoding="utf-8"
        contentType="text/html;charset=utf-8" %>
<%@page import="entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>修改</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="css/style.css"/>
</head>

<body>
<div id="wrap">
    <div id="top_content">
        <%@include file="header.jsp" %>
        <div id="content">
            <p id="whereami">
            </p>

            <h1>
                修改员工
            </h1>
            <%
                Employee e = (Employee) request.getAttribute("e");
            %>

            <form action="modify.do?id=<%=e.getId()%>" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            id:
                        </td>
                        <td valign="middle" align="left">
                            <%=e.getId()%>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            LN:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri"
                                   name="LastName" value="<%=e.getLastName()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            FN:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri"
                                   name="FirstName" value="<%=e.getFirstName()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            Address:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri"
                                   name="Address" value="<%=e.getAddress()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            City:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri"
                                   name="City" value="<%=e.getCity()%>"/>
                        </td>
                    </tr>
                </table>

                <p>
                    <input type="submit" class="button"
                           value="确定"/>
                </p>
            </form>
        </div>
    </div>
    <%@include file="foot.jsp" %>
</div>
</body>
</html>
