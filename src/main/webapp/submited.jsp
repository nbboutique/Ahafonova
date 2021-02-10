<%-- 
    Document   : submited
    Created on : 10 февр. 2021 г., 19:02:17
    Author     : mahafonova
--%>

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
                            <h1 class="hero-title mt-0">Information about you.</h1>
                            <p>Name is:<span class="Texta"> <%= request.getParameter("name")%></span></p>
                            <p>Country is: <span class="Texta"> <%= request.getParameter("country")%></span></p>
                            <p>Gender is:<span  class="radio"> <%= request.getParameter("gender")%></span></p>
                            <p>Languages is:
                           <span  class="lng"> <%  String[] languages = request.getParameterValues("language");
                            if (languages != null) {
                                    for (int i = 0; i < languages.length; i++) {
                                        out.print(languages[i]);
                                        out.print(", ");
                                    }                 
                                        }else {
                                        out.print("Unselected");
                                        }
                                    %></span></p>
                                    
                                    <div class="hero-cta"><a class="button button-shadow" href="index.jsp">Home page</a>
                                    </div>
                            
			</div> 
                </div>
            </section>
      </main>
    </body>
</html>
