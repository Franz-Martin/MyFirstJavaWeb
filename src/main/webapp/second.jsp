<%-- 
    Document   : second
    Created on : 10.01.2025, 10:32:19
    Author     : trainer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:out value="${webController.getText()}" />
        <a href="servlet"> Zum Servlet </a><br>
        <a href="second"> Zum Second Servlet </a>

        <c:set var="text" value="</br><h2>Hallo Jsp World</h2></br>" />
        <c:forEach begin="1" end="5" var="i">
            <c:choose>
                <c:when test="${i < 2}">
                    <c:out value="i ist kleiner 2" />
                </c:when>  
                <c:when test="${i> 3}">
                     <c:out value="i istgrößer 3" />
                </c:when>  
                <c:otherwise>
                   <c:out value="i ist anders" />
                </c:otherwise>

            </c:choose>
            <c:out value="${text}" escapeXml="false"/>
        </c:forEach>
    </body>
</html>
