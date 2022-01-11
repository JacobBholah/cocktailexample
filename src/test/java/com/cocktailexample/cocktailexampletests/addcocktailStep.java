package com.cocktailexample.cocktailexampletests;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import com.cocktailexample.cocktailexample.CocktailexampleApplication;
import com.cocktailexample.cocktailexample.cocktail;
import com.cocktailexample.cocktailexample.cocktailrepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class addcocktailStep {
//    Iterable<cocktail> actualcocktail;
    List<Integer> cocktailids= new ArrayList<>();
    String name;
    String type;
    Response response;
    String url = "http://3.142.186.227:8080/cocktails/cocktails/";
    RequestSpecification request;


//    @Autowired
//    CocktailexampleApplication cocktailexampleApplication;
//
//    @Autowired
//    private com.cocktailexample.cocktailexample.cocktailrepository cocktailrepository;

    @Given("the cocktail doesnt exist")
    public void the_cocktail_doesnt_exist() {

    }


    @Given("a cocktail name and type is given")
    public void a_cocktail_name_and_type_is_given() {name = "test7"; type = "test";}

    @Given("the cocktail already exists")
    public void the_cocktail_already_exists() {name = "test5"; type = "test"; }

    @Given("no cocktail name or type is given")
    public void no_cocktail_name_or_type_is_given() {
    }

    @When("I try to add the cocktail")
    public void i_try_to_add_the_cocktail() {
        cocktail cocktail = new cocktail();
//        response = RestAssured.get(url);
//        Assertions.assertEquals(200,response.getStatusCode());
        request = RestAssured.given().header("Content-Type","application/json").body(cocktail);
//        cocktailexampleApplication.addcocktail(name,type);
        response = request.post("http://3.142.186.227:8080/cocktails/addcocktail?name="+name+"&type="+type);
//        Assertions.assertEquals(500,response.getStatusCode());
        }


    @Then("the cocktail shall not appear in the database")
    public void the_cocktail_shall_not_appear_in_the_database() {
        response=RestAssured.get(url);
        String returnstring = response.getBody().asString();
        System.out.println(returnstring);
        Assertions.assertEquals(false,returnstring.toLowerCase(Locale.ROOT).contains(name),"string does contain name");

    }

    @Then("the cocktail shall appear in the database")
    public void the_cocktail_shall_appear_in_the_database() {
        response=RestAssured.get(url);
        String returnstring = response.getBody().asString();
        System.out.println(returnstring);
        Assertions.assertEquals(true,returnstring.toLowerCase(Locale.ROOT).contains(name),"string doesnt contain name");


        //delete cocktail
        cocktail[] cocktails =RestAssured.get(url).then().extract().as(cocktail[].class);
        for (cocktail cocktail:cocktails)
        {
            cocktailids.add(cocktail.getId());
        }
        int testcocktailid = Collections.max(cocktailids);


        response = request.delete("http://3.142.186.227:8080/cocktails/deletecocktail?id="+testcocktailid);
    }
    @Then("the cocktail is already in the database")
    public void the_cocktail_is_already_in_the_database() {
        response=RestAssured.get(url);
        String returnstring = response.getBody().asString();
        System.out.println(returnstring);
        Assertions.assertEquals(true,returnstring.toLowerCase(Locale.ROOT).contains(name),"string doesnt contain name");
}
    @Then("the cocktail will not be added")
    public void the_cocktail_cocktail_will_not_be_added() {
}
}