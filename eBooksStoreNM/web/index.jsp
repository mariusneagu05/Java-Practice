<%-- 
    Document   : index
    Created on : May 22, 2017, 8:58:28 PM
    Author     : MariusNeagu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./CSS/eBooksStoreCSS.css">
        <title>eBooks Store</title>
    </head>
    <body>
        <c:set var="activePage" value="Index" scope="session"></c:set>
            <h3>Welcome to Electronic Books Store</h3>  

            <table class="tablecenterdwithborder">
                <form action="${pageContext.request.contextPath}/Index" method="POST">
                <tr><td>Username: </td><td><input class = "input" type="text" name="LoginPage_Username"></input></td></tr> 
                <tr><td>Password: </td><td><input class = "input" type="password" name="LoginPage_Password"></input></td></tr> 
                <tr><td></td><td><input type="submit" name="LoginPage_Login" value="Login"></input></td></tr>
                </form>
        </table>
    </body>
</html>