/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.data.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.obrii.mit.dp2021.ahafonova.data.Data;
import org.obrii.mit.dp2021.ahafonova.database.DataBaseCrud;


/**
 *
 * @author mahafonova
 */

@WebServlet(name = "DataServlet", urlPatterns = {"/table"})
public class DataServlet extends HttpServlet {
    DataBaseCrud storeCrud = new DataBaseCrud();
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("data", storeCrud.readData());
        request.getRequestDispatcher("table.jsp").forward(request, response);
    }

 
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int myId;
        myId = Integer.parseInt( request.getParameter("id"));

        storeCrud.updateData(myId,
                new Data(
                        myId,
                        request.getParameter("name"),
                        request.getParameter("email"),
                        request.getParameter("country")
                )
        );
        doGet(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
                storeCrud.createData(
                new Data(Integer.parseInt(request.getParameter("id")),
                        request.getParameter("name"),
                        request.getParameter("email"),
                        request.getParameter("country") ));
                doGet(request, response);
            }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int myId;
        myId = Integer.parseInt( request.getParameter("id"));
        storeCrud.deleteData( myId );
        doGet(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}