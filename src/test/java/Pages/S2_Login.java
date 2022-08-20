package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2_Login extends Parent{

    public S2_Login() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

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

    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "logInButton" : myElement =logInButton; break;
            case "logOut" : myElement =logOut; break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "succesfullyLogin" : myElement =succesfullyLogin; break;
            case "errorMessage" : myElement =errorMessage; break;
        }
        verifyContainsText(myElement,text);
    }
}