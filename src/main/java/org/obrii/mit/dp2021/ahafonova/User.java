/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.ahafonova;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mahafonova
 */
public class User {
    private int id;
    private String name;
    private String gender;
    private List<String> language;
    private String country;
    
    public User(){
    }

    public User(String name, String gender, String[] language, String country) {
        this.name = name;
        this.gender = gender;
        if (language != null) this.language = Arrays.asList(language);
        //if (language != null) Collections.addAll(this.language, language);                
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", gender=" + gender + ", language=" + language + ", country=" + country + '}';
    }

}

