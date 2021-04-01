/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.database;

import java.util.ArrayList;
import java.util.Iterator;
import org.obrii.mit.dp2021.ahafonova.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author mahafonova
 */
@Component
public class DataBaseSpring {
    
    @Autowired
    DataBaseInterface BDI;
    
    
    public DataBaseSpring(){
        
        
    }
    
    public Iterable<Data> readData(){
 
   
    return BDI.findAll();
    
    }
    
            
    public ArrayList<Data> sortingData(String s){
        Iterable<Data> set = BDI.findAll();
       Iterator<Data> iterator = set.iterator();
        ArrayList<Data> list = new ArrayList<Data>();

        while(iterator.hasNext())
        {
        Data item = iterator.next();
        if(item.getName().contains(s)){
        list.add(item);
        }

 }

   
    return list;
    
    }
    
    public void createData(Data data){
    BDI.save(data);
   
    }
    public void deleteData(Integer id){
    BDI.deleteById(id);
    }
    public void updateData(Data data,Integer id){
    Data upD = BDI.findById(id).get();
        upD.setName(data.getName());
        upD.setEmail(data.getEmail());
        upD.setCountry(data.getCountry());
    
    BDI.save(upD);
    }
    
}