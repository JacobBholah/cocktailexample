package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.glass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class GlassTest {

            @Test
    public void testglass()
            {
                glass testglass = new glass("shot",44);
                assertEquals("wrong type",testglass.getType(),"shot");
            }
}