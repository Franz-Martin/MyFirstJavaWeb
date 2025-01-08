<%-- 
    Document   : index
    Created on : 07.01.2025, 12:22:33
    Author     : trainer
--%>

<%@page import="com.ibb.servlet.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="servlet"> Zum Servlet </a><br>
        <a href="second"> Zum Second Servlet </a>
        <%!
          String text="</br><h2>Hallo Jsp World</h2></br>"; 
            %>
        
        <% 
            
                String t="Hallo";
            
            
            
            Person p=new Person();
           String id=request.getSession().getId();
           //response.sendRedirect(location);
           for(int i=1;i<5; i++){
           out.print(text);
           request.setAttribute("text", text);
           session.setAttribute("text", text);
           application.setAttribute("text", text);
           pageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE);
        }%>
    </body>
</html>
