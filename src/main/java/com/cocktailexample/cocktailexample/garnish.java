package com.cocktailexample.cocktailexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class garnish {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    ///attributes///
    private int id;
    private String name;
    private String type;

    ///constructors///
    public garnish(int id,String name, String type) {
        this.id=id;
        this.name = name;
        this.type = type;
    }
    ///methods///
    public garnish(){}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public String toString()
    {
        return "name="+name+
                "type="+type;
    }*/
}