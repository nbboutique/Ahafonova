<%-- 
    Document   : form
    Created on : 10 февр. 2021 г., 18:51:01
    Author     : mahafonova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
        
        <link href="https://fonts.googleapis.com/css?family=Heebo:400,500,700|Playfair+Display:700" rel="stylesheet">
        <link href="css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
   <body>
      <form action="/Ahafonova/form" method="post">
          <input type="hidden" name="title" value="Submited"/>
      <main>
            <section class="hero">
                <div class="container">
			<div class="hero-copy">
                            <h1 class="hero-title mt-0">Fill in the form. </h1>
                        <p>
                            Name: <input class="Texta" type="text" name="name" required>
                        </p>
                        <p>
                            Country : <input class="Texta" type="text" name="country" required>
                        </p>
                        
                        <p>
                            Gender: <span class="radio"><input type="radio" name="gender" value="Male">Male</span>
                                    <span class="radio"><input type="radio" name="gender" value="Female">Female</span>
                        </p>
                        <p>
                           Language: <input class="lng" type="checkbox" name="language" value="Ukrainian">Ukrainian</input>
                                     <input class="lng" type="checkbox" name="language" value="English">English</input>  
                                     <input class="lng" type="checkbox" name="language" value="English">German</input> 
                        </p>
                       
	                        <div class="hero-cta"><input class="button" type="submit" value="Submit"></div>
                    </div>
                </div>
            </section>
      </main>
      </form>
    </body>
</html>
