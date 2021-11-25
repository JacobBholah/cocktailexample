package com.cocktailexample.cocktailexample;

public class instruction {
    ///attributes///
    private int instructionid;
    private String description;

    ///constructors///
    public instruction(int instructionid,String description)
    {
        this.instructionid = instructionid;
        this.description = description;
    }
    ///methods///

    public String toString() {
        return "instructionid="+ instructionid+
                "description=" + description;
    }
}