package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.cocktailinstructions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CocktailinstructionsTest {

    @Test
    public void testcocktailinstructions()
    {
        cocktailinstructions testcocktailinstructions = new cocktailinstructions();
        testcocktailinstructions.setCocktailinstructionsid(1);
        testcocktailinstructions.setStepnumber(2);
        testcocktailinstructions.setInstructionid(3);
        testcocktailinstructions.setCocktail_Name("Long Island");
        assertEquals("wrong cocktail instructions id",testcocktailinstructions.getCocktailinstructionsid(),1);
        assertEquals("wrong stepnumber",testcocktailinstructions.getStepnumber(),2);
        assertEquals("wrong instruction id",testcocktailinstructions.getInstructionid(),3);
        assertEquals("wrong cocktail name",testcocktailinstructions.getCocktail_Name(),"Long Island");

        cocktailinstructions testcocktailinstructions2 = new cocktailinstructions(2,3,4,"Sex on the Beach");
        assertEquals("wrong cocktail instructions id",testcocktailinstructions2.getCocktailinstructionsid(),2);
        assertEquals("wrong stepnumber",testcocktailinstructions2.getStepnumber(),3);
        assertEquals("wrong instruction id",testcocktailinstructions2.getInstructionid(),4);
        assertEquals("wrong cocktail name",testcocktailinstructions2.getCocktail_Name(),"Sex on the Beach");
}
}
