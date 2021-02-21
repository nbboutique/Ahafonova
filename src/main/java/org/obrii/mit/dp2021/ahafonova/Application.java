package org.obrii.mit.dp2021.Ahafonova;


import javax.servlet.http.HttpServletRequest;

public abstract class Application {

    protected UserInterface user;
    public Application() {
    }
    
    public void setUser(HttpServletRequest request){
        user = new User(
        request.getParameter("name"),
        request.getParameter("gender"),
        request.getParameterValues("language"),
        request.getParameterValues("classes"),
        request.getParameter("country"),false);
    }
    
    public abstract void setUser(HttpServletRequest request, boolean isTeacher);
    
    final public UserInterface getUser(){
    return user;
    }
    
}
