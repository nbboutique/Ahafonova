<%-- 
    Document   : form
    Created on : 3 мар. 2021 г., 18:55:14
    Author     : mahafonova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
    </head>
    <body>
        <h1>Data</h1>
        
        <form action="<%=request.getContextPath()%>/table" method="post">
            
            <input type="hidden" name="id" value="0" /> 
            <p>Name:
            <input type="text" name="name"/> </p>
            <p>Email:
            <input type="email" name="email" /> </p>
            <p>Country:
            <input type="text" name="country"/> </p>
            
            <input type="submit" value="Create data" />
        </form>
    </body>
</html>
