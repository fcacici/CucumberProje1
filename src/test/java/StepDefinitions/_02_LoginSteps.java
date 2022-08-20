package StepDefinitions;

import Pages.S1_Register;
import Pages.S2_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    S2_Login s2 = new S2_Login();

    @And("Fill the Username as {string}")
    public void fillTheUsernameAs(String username) {
        s2.findAndSend("username",username);
    }

    @And("Fill the Password as {string}")
    public void fillThePasswordAs(String password) {
        s2.findAndSend("password",password);
    }

    @When("Click to Log in button")
    public void clickToLogInButton() {
        s2.findAndClick("logInButton");
    }

    @Then("Verification of successfully logging in")
    public void verificationOfSuccessfullyLoggingIn() {
        s2.findAndContainsText("succesfullyLogin","welcome");
    }

    @When("Click to Log out button")
    public void clickToLogOutButton() {
        s2.findAndClick("logOut");
    }

    @Then("User should see error message")
    public void userShouldSeeErrorMessage() {
        s2.findAndContainsText("errorMessage","error");
    }
}
