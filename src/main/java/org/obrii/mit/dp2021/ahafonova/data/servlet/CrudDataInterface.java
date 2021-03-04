/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.data.servlet;
import java.util.List;
import org.obrii.mit.dp2021.ahafonova.data.Data;
/**
 *
 * @author mahafonova
 */
public interface CrudDataInterface {

    public List<Data> readData();

    public void updateData(int id, Data data);

    public void deleteData(int id);

    public void writeData(List<Data> data);
    
    
    public void newData() ;
}
