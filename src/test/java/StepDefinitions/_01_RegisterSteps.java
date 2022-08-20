package StepDefinitions;

import Pages.S1_Register;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {
    S1_Register s1 = new S1_Register();

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @Then("Click to Register Button")
    public void clickToRegisterButton() {
        s1.findAndClick("register");
    }

    @And("Fill the First Name as {string}")
    public void fillTheFirstNameAs(String firstname) {
        s1.findAndSend("firstName",firstname);
    }

    @And("Fill the Last Name as {string}")
    public void fillTheLastNameAs(String lastname) {
        s1.findAndSend("lastName",lastname);
    }

    @And("Fill the Address as {string}")
    public void fillTheAddressAs(String address) {
        s1.findAndSend("customerAddressStreet",address);
    }

    @And("Fill the City as {string}")
    public void fillTheCityAs(String city) {
        s1.findAndSend("customerAddressCity",city);
    }

    @And("Fill the State as {string}")
    public void fillTheStateAs(String state) {
        s1.findAndSend("customerAddressState",state);
    }

    @And("Fill the Zip Code as {string}")
    public void fillTheZipCodeAs(String zipCode) {
        s1.findAndSend("customerAddressZipCode",zipCode);
    }

    @And("Fill the Phone # as {string}")
    public void fillThePhoneAs(String phone) {
        s1.findAndSend("customerPhoneNumber",phone);
    }

    @And("Fill the SSN as {string}")
    public void fillTheSSNAs(String ssn) {
        s1.findAndSend("customerSsn",ssn);
    }

    @And("Fill the Customer Username as {string}")
    public void fillTheCustomerUsernameAs(String customerUsername) {
        s1.findAndSend("customerUsername",customerUsername);
    }

    @And("Fill the Customer Password as {string}")
    public void fillTheCustomerPasswordAs(String customerPassword) {
        s1.findAndSend("customerPassword",customerPassword);
    }

    @And("Fill the Confirm as {string}")
    public void fillTheConfirmAs(String confirmPassword) {
        s1.findAndSend("repeatedPassword",confirmPassword);
    }

    @When("Click to SecondRegister Button")
    public void clickToSecondRegisterButton() {
        s1.findAndClick("registerButton");
    }

    @Then("Verification of successfully registering")
    public void verificationOfSuccessfullyRegistering() {
        s1.findAndContainsText("successMessage","Your account was created successfully. You are now logged in.");

    }
}
