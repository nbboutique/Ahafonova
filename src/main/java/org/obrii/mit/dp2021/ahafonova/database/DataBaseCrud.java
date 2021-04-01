/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.obrii.mit.dp2021.ahafonova.data.Data;

/**
 *
 * @author mahafonova
 */
public class DataBaseCrud {
   
  private Connection connect;
  private Statement statement;
  private int id;
    
    public DataBaseCrud(){/*
            try{
                Class.forName("org.postgresql.Driver");
                this.connect = DriverManager.getConnection("jdbc:postgresql://obrii.org:5432/db2021mit21s1", "s1", "5697");
                this.connect.setAutoCommit(false);
                this.statement = this.connect.createStatement();
            }catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
            try{
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS data (id integer primary key not null, name text not null, email text not null, country text not null);");
            connect.commit();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
            id = 1;*/
    }
        
   
    public void createData(Data data) {
        List<Data> datasize = this.readData();
        data.setId(this.id);
        try{
            statement.executeUpdate(String.format("INSERT INTO data (id, name, email, country) VALUES (%d, '%s', '%s', '%s');",
                data.getId(), data.getName(), data.getEmail(), data.getCountry()));
            connect.commit();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        id=id+1;
    }
    
    public List<Data> readData(){
        try {
            ResultSet result = this.statement.executeQuery("SELECT * FROM data");
            List<Data> data = new ArrayList<>();

            while (result.next()) {
                data.add(new Data(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getString("email"),
                        result.getString("country")
                ));
            }

            return data;
        } 
        catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return new ArrayList<>();
        }
    }
    
    public void updateData(int id, Data data) {
        
        try{
            statement.executeUpdate(String.format("UPDATE data "
                        + "SET name='" + data.getName() + "', "
                        + "email='" + data.getEmail() + "', "
                         + "country='" + data.getCountry() + "' "
                + "WHERE id="+id
                ));
            connect.commit();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
    public void deleteData(int id) {
        try{
            statement.executeUpdate("DELETE FROM data WHERE id="+id);
            connect.commit();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}