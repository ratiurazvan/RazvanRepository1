package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

@Test
public class LoginTest {

    HomePage homepage;
    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
    }

    @Test
    public void loginTest() {
        homepage = new HomePage(driver);
        homepage.clickOnSignInButton()
                .setEmailAddressField("razvanratiu@yahoo.com")
                .setPasswordField("Softvision10")
                .clickonLogInbutton();
        WebElement myAccountMessage = driver.findElement(By.cssSelector(".info-account"));
        Assert.assertTrue(myAccountMessage.getText().contains("Welcome to your account."));
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
