package org.obrii.mit.dp2021.Ahafonova;


import java.util.Arrays;
import java.util.List;

public class User implements UserInterface {
    private String name;
    private String gender;
    private List<String> language;
    private List<String> classes;
    private String country;
    private boolean isTeacher;
    

    
    public User() {
    }

    public User(String name, String gender, String[] language, String[] classes, String country, boolean isTeacher) {
        this.name = name;
        this.gender = gender;
        
        if (language != null ){
            this.language = Arrays.asList(language);
        }
        if (classes != null ){
            this.classes = Arrays.asList(classes);
        }
        this.country = country;
        this.isTeacher= isTeacher;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public List<String> getLanguage() {
        return language;
    }

    @Override
    public void setLanguage(List<String> language) {
        this.language = language;
    }
    @Override
    public List<String> getClasses() {
        return classes;
    }

    @Override
    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Override
    public String getIsTeacher() {
        return isTeacher ? "You`re teacher":"You`re standart user";
    }

    
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", gender=" + gender + ", classes=" + classes + ", language=" + language + ", country=" + country + '}';
    }

}
