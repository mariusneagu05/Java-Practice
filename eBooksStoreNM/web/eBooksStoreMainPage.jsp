
<%-- 
    Document   : eBooksStoreMainPage
    Created on : May 22, 2017, 8:55:36 PM
    Author     : MariusNeagu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main page</title>
        <link rel="stylesheet" type="text/css" href="./CSS/eBooksStoreCSS.css">
    </head>
    <body>
        <c:out value="In pagina main!"></c:out>
        <%-- test if a valid user is logged in --%>
        <c:choose>
            <c:when test="${validUser == true}"> <%-- if a valid user is logged than display page --%>
                <%@ include file="eBooksStoreMenu.jsp" %>
            </c:when>
            <c:otherwise> <%-- if no valid user than open Authentication and authorization that is index.jsp  page --%>
                <c:redirect url="./index.jsp"></c:redirect>
            </c:otherwise>
        </c:choose>
    </body>
</html>