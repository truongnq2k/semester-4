<%-- 
    Document   : listview
    Created on : Jan 12, 2021, 11:41:09 AM
    Author     : hacken006
--%>

<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Gender</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <% if (request.getAttribute("data") != null) {
                            List<Student> ls = (List<Student>) request.getAttribute("data");
                            for (Student s : ls) {
                                int id = s.getId();
                                String name = s.getName();
                                int age = s.getAge();
                                boolean gender = s.isGender();

                    %>
                <tr>                
                    <td><%= id%></td>
                    <td><%= name%></td>
                    <td><%= age%></td>
                    <td><img src=<%=gender?"assets/images/female-icon.png":"assets/images/male-icon.png"%> alt=""></td>
                </tr>
                <% }
                    }%>
                </tr>
            </tbody>
        </table>

    </body>
</html>
