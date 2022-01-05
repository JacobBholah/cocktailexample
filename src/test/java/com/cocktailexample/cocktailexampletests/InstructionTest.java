package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.instruction;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class InstructionTest {

    @Test
    public void testinstruction()
    {
        instruction testinstruction = new instruction();
        testinstruction.setInstructionid(1);
        testinstruction.setDescription("description");
        testinstruction.setGlass_Type("shot");
        testinstruction.setGarnish_Name("lemon slice");
        assertEquals("wrong instruction id",testinstruction.getInstructionid(),1);
        assertEquals("wrong description",testinstruction.getDescription(),"description");
        assertEquals("wrong glass",testinstruction.getGlass_Type(),"shot");
        assertEquals("wrong garnish",testinstruction.getGarnish_Name(),"lemon slice");

        instruction testinstruction2 = new instruction(2,"description",null,null);
        assertEquals("wrong instruction id",testinstruction2.getInstructionid(),2);
        assertEquals("wrong description",testinstruction2.getDescription(),"description");
        assertEquals("wrong glass",testinstruction2.getGlass_Type(),null);
        assertEquals("wrong garnish",testinstruction2.getGarnish_Name(),null);
    }
}
