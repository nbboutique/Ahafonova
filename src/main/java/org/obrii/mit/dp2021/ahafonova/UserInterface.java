package org.obrii.mit.dp2021.Ahafonova;


import java.util.List;

public interface UserInterface {
    String getName();
    void setName(String name);
    
    String getGender();
    void setGender(String gender);
    
    List<String> getLanguage();
    void setLanguage(List<String> language);
    
    String getCountry();
    void setCountry(String country);
    
    String getIsAdmin();
}
