package org.obrii.mit.dp2021.Ahafonova;


import javax.servlet.http.HttpServletRequest;

public class AdminApplication extends Application {

    @Override
    public void setUser(HttpServletRequest request, boolean isAdmin) {
            user = new User(
                
                request.getParameter("name"),
                request.getParameter("gender"),
                request.getParameterValues("language"),
                request.getParameter("country"),isAdmin);
    }
}
