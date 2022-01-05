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

                glass testglass2 = new glass("highball",240);
                assertEquals("wrong type",testglass2.getType(),"highball");
                assertEquals("wrong volume",testglass2.getVolume(),240);

            }
}