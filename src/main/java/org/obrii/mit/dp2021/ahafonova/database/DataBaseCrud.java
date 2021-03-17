/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.database;

import org.obrii.mit.dp2021.ahafonova.storeHouse.*;
import java.io.File;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.obrii.mit.dp2021.ahafonova.data.Data;

/**
 *
 * @author mahafonova
 */
public class DataBaseCrud {
   
    
        
    
    public DataBaseCrud() throws SQLException{
        List<Data> datalist = new ArrayList<>();
            Connection connection = PostgreConnection.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from data");            
            while( resultSet.next()){
            datalist.add(new Data(Integer.parseInt(resultSet.getString(1))  ,
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4) ));
            
            
            }
    }
        
   /*

    public DataBaseCrud(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void createData(Data data) {
        data.setId(dataList.size());
        dataList.add(data);
    
    }*/
    /*
    public List<Data> readData() throws SQLException{
        List<Data> datalist = new ArrayList<>();
    Connection connection = PostgreConnection.connect();
    Statement statement ;
    try{
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from data");
    
    }catch(SQLException ex){
        Logger.getLogger(DataBaseCrud.class.getName().log(Level.SERVE, null,))
    }
    
    
        return dataList;
    
    }
    */
    public void updateData(int id, Data data) {
        
    }
    public void deleteData(int id) {
        
    }
}