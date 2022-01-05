package com.cocktailexample.cocktailexampletests;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/cucumber",
        glue = "com.cocktailexample.cocktailexample"
        )
public class RunCucumberTest {}