<%@ page import="entity.Employee" %>
<%@ page import="dao.EmployeeDAO" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<html>
<head>
    <style>
        table {
            font-style: italic;
            font-size: 24px;
        }
        .row1{
            background-color: aliceblue;
        }
        .row2{
            background-color: antiquewhite;
        }
    </style>
</head>
<body style="font-size: 30px">
<table border="1" width="60%" cellpadding="0" cellspacing="0">
    <tr>
        <td>ID</td>
        <td>LN</td>
        <td>FN</td>
        <td>AD</td>
        <td>City</td>
    </tr>
    <%
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> employees = dao.findAll();
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            %>
            <tr class="row<%=(i%2+1)%>">
                <td><%=e.getId()%></td>
                <td><%=e.getLastName()%></td>
                <td><%=e.getFirstName()%></td>
                <td><%=e.getAddress()%></td>
                <td><%=e.getCity()%></td>
            </tr>
            <%
        }
    %>

</table>

</body>

</html>