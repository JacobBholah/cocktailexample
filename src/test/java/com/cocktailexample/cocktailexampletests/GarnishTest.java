package com.cocktailexample.cocktailexampletests;
import com.cocktailexample.cocktailexample.garnish;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class GarnishTest {

    @Test
    public void testgarnish()
    {
        garnish testgarnish = new garnish();
        testgarnish.setId(1);
        testgarnish.setName("lime slice");
        testgarnish.setType("fruit");
        assertEquals("wrong name",testgarnish.getName(),"lime slice");
        assertEquals("wrong type",testgarnish.getType(),"fruit");

        garnish testgarnish2 = new garnish(2,"lemon slice","fruit");
        assertEquals("wrong id",testgarnish2.getId(),2);
        assertEquals("wrong name",testgarnish2.getName(),"lemon slice");
        assertEquals("wrong type",testgarnish2.getType(),"fruit");
    }
}
