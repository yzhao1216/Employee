<%@page pageEncoding="utf-8"
        contentType="text/html;charset=utf-8" %>
<%@page import="java.util.*,java.text.*" %>
<%@page import="dao.*,entity.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>员工管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    <%
                        Date date = new Date();
                        SimpleDateFormat sdf =
                                new SimpleDateFormat("yyyy-MM-dd");
                    %>
                    <%=sdf.format(date) %>
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                员工列表
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        LN
                    </td>
                    <td>
                        FN
                     </td>
                    <td>
                        AD
                    </td>
                    <td>
                        CITY
                    </td>
                    <td>
                        Action
                    </td>
                </tr>
                <%
                    EmployeeDAO dao =
                            new EmployeeDAO();
                    List<Employee> employees =
                            dao.findAll();
                    for(int i = 0; i < employees.size(); i++){
                        Employee e = employees.get(i);
                %>
                <tr class="row<%=(i % 2 + 1) %>">
                    <td>
                        <%=e.getId()%>
                    </td>
                    <td>
                        <%=e.getLastName()%>
                    </td>
                    <td>
                        <%=e.getFirstName()%>
                    </td>
                    <td>
                        <%=e.getAddress()%>
                    </td>
                    <td>
                        <%=e.getCity()%>
                    </td>
                    <td>
                        <a href="emplist.html">删除</a>&nbsp;
                        <a href="updateEmp.html">修改</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
            <p>
                <input type="button" class="button"
                       value="添加员工" onclick="location='addEmp.html'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
