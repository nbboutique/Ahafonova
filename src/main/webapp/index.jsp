<%-- 
    Document   : index
    Created on : 3 мар. 2021 г., 21:07:59
    Author     : mahafonova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  style="background-color:lightpink; margin-left: 40%;">
        <h1>Hello World!</h1>
        <form action="<%=request.getContextPath()%>/DataBase" method="get">
                <input  type="submit" value="Next"> 
                </form>
    </body>
</html>
