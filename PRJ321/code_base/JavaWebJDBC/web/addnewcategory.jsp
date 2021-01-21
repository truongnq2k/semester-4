<%-- 
    Document   : addnewcategory
    Created on : Jan 20, 2021, 11:04:36 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new category</title>
        <style>
            form input{
                margin: 5px;
                width: 100px;
            }
        </style>
    </head>
    <body>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="categoryaddnew" method="POST" >
            ID: <input type="text" name="id" id=""> <br>
            Name: <input type="text" name="name" id=""> <br>
            Describe: <input type="text" name="describe" id=""> <br>
            <button type="submit">Add</button>
        </form>
    </body>
</html>
