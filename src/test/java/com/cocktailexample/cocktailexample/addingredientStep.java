package com.cocktailexample.cocktailexample;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class addingredientStep {
    private boolean ingredient;
    private boolean name;

    @Given("the ingredient doesnt exist")
    public void the_ingredient_doesnt_exist() {
        ingredient = false;
    }


    @When("I try to add the ingredient")
    public void i_try_to_add_the_ingredient() {
    }

    @Then("the ingredient shall appear in the database")
    public void the_ingredient_shall_appear_in_the_database() {
        assertEquals(true, ingredient);

    }
    @Given("a ingredient name is given")
    public void a_ingredient_name_is_given() {
        ingredient = true;
    }

    @Given("the ingredient already exists")
    public void the_ingredient_already_exists() {
        ingredient = true;
    }

    @Given("no ingredient name is given")
    public void no_ingredient_name_is_given() {
        ingredient = false;
    }

    @Then("the ingredient shall not appear in the database")
    public void the_ingredient_shall_not_appear_in_the_database() {
        assertEquals(false,ingredient);
    }

}