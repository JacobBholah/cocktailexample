package com.cocktailexample.cocktailexample;

public class glass {
    ///attributes///
    private String type;
    private int volume;

    ///constructors///
    public glass( String type,int volume) {
        this.type = type;
        this.volume = volume;
    }
    ///methods///

    public String toString()
    {
        return "type="+type+
                "volume="+volume;
    }
}

