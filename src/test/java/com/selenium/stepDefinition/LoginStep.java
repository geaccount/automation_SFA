package com.selenium.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.Hooks;
import org.openqa.selenium.WebDriver;

public class LoginStep {

    public WebDriver driver;
    public LoginStep (){
        this.driver = Hooks.driver;
    }
    @Given("User on home Page SFA system")
    public void userOnHomePageSFASystem() {

    }

    @When("User input username {string}, the password {string} and clicks on the login button")
    public void userInputUsernameThePasswordAndClicksOnTheLoginButton(String arg0, String arg1) {
    }

    @Then("Get result login resource")
    public void getResultLoginResource() {
    }
}
