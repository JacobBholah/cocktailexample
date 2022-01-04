package com.cocktailexample.cocktailexample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class garnishTest {
    @Test
    public void garnishTest()
    {
        garnish testgarnish = new garnish(1,"lemon slice","fruit");
        assertEquals(1,testgarnish.getId(),"wrong id");
        assertEquals("lemon slice",testgarnish.getName(),"wrong name");
        assertEquals("fruit",testgarnish.getType(),"wrong type");
    }
}