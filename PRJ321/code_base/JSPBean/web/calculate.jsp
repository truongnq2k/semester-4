<%-- 
    Document   : calculate
    Created on : Jan 14, 2021, 9:53:12 AM
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
        <form action="calculate.jsp">
            Number 1:
            <input type="text" name="num1">
            <br>Number 2:
            <input type="text" name="num2">
            <br> Operator:
            <input type="radio" name="op" value="cong" checked> + 
            <input type="radio" name="op" value="tru"> -
            <input type="radio" name="op" value="nhan"> *
            <input type="radio" name="op" value="chia"> :
            <button type="submit">Calculate</button>
        </form>

        <jsp:useBean id="b" class="bean.Calculator" />
        <jsp:setProperty name="b" property="*" />

        <h1><%= b.getResult()%></h1>
        <h6>${ b.result }</h6>

    </body>
</html>
