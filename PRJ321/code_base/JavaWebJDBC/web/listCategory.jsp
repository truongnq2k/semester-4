<%-- 
    Document   : listCategory
    Created on : Jan 20, 2021, 10:26:19 PM
    Author     : admin
--%>

<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display all category in database</title>
    </head>
    <body>
        <a href="addnewcategory.jsp">Add new</a>
        <br><br>
        <table border="1" cellpadding="5">
            <thead>
                <tr>
                    <th>No</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Describe</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>

                <%
                    if (request.getAttribute("data") != null) {
                        List<Category> list = (List<Category>) request.getAttribute("data");
                        int no = 1;
                        for (Category c : list) {
                            String id = c.getId();
                %>

                <tr>
                    <td><%= no++%></td>
                    <td><%= id%></td>
                    <td><%= c.getName()%></td>
                    <td><%= c.getDescribe()%></td>
                    <td>
                        <a href="categorydelete?id=<%= id%>">Delete</a> |
                        <a href="categoryupdate?id=<%= id%>">Edit</a>
                    </td>
                </tr>
                <%
                        }
                    }
                %>

            </tbody>
        </table>


    </body>
</html>
