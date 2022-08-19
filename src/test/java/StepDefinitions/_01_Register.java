package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_Register {
    DialogContent dc = new DialogContent();

    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter valid username, password and register click button")
    public void enterValidUsernamePasswordAndRegisterClickButton() {
        dc.findAndClick("register");
        dc.findAndSend("firstName","grup");
        dc.findAndSend("lastName","3");
        dc.findAndSend("customerAddressStreet","Techno");
        dc.findAndSend("customerAddressCity","Study");
        dc.findAndSend("customerAddressState","USA");
        dc.findAndSend("customerAddressZipCode","34000");
        dc.findAndSend("customerPhoneNumber","+12345678989");
        dc.findAndSend("customerSsn","123");
        dc.findAndSend("customerUsername","grup03");
        dc.findAndSend("customerPassword","grup3123");
        dc.findAndSend("repeatedPassword","grup3123");
        dc.findAndClick("registerButton");
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.findAndContainsText("successMessage","Your account was created successfully. You are now logged in.");
    }
}
