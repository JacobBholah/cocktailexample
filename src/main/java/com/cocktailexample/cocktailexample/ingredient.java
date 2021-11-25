package com.cocktailexample.cocktailexample;

public class ingredient {

    ///attributes///
    private int ingredientid;
    private String name;
    private String type;
    private int ABV;
    private String storage;
    private String description;
    ///constructors///
    public ingredient(int ingredientid,String name,String type,int ABV,String storage,String description)
    {
        this.ingredientid=ingredientid;
        this.name=name;
        this.type=type;
        this.ABV=ABV;
        this.storage=storage;
        this.description=description;
    }

    ///methods///

    public String toString() {
        return "ingredientid="+ ingredientid+
                "name="+ name+
                "type="+type+
                "ABV="+ABV+
                "storage="+storage+
                "description="+description;
    }
}
