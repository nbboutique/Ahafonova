/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.data.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.obrii.mit.dp2021.ahafonova.data.Data;
import org.obrii.mit.dp2021.ahafonova.database.DataBaseSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author mahafonova
 */

@WebServlet(name = "BDServlet", urlPatterns = {"/table"})
public class BDServlet extends HttpServlet {
    String  formType1 = "update"; 
    
    @Autowired
    DataBaseSpring BaseSpring;
    
    @Override
   public void init(ServletConfig config) throws ServletException {
    super.init(config);
    SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
    
    }
    
    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        HttpSession session  = request.getSession();
        session.setAttribute("formType1", formType1);
        System.out.println(request.getParameter("search"));
        if(request.getParameter("search")!=null){
            
            
            //DataStore data;
            //try {
                //data = new DataStore();
                request.setAttribute("data", BaseSpring.sortingData(request.getParameter("search")));
            //} 
            //catch (SQLException ex) {
               // Logger.getLogger(BDServlet.class.getName()).log(Level.SEVERE, null, ex);
            //}
        }
        else{
            //DataStore data = new DataStore();
           // Iterator<Data> iterator = (Iterator<Data>) BaseSpring.readData();
            
            //if(iterator == null){
          
            //}else{
            request.setAttribute("data",
            BaseSpring.readData()
            
            );
            //}
            
            
            
        }
        request.getRequestDispatcher("table.jsp").forward(request, response); 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                //BaseInteractions baseI = new BaseInteractions("jdbc:postgresql://obrii.org:5432/db2021mit21s13","s13","6746");
                formType1="create";
                Data newData = new Data(request.getParameter("name"),request.getParameter("email"),request.getParameter("country"));
                
                BaseSpring.createData(newData);
                doGet(request, response);
    }

    
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                int myId = Integer.parseInt(request.getParameter("id"));
                formType1="update";
                
                Data newData = new Data(request.getParameter("name"),request.getParameter("email"),request.getParameter("country"));
                BaseSpring.updateData(newData, myId);
                
                //BaseInteractions baseI = new BaseInteractions("jdbc:postgresql://obrii.org:5432/db2021mit21s13","s13","6746");
                //baseI.updataData(request.getParameter("name"), "name",myId);
                //baseI.updataData(request.getParameter("age"),"age",myId);
                doGet(request, response);
            }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                //BaseInteractions baseI = new BaseInteractions("jdbc:postgresql://obrii.org:5432/db2021mit21s13","s13","6746");       
                int myId = Integer.parseInt(request.getParameter("id"));
                 BaseSpring.deleteData(myId);
                
                //baseI.deleteData(myId);
                doGet(request, response);
            }
    
        @Override
    public String getServletInfo() {
        return "Short description";
    }

}
