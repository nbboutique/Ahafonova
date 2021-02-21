<%-- 
    Document   : submited
    Created on : 10 февр. 2021 г., 19:02:17
    Author     : mahafonova
--%>

<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.Ahafonova.UserInterface"%>
<%@page import="org.obrii.mit.dp2021.Ahafonova.Application"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ahafonova</title>
        
        
        <link href="https://fonts.googleapis.com/css?family=Heebo:400,500,700|Playfair+Display:700" rel="stylesheet">
        <link href="css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <main>
            <section class="hero">
                <div class="container">
			<div class="hero-copy">
                            <%
        
        Application app = (Application)request.getAttribute("app");
        UserInterface user = app.getUser();
    %>
    <p>Name is: <%= user.getName()%></p><br>
    
    <p>Gender is: 
    <%
    String gender = user.getGender();
    if (gender == null) {
        out.print("unknown");
    }
    else out.print(gender);
    %>
    </p><br>

    <p>Languages is:
    <%
    List<String> languages = user.getLanguage();
    if (languages != null) {
    for (int i = 0; i < languages.size(); i++) {
            out.print(languages.get(i)+" ");
        }                 
        }else {
        out.print("no choose");
        }
    %>
    </p><br>
    <br>
    <p>Country: 
    <%
    String country = user.getCountry();
    if (country == null) {
        out.print("unknown");
    }
    else out.print(country);
    %>
    </p>
    <br>
    <p>Privileges:  
    <%=
        user.getIsTeacher()
    %>
    </p>
                                    
                                    <div class="hero-cta"><a class="button button-shadow" href="index.jsp">Home page</a>
                                    </div>
                            
			</div> 
                </div>
            </section>
      </main>
    </body>
</html>
