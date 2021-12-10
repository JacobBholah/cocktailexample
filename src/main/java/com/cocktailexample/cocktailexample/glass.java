package com.cocktailexample.cocktailexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class glass {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    ///attributes///
    private int id;
    private String type;
    private int volume;

    ///constructors///
    public glass(String type,int volume) {
        this.type = type;
        this.volume = volume;
    }
    ///methods///

    public glass(){}

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public int getVolume(){return volume;}
    public void setVolume(int volume){this.volume=volume;}

    /*public String toString()
    {
        return "type="+type+
                "volume="+volume;
    }*/
}

