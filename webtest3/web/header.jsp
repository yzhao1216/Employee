<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
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
</div>