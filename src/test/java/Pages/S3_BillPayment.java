package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S3_BillPayment extends Parent{

    public S3_BillPayment() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "div[id=\"leftPanel\"] li:nth-of-type(4)")
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

    @FindBy(name = "payee.phoneNumber")
    private WebElement payeePhoneNumber;

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

            case "payeeName" : myElement =payeeName; break;
            case "payeeAddressStreet" : myElement =payeeAddressStreet; break;
            case "payeeAddressCity" : myElement =payeeAddressCity; break;
            case "payeeAddressState" : myElement =payeeAddressState; break;
            case "payeeAddresszipCode" : myElement =payeeAddresszipCode; break;
            case "payeePhoneNumber" : myElement =payeePhoneNumber; break;
            case "payeeAccountNumber" : myElement =payeeAccountNumber; break;
            case "verifyAccount" : myElement =verifyAccount; break;
            case "amount" : myElement =amount; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "billPay" : myElement =billPay; break;
            case "sendPaymentButton" : myElement =sendPaymentButton; break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        if (strElement.equalsIgnoreCase("billPaymentValid"))
        {
           myElement =billPaymentValid;
        }
        verifyContainsText(myElement,text);
    }
}