package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_Login {

    DialogContent dc = new DialogContent();
    @When("Enter valid username and password and click login button")
    public void enterValidUsernameAndPasswordAndClickLoginButton() {

        dc.findAndSend("username","grup0003");
        dc.findAndSend("password","grup3123");
        dc.findAndClick("logInButton");

    }

    @Then("User should login successfully and logout")
    public void userShouldLoginSuccessfullyAndLogout() {
        dc.findAndContainsText("succesfullyLogin","welcome");
        dc.findAndClick("logOut");
    }

    @When("Enter unverified as {string} as {string} and click login button")
    public void enterUnverifiedAsAsAndClickLoginButton(String username, String password) {
        dc.findAndSend("username",username);
        dc.findAndSend("password",password);
        dc.findAndClick("logInButton");
    }

    @Then("User should see error message")
    public void userShouldSeeErrorMessage() {
        dc.findAndContainsText("errorMessage","error");
    }
}
