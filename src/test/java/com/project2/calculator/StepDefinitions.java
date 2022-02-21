package com.project2.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.project2.calculator.Calculator;
import org.junit.Assert;

public class StepDefinitions {

    String EMPTY_STRING="";

    @Given("a calculator able to perform basic operations")
    public void aCalculatorAbleToPerformBasicOperations() {
    }

    @When("I have the (addition|subtraction|multiplication|division) option available$")
    public void iHaveTheAdditionOptionAvailable(String option) {
    }

    @Then("I add (.*) and (.*) obtaining as result (.*)$")
    public void iAddXAndYObtainingAsResultTotal(String x, String y, String expectedResult) {
        Assert.assertEquals(EMPTY_STRING + Calculator.add(Integer.parseInt(x),Integer.parseInt(y)),expectedResult);
    }

    @Then("I subtract (.*) and (.*) obtaining as result (.*)$")
    public void iSubtractXAndYObtainingAsResultTotal(String x, String y, String expectedResult) {
        Assert.assertEquals(EMPTY_STRING + Calculator.subtract(Integer.parseInt(x),Integer.parseInt(y)),expectedResult);
    }

    @Then("I multiply (.*) and (.*) obtaining as result (.*)$")
    public void iMultiplyXAndYObtainingAsResultTotal(String x, String y, String expectedResult) {
        Assert.assertEquals(EMPTY_STRING + Calculator.multiply(Integer.parseInt(x),Integer.parseInt(y)),expectedResult);
    }

    @Then("I divide (.*) and (.*) obtaining as result (.*)$")
    public void iDivideXAndYObtainingAsResultTotal(String x, String y, String expectedResult) {
        Assert.assertEquals(EMPTY_STRING + Calculator.divide(Integer.parseInt(x),Integer.parseInt(y)),expectedResult);
    }
}

