package com.cocktailexample.cocktailexample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class glassesTest {
    @Test
    public void glassesTest()
    {
        glass testglass = new glass("shot",20);
        assertEquals("shot" ,testglass.getType(),"wrong type");
        assertEquals(20,testglass.getVolume(),"wrong volume");
    }
}