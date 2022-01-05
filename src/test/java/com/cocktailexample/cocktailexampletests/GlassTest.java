package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.glass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class GlassTest {

            @Test
    public void testglass()
            {
                glass testglass = new glass();
                testglass.setType("shot");
                testglass.setVolume(44);
                assertEquals("wrong type",testglass.getType(),"shot");
                assertEquals("wrong volume",testglass.getVolume(),44);
            }
}