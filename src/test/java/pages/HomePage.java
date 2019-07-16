package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.Element;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy( css= ".login")
    protected WebElement signInButton;


    @FindBy( name = "email")
    protected WebElement emailAddressField;

    @FindBy( name ="passwd")
    protected WebElement passwordField;

    @FindBy( id ="SubmitLogin")
    protected WebElement logInButton;

    public HomePage clickOnSignInButton(){
        signInButton.click();
        return this;
    }

    public HomePage setEmailAddressField(String email){

        emailAddressField.sendKeys(email);
        return this;
    }

    public HomePage setPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public HomePage clickonLogInbutton(){
        logInButton.click();
        return this;
    }


}
