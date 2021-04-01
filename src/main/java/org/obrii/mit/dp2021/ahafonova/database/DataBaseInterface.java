/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova.database;

import org.obrii.mit.dp2021.ahafonova.data.Data;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mahafonova
 */
public interface DataBaseInterface  extends CrudRepository<Data, Integer>{
    
}
