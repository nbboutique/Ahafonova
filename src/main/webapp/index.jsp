<%-- 
    Document   : index
    Created on : 10 февр. 2021 г., 13:13:43
    Author     : mahafonova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link href="https://fonts.googleapis.com/css?family=Heebo:400,500,700|Playfair+Display:700" rel="stylesheet">
        <link href="css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
      <main>
            <section class="hero">
                <div class="container">
                    <div class="hero-inner">
			<div class="hero-copy">
	                        <h1 class="hero-title mt-0">Welcome to my page!</h1>
	                        <p class="hero-paragraph">I am a second year student of the Faculty of Information Technology at the Department of Network and Internet Technologies</p>
                                <img src="img/chart.png" alt="photo">
	                        <div class="hero-cta"> <form action="<%=request.getContextPath()%>/form" method="get">
                                        <input class="button" type="submit" value="Next"/>
                                        
                                    </form></div>
						</div>
							
							</div>
						</div>
                    </div>
               
            </section>
      </main>
    </body>
</html>
