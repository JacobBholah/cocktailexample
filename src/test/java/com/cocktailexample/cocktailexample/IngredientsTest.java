package com.cocktailexample.cocktailexample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class IngredientsTest {
    @Test
    public void ingredienttest()
    {
        ingredient testingredient = new ingredient("ingredient a","fruit",20,"fridge","test ingredient");
        assertEquals("ingredient a" ,testingredient.getName(),"wrong name");
        assertEquals("fruit",testingredient.getType(),"wrong type");
        assertEquals(20,testingredient.getABV(),"wrong ABV");
        assertEquals("fridge",testingredient.getStorage(),"wrong storage");
        assertEquals("test ingredient",testingredient.getDescription(),"wrong description");
    }
}