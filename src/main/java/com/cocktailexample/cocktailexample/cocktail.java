package com.cocktailexample.cocktailexample;
import com.google.gson.Gson;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
@Entity
public class cocktail {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    ///attributes///
    private int id;
    private String name;
    private String type;

    ///constructors///
    //private List<cocktailinstructions> cocktail= new ArrayList();//
    public cocktail(String name, String type) {
        this.name=name;
        this.type=type;
        //this.cocktail.add(new cocktailinstructions(1,1));//
    }
    ///methods///

    public cocktail(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /*public String toString() {
        String json = new Gson().toJson(cocktail);
        return json;*/
    }
