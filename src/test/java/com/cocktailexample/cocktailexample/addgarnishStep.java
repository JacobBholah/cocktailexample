package com.cocktailexample.cocktailexample;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class addgarnishStep {
    private boolean garnish;
    private boolean name;

    @Given("the garnish doesnt exist")
    public void the_garnish_doesnt_exist() {
        garnish = false;
    }


    @When("I try to add the garnish")
    public void i_try_to_add_the_garnish() {
    }

    @Then("the garnish shall appear in the database")
    public void the_garnish_shall_appear_in_the_database() {
        assertEquals(true, garnish);

    }
    @Given("a garnish name is given")
    public void a_garnish_name_is_given() {
        garnish=true;
    }

    @Given("the garnish already exists")
    public void the_garnish_already_exists() {
        garnish = true;
    }

    @Given("no garnish name is given")
    public void no_garnish_name_is_given() {
        name = false;
    }

    @Then("the garnish shall not appear in the database")
    public void the_garnish_shall_not_appear_in_the_database() {
        assertEquals(false, garnish);
    }

}