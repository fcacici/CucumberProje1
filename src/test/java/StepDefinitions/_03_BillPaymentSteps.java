package StepDefinitions;

import Pages.S3_BillPayment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaymentSteps {
    S3_BillPayment s3 = new S3_BillPayment();

    @When("Click to Bill page")
    public void clickToBillPage() {
        s3.findAndClick("billPay");
    }

    @And("Fill the Bill Payee Name as {string}")
    public void fillTheBillPayeeNameAs(String payee) {
        s3.findAndSend("payeeName",payee);
    }

    @And("Fill the Bill Address as {string}")
    public void fillTheBillAddressAs(String address) {
        s3.findAndSend("payeeAddressStreet",address);
    }

    @And("Fill the Bill City as {string}")
    public void fillTheBillCityAs(String city) {
        s3.findAndSend("payeeAddressCity",city);
    }

    @And("Fill the Bill State as {string}")
    public void fillTheBillStateAs(String state) {
        s3.findAndSend("payeeAddressState",state);
    }

    @And("Fill the Bill Zip Code as {string}")
    public void fillTheBillZipCodeAs(String zip) {
        s3.findAndSend("payeeAddresszipCode",zip);
    }

    @And("Fill the Bill Phone # as {string}")
    public void fillTheBillPhoneAs(String phone) {
        s3.findAndSend("payeePhoneNumber",phone);
    }

    @And("Fill the Bill Account # as {string}")
    public void fillTheBillAccountAs(String account) {
        s3.findAndSend("payeeAccountNumber",account);
    }

    @And("Fill the Bill Verify Account # as {string}")
    public void fillTheBillVerifyAccountAs(String verify) {
        s3.findAndSend("verifyAccount",verify);
    }

    @And("Fill the Bill Amount: $ as {string}")
    public void fillTheBillAmount$As(String amount) {
        s3.findAndSend("amount",amount);
    }

    @When("Click to Send Payment")
    public void clickToSendPayment() {
        s3.findAndClick("sendPaymentButton");
    }

    @Then("User should pay successfully")
    public void userShouldPaySuccessfully() {
        s3.findAndContainsText("billPaymentValid","complete");
    }
}
