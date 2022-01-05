package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.ingredient;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class IngredientTest {

    @Test
    public void testingredient()
    {
        ingredient testingredient = new ingredient("vodka","alcohol",40,"fridge","description");
        assertEquals("wrong name",testingredient.getName(),"vodka");
    }
}
