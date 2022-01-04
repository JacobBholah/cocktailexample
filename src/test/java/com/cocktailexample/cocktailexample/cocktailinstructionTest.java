package com.cocktailexample.cocktailexample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class cocktailinstructionTest {
    @Test
    public void cocktailinstructionTest()
    {
        cocktailinstructions testcocktailinstructions = new cocktailinstructions(1,2,3,"Long Island Ice Tea");
        assertEquals(1,testcocktailinstructions.getCocktailinstructionsid(),"wrong cocktail instruction id");
        assertEquals(2,testcocktailinstructions.getStepnumber(),"wrong stepnumber");
        assertEquals(3,testcocktailinstructions.getInstructionid(),"wrong instruction id");
        assertEquals("Long Island Ice Tea",testcocktailinstructions.getCocktail_Name(),"wrong cocktail name");
    }
}