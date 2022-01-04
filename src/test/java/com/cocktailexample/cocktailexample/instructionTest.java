package com.cocktailexample.cocktailexample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class instructionTest {
    @Test
    public void instructionTest()
    {
        instruction testinstruction = new instruction(1,"description",null,null);
        assertEquals(1,testinstruction.getInstructionid(),"wrong id");
        assertEquals("description",testinstruction.getDescription(),"wrong description");
        assertEquals(null,testinstruction.getGlass_Type(),"wrong glass type");
        assertEquals(null,testinstruction.getGarnish_Name(),"wrong garnish name");
    }
}