package com.cocktailexample.cocktailexample;

import org.springframework.context.annotation.EnableMBeanExport;

import java.util.ArrayList;
import java.util.List;

public class cocktailinstructions {
    ///attributes///
    private int cocktailinstructionsid;
    private int stepnumber;


    ///constructors///
    private List<instruction> cocktailinstructions= new ArrayList();

    public cocktailinstructions(int cocktailinstructionsid,int stepnumber)
    {
        this.cocktailinstructionsid=cocktailinstructionsid;
        this.stepnumber=1;
        this.cocktailinstructions.add(new instruction(1,"pour the vodka in the shot glass"));
        this.stepnumber=2;
        this.cocktailinstructions.add(new instruction(2,"pour the shot glass into the blender"));
        this.stepnumber=3;
        this.cocktailinstructions.add(new instruction(3,"blend the mixture"));
    }


    ///methods///

    public String toString() {
        return "cocktailinstructionsid="+cocktailinstructionsid+
                "stepnumber=" + stepnumber;
    }
}
