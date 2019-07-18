package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

public class LogInPage {

    WebDriver driver;

    public LogInPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy( name = "email")
    protected WebElement emailAddressField;

    @FindBy( name ="passwd")
    protected WebElement passwordField;

    @FindBy( id ="SubmitLogin")
    protected WebElement logInButton;


    public LogInPage setEmailAddressField(String email){

        emailAddressField.sendKeys(email);
        return this;
    }

    public LogInPage setPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public LogInPage clickonLogInbutton(){
        logInButton.click();
        return this;
    }


}
