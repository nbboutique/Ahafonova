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
        
        <%
           String filterString = request.getParameter("filter");
           if(filterString == null){filterString= "";}
        %>
    
        <table border="1">
            <form action="<%=request.getContextPath()%>/table" method="get">
                <input type="text"  name="filter" value="<%=filterString%>">
                 <input type="submit" value="search">
            </form>

            <tr>
                <th>id</th>
                <th>name</th>
                <th>email</th>
                <th>country</th>
                <th>update</th>
                <th>delete</th>
            </tr>
            
             <%-- 
            <%
                  
            String query = request.getParameter("q");
            String data1;
            if(query!=null){
                data1 = "select * from crud where name like '%"+query+"%' or email like '%"+query+"%'or country like '%"+query+"%' ";
            }
            else{
                data1 = "select * from crud order by id desc";
            }
            %>
            --%>
           <% for(Data data:dataList){
               if(data.getName().contains(filterString)){
           %>
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

                        <input type="submit" value="Update" style="background-color:green" />
                    </form>
                    
                </td>
                <td>
                    <form action="<%=request.getContextPath()%>/form" method="get">
                        <input type="hidden" name="id" value="<%=data.getId()%>" /> 
                        
                        <input type="submit" value="Delete" style="background-color:red" />
                    </form>
                </td>
                
            </tr>
            
            
            <%}}%>
        </table>
        
        <form action="form.jsp">
                <input type="submit" value="Add data" style="background-color:yellow">
            </form>
</html>
