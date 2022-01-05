package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.equipment;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class EquipmentTest {

    @Test
    public void testequipment()
    {
        equipment testequipment = new equipment();
        testequipment.setName("blender");
        testequipment.setType("electronic");
        assertEquals("wrong name",testequipment.getName(),"blender");
        assertEquals("wrong type",testequipment.getType(),"electronic");

        equipment testequipment2 = new equipment("shaker","hand");
        assertEquals("wrong name",testequipment2.getName(),"shaker");
        assertEquals("wrong type",testequipment2.getType(),"hand");
    }
}