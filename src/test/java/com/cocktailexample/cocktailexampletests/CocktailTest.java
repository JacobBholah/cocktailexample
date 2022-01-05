package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.cocktail;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CocktailTest {

    @Test
    public void testcocktail()
    {
        cocktail testcocktail = new cocktail();
        testcocktail.setName("Long Island");
        testcocktail.setType("Alcoholic");
        assertEquals("wrong name",testcocktail.getName(),"Long Island");
        assertEquals("wrong type",testcocktail.getType(),"Alcoholic");

        cocktail testcocktail2 = new cocktail("Sex on the Beach","Alcoholic");
        assertEquals("wrong name",testcocktail2.getName(),"Sex on the Beach");
        assertEquals("wrong type",testcocktail2.getType(),"Alcoholic");
    }
}

