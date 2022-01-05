package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.cocktail;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CocktailTest {

    @Test
    public void testcocktail()
    {
        cocktail testcocktail = new cocktail("Long Island","Alcoholic");
        assertEquals("wrong name",testcocktail.getName(),"Long Island");
    }
}

