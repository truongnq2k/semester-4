<%-- 
    Document   : updatecategory
    Created on : Jan 20, 2021, 11:51:18 PM
    Author     : admin
--%>

<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update category</title>
        <style>
            form input{
                margin: 5px;
                width: 100px;
            }
        </style>
    </head>
    <body>
        
        <%
          Category c = (Category)request.getAttribute("cat");
        %>
        
        <form action="categoryupdate" method="POST" >
            ID: <input type="text" name="id" value="<%= c.getId() %>"> <br>
            Name: <input type="text" name="name" id="" value="<%= c.getName() %>"> <br>
            Describe: <input type="text" name="describe" id="" value="<%= c.getDescribe() %>"> <br>
            <button type="submit">Update</button>
        </form>
    </body>
</html>
