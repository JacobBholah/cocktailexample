package com.cocktailexample.cocktailexample;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class addglassStep {
    private boolean glass;
    private boolean name;

    @Given("the glass doesnt exist")
    public void the_glass_doesnt_exist() {
        glass = false;
    }


    @When("I try to add the glass")
    public void i_try_to_add_the_glass() {
    }

    @Then("the glass shall appear in the database")
    public void the_glass_shall_appear_in_the_database() {
        assertEquals(true, glass);

    }
    @Given("a glass name is given")
    public void a_glass_name_is_given() {
        glass=true;
    }

    @Given("the glass already exists")
    public void the_glass_already_exists() {
        glass = true;
    }

    @Given("no glass name is given")
    public void no_glass_name_is_given() {
        glass = false;
    }

    @Then("the glass shall not appear in the database")
    public void the_glass_shall_not_appear_in_the_database() {
        assertEquals(false, glass);
    }

}