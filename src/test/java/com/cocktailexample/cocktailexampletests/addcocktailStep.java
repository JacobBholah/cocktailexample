package com.cocktailexample.cocktailexampletests;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class addcocktailStep {
    private boolean cocktail;
    private boolean name;

    @Given("the cocktail doesnt exist")
    public void the_cocktail_doesnt_exist() {
        cocktail = false;
    }


    @When("I try to add the cocktail")
    public void i_try_to_add_the_cocktail() {
    }

    @Then("the cocktail shall appear in the database")
    public void the_cocktail_shall_appear_in_the_database() {
        assertEquals(true, cocktail);
    }
    @Given("a cocktail name is given")
    public void a_cocktail_name_is_given() {
        cocktail=true;
    }

    @Given("the cocktail already exists")
    public void the_cocktail_already_exists() {
        cocktail = true;
    }

    @Given("no cocktail name is given")
    public void no_cocktail_name_is_given() {
        cocktail = false;
    }

    @Then("the cocktail shall not appear in the database")
    public void the_cocktail_shall_not_appear_in_the_database() {
        assertEquals(false, cocktail);
    }

}