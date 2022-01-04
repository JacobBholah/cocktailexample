package com.cocktailexample.cocktailexample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class equipmentTest {
    @Test
    public void equipmentTest()
    {
        equipment testequipment = new equipment("blender","tool");
        assertEquals("blender",testequipment.getName(),"wrong name");
        assertEquals("tool",testequipment.getType(),"wrong type");
    }
}