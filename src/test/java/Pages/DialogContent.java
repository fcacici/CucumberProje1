package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    private WebElement register;

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement customerAddressStreet;
    @FindBy(id = "customer.address.city")
    private WebElement customerAddressCity;

    @FindBy(id = "customer.address.state")
    private WebElement customerAddressState;

    @FindBy(id = "customer.address.zipCode")
    private WebElement customerAddressZipCode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement customerPhoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement customerSsn;

    @FindBy(id = "customer.username")
    private WebElement customerUsername;

    @FindBy(id = "customer.password")
    private WebElement customerPassword;

    @FindBy(id = "repeatedPassword")
    private WebElement repeatedPassword;

    @FindBy(css = "[value='Register']")
    private WebElement registerButton;

    @FindBy(css = "[class='title']+p")
    private WebElement successMessage;

    //TODO SCENARIO 2
    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css= "[type='submit']")
    private WebElement logInButton;

    @FindBy (css = ".smallText>b")
    private WebElement succesfullyLogin;

    @FindBy(linkText = "Log Out")
    private WebElement logOut;

    @FindBy(css= "[class='error']")
    private WebElement errorMessage;

    /*
    TODO SCENARIO 3
    */

    @FindBy(xpath = "(//*[text()='Bill Pay'])[1]")
    private WebElement billPay;

    @FindBy(name = "payee.name")
    private WebElement payeeName;

    @FindBy(name = "payee.address.street")
    private WebElement payeeAddressStreet;

    @FindBy(name = "payee.address.city")
    private WebElement payeeAddressCity;

    @FindBy(name = "payee.address.state")
    private WebElement payeeAddressState;

    @FindBy(name = "payee.address.zipCode")
    private WebElement payeeAddresszipCode;

    @FindBy(name = "payee.accountNumber")
    private WebElement payeeAccountNumber;

    @FindBy(name = "verifyAccount")
    private WebElement verifyAccount;

    @FindBy(name = "amount")
    private WebElement amount;

    @FindBy(css = "[value='Send Payment']")
    private WebElement sendPaymentButton;

    @FindBy(xpath = "//h1[contains(text(),'Complete')]")
    private WebElement billPaymentValid;


    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "firstName" : myElement =firstName; break;
            case "lastName" : myElement =lastName; break;
            case "customerAddressStreet" : myElement =customerAddressStreet; break;
            case "customerAddressCity" : myElement =customerAddressCity; break;
            case "customerAddressState" : myElement =customerAddressState; break;
            case "customerAddressZipCode" : myElement =customerAddressZipCode; break;
            case "customerPhoneNumber" : myElement =customerPhoneNumber; break;
            case "customerSsn" : myElement =customerSsn; break;
            case "customerUsername" : myElement =customerUsername; break;
            case "customerPassword" : myElement =customerPassword; break;
            case "repeatedPassword" : myElement =repeatedPassword; break;
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "payeeName" : myElement =payeeName; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "register" : myElement =register; break;
            case "registerButton" : myElement =registerButton; break;
            case "logInButton" : myElement =logInButton; break;
            case "logOut" : myElement =logOut; break;
            case "billPay" : myElement =billPay; break;
            case "sendPaymentButton" : myElement =sendPaymentButton; break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "successMessage" : myElement =successMessage; break;
            case "succesfullyLogin" : myElement =succesfullyLogin; break;
            case "errorMessage" : myElement =errorMessage; break;
        }
        verifyContainsText(myElement,text);
    }
}