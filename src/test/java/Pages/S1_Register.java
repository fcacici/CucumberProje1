package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S1_Register extends Parent{

    public S1_Register() {
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
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "register" : myElement =register; break;
            case "registerButton" : myElement =registerButton; break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        if (strElement.equalsIgnoreCase("successMessage"))
        {
            myElement =successMessage;
        }
        verifyContainsText(myElement,text);
    }
}