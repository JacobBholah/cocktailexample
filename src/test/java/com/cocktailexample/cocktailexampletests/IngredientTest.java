package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.ingredient;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class IngredientTest {

    @Test
    public void testingredient()
    {
        ingredient testingredient = new ingredient();
        testingredient.setName("vodka");
        testingredient.setType("alcohol");
        testingredient.setABV(40);
        testingredient.setStorage("fridge");
        testingredient.setDescription("description");
        assertEquals("wrong name",testingredient.getName(),"vodka");
        assertEquals("wrong type",testingredient.getType(),"alcohol");
        assertEquals("wrong ABV",testingredient.getABV(),40);
        assertEquals("wrong storage",testingredient.getStorage(),"fridge");
        assertEquals("wrong description",testingredient.getDescription(),"description");

        ingredient testingredient2 = new ingredient("rum","alcohol",40,"fridge","description");
        assertEquals("wrong name",testingredient2.getName(),"rum");
        assertEquals("wrong type",testingredient2.getType(),"alcohol");
        assertEquals("wrong ABV",testingredient2.getABV(),40);
        assertEquals("wrong storage",testingredient2.getStorage(),"fridge");
        assertEquals("wrong description",testingredient2.getDescription(),"description");
    }
}
