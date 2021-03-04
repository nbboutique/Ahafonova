/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.storeHouse;

import java.io.File;
import java.util.List;
import org.obrii.mit.dp2021.ahafonova.data.Data;

/**
 *
 * @author mahafonova
 */
public class StoreCrud {
    
    private List<Data> dataList = Store.getStore();
    
    public StoreCrud() {
        
    }

    public StoreCrud(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void createData(Data data) {
        data.setId(dataList.size());
        dataList.add(data);
    
    }
    public List<Data> readData(){
        return dataList;
    
    }
    
    public void updateData(int id, Data data) {
        data.setId(id);
        dataList.set(id,data);
    
    }
    public void deleteData(int id) {
        dataList.remove(id);
    
    }
}