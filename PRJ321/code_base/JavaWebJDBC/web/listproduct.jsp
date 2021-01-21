<%-- 
    Document   : listproduct
    Created on : Jan 20, 2021, 11:58:40 PM
    Author     : admin
--%>

<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display all product</title>
    </head>
    <body>
        <table border="1" style="margin-left: auto; margin-right: auto;">
            <thead>
                <tr>
                    <th>No</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Cat ID</th>
                    <th>Image</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Describe</th>
                    <th>Status</th>
                    <th>Add Date</th>
                </tr>
            </thead>
            <tbody>

                <%
                    if (request.getAttribute("productdata") != null) {
                        List<Product> list = (List<Product>) request.getAttribute("productdata");
                        int no = 1;

                        for (Product l : list) {
                %>

                <tr>
                    <td><%= no++%></td>
                    <td><%= l.getId()%></td>
                    <td><%= l.getName()%></td>
                    <td><%= l.getCat_id()%></td>
                    <td>
                        <img src="<%= l.getImage()%>" style="display: block;
                             margin-left: auto;
                             margin-right: auto;">
                    </td>
                    <td><%= l.getPrice()%></td>
                    <td><%= l.getQuantity()%></td>
                    <td><%= l.getDescribe()%></td>
                    <td><%= l.getStatus()%></td>
                    <td><%= l.getAddDate()%></td>
                </tr>

                <%
                        }
                    }
                %>
            </tbody>
        </table>

    </body>
</html>
