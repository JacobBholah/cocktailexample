package com.cocktailexample.cocktailexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class instruction {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    ///attributes///
    private int instructionid;
    private String description;
    private String glass_Type;
    private String garnish_Name;

    ///constructors///
    public instruction(int instructionid,String description,String glass_Type,String garnish_Name)
    {
        this.instructionid = instructionid;
        this.description = description;
        this.glass_Type = glass_Type;
        this.garnish_Name = garnish_Name;
    }
    ///methods///
    public instruction(){}

    public int getInstructionid(){return instructionid;}
    public void setInstructionid(int instructionid){this.instructionid=instructionid;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public String getGlass_Type() {
        return glass_Type;
    }

    public void setGlass_Type(String glass_Type) {
        this.glass_Type = glass_Type;
    }

    public String getGarnish_Name() {
        return garnish_Name;
    }

    public void setGarnish_Name(String garnish_Name) {
        this.garnish_Name = garnish_Name;
    }

    /*public String toString() {
        return "instructionid="+ instructionid+
                "description=" + description;
    }*/
}