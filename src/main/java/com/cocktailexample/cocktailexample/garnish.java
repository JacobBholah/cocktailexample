package com.cocktailexample.cocktailexample;

public class garnish {
    ///attributes///
    private String name;
    private String type;

    ///constructors///
    public garnish(String name, String type) {
        this.name = name;
        this.type = type;
    }
    ///methods///

    public String toString()
    {
        return "name="+name+
                "type="+type;
    }
}