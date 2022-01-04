package com.cocktailexample.cocktailexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cocktailTest {
    @Test
    public void cocktailTest()
    {
        cocktail testcocktail = new cocktail("Long Island Ice Tea","Alcoholic");
        assertEquals("Long Island Ice Tea",testcocktail.getName(),"wrong name");
        assertEquals("Alcoholic",testcocktail.getType(),"wrong type");

    }
}