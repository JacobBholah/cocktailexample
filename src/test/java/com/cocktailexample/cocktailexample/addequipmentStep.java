package com.cocktailexample.cocktailexample;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class addequipmentStep {
    private boolean equipment;
    private boolean name;

    @Given("the equipment doesnt exist")
    public void the_equipment_doesnt_exist() {
        equipment = false;
    }


    @When("I try to add the equipment")
    public void i_try_to_add_the_equipment() {
    }

    @Then("the equipment shall appear in the database")
    public void the_equipment_shall_appear_in_the_database() {
        assertEquals(true, equipment);

    }
    @Given("a equipment name is given")
    public void a_equipment_name_is_given() {
        equipment = true;
    }

    @Given("the equipment already exists")
    public void the_equipment_already_exists() {
        equipment = true;
    }

    @Given("no equipment name is given")
    public void no_equipment_name_is_given() {
        equipment = false;
    }

    @Then("the equipment shall not appear in the database")
    public void the_equipment_shall_not_appear_in_the_database() {
        assertEquals(false,equipment);
    }

}