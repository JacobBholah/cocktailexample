package com.cocktailexample.cocktailexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class equipment {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    ///attributes//
    private int id;
    private String name;
    private String type;

    ///constructors///
    public equipment(String name, String type) {
        this.name = name;
        this.type = type;
    }
    ///methods///
    public equipment(){}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    /*public String toString()
    {
        return "name="+name+
                "type="+type;
    }*/
}

