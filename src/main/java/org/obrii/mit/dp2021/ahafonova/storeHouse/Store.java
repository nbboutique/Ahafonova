/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.storeHouse;

/**
 *
 * @author mahafonova
 */


import java.util.ArrayList;
import java.util.List;
import org.obrii.mit.dp2021.ahafonova.data.Data;

public class Store {
    
    
        private static List<Data> dataStore;
        private static Store storeInstance = new Store();
        private Store(){
            dataStore = new ArrayList<>();
            //dataStore.add(new Data(0,"Name", "Email","Country"));
            
    }
    public static Store getInstance(){
        return storeInstance;
    }
    public static List<Data> getStore(){
        return dataStore;
    
    }
    }
   
