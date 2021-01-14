<%-- 
    Document   : cal.jsp
    Created on : Jan 12, 2021, 11:30:43 AM
    Author     : hacken006
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="cal.jsp">
            Enter radius: <input type="text" name="radius">
            <button type="submit">Calculator</button>
        </form>

        <% if (request.getParameter("radius") != null) {
                double r;
                try {
                    r = Double.parseDouble(request.getParameter("radius"));
                } catch (Exception e) {
                    r = 0;
                }
                double s = r * r * Math.PI;
        %>
        <h2> Area: <%=s%> </h2>
        <%
            }
        %>



    </body>
</html>
