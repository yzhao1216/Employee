<%@page pageEncoding="utf-8"
        contentType="text/html;charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>添加员工</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <!-- 包含header.jsp -->
        <%@include file="header.jsp"%>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                添加员工
            </h1>
            <form action="add.do" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            ID:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="id" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            LN:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="LastName" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            FN:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="FirstName" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            Address:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="Address" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            City:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="City" />
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button"
                           value="确定" />
                </p>
            </form>
        </div>
    </div>
    <!--包含一个foot -->
    <%@include file="foot.jsp"%>
</div>
</body>
</html>
