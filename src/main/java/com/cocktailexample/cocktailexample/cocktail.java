package com.cocktailexample.cocktailexample;
import com.cocktailexample.cocktailexample.cocktailinstructions;

import java.util.ArrayList;
import java.util.List;

public class cocktail {
    ///attributes///
    private String name;
    private String type;

    ///constructors///
    private List<cocktailinstructions> cocktail= new ArrayList();
    public cocktail(String name, String type) {
        this.name=name;
        this.type=type;
        this.cocktail.add(new cocktailinstructions(1,1));
    }
    ///methods///

    public String toString()
    {
        return "name="+name+
                "type="+type;
    }

}
