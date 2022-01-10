package com.cocktailexample.cocktailexample;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
@Entity
public class cocktailinstructions {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    ///attributes///
    private int cocktailinstructionsid;
    private int stepnumber;
    private int instructionid;
    private String cocktail_Name;


    ///constructors///
    //private List<instruction> cocktailinstructions= new ArrayList();//

    public cocktailinstructions(int cocktailinstructionsid,int stepnumber,int instructionid,String cocktail_Name)
    {
        this.cocktailinstructionsid=cocktailinstructionsid;
        this.stepnumber=stepnumber;
        this.instructionid=instructionid;
        this.cocktail_Name=cocktail_Name;
        /*this.cocktailinstructions.add(new instruction(1,"pour the vodka in the shot glass"));
        this.stepnumber=2;
        this.cocktailinstructions.add(new instruction(2,"pour the shot glass into the blender"));
        this.stepnumber=3;
        this.cocktailinstructions.add(new instruction(3,"blend the mixture"));*/
    }


    ///methods///

    public cocktailinstructions(){}

    public int getCocktailinstructionsid() {
        return cocktailinstructionsid;
    }

    public void setCocktailinstructionsid(int cocktailinstructionsid) {this.cocktailinstructionsid = cocktailinstructionsid;}

    public int getStepnumber() {
        return stepnumber;
    }

    public void setStepnumber(int stepnumber) {
        this.stepnumber = stepnumber;
    }

    public int getInstructionid() {
        return instructionid;
    }

    public void setInstructionid(int instructionid) {
        this.instructionid = instructionid;
    }

    public String getCocktail_Name() {
        return cocktail_Name;
    }

    public void setCocktail_Name(String cocktail_Name) {
        this.cocktail_Name = cocktail_Name;
    }

    public String toString() {
        return "cocktailinstructionsid="+cocktailinstructionsid+
                "stepnumber=" + stepnumber;
    }
}
