<%-- 
    Document   : table
    Created on : 2 мар. 2021 г., 11:54:02
    Author     : mahafonova
--%>


<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.ahafonova.data.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>first page</title>
    </head>
    
        <h1>Hello World!</h1>
        
        <%List<Data> dataList = (List<Data>) request.getAttribute("data");%>
    
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>email</th>
                <th>country</th>
                <th>update</th>
                <th>delete</th>
            </tr>
            <%for(Data data:dataList){ %>
            <tr>
                <td><%=data.getId()%></td>
                <td><%=data.getName()%></td>
                <td><%=data.getEmail()%></td>
                <td><%=data.getCountry()%></td>
                <td>
                    <form action="form_update.jsp" method="post">
                        <input type="hidden" name="id" value="<%=data.getId()%>" /> 
                        
                        <input type="hidden" name="name" value="<%=data.getName()%>"/> 
                        
                        <input type="hidden" name="email" value="<%=data.getEmail()%>"/> 
                        
                            <input type="hidden" name="country" value="<%=data.getCountry()%>"/> 

                        <input type="submit" value="Update" />
                    </form>
                    
                </td>
                <td>
                    <form action="<%=request.getContextPath()%>/form" method="get">
                        <input type="hidden" name="id" value="<%=data.getId()%>" /> 
                        
                        <input type="submit" value="Delete" />
                    </form>
                </td>
                
            </tr>
            
            
            <%}%>
        </table>
        
        <form action="form.jsp">
                <input type="submit" value="Add data">
            </form>
</html>
