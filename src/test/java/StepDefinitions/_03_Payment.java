package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_Payment {
    DialogContent dc = new DialogContent();

    @When("Enter valid username and password and click login")
    public void enterValidUsernameAndPasswordAndClickLogin() {
        dc.findAndSend("username","grup0003");
        dc.findAndSend("password","grup3123");
        dc.findAndClick("logInButton");
    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndContainsText("succesfullyLogin","welcome");
    }
    @And("Click to Bill page")
    public void clickToBillPage() {
        dc.findAndClick("billPay");
    }

    @When("Enter as {string} as {string} and send payment")
    public void enterAsAsAndSendPayment(String payee, String amount) {
        dc.findAndSend("payeeName",payee);
        dc.findAndSend("payeeAddressStreet","Street");
        dc.findAndSend("payeeAddressCity","Toronto");
        dc.findAndSend("payeeAddressState","Canada");
        dc.findAndSend("payeeAddresszipCode","M4X1W7");
        dc.findAndSend("payeePhoneNumber","+123456789");
        dc.findAndSend("payeeAccountNumber","12345678");
        dc.findAndSend("verifyAccount","12345678");
        dc.findAndSend("amount",amount);
        dc.findAndClick("sendPaymentButton");
    }

    @Then("User should pay successfully")
    public void userShouldPaySuccessfully() {
        dc.findAndContainsText("billPaymentValid","complete");
    }



}
