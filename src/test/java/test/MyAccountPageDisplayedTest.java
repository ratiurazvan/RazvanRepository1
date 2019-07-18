package test;

import Utils.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.MyAccountPage;

@Test
public class MyAccountPageDisplayedTest extends CommonClass {

    HomePage homepage;
    WebDriver driver;
    LogInPage loginPage;
    MyAccountPage myAccountPage;

    @BeforeClass
    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
    }

    @Test
    public void loginTest() {
        homepage = new HomePage(driver);
        loginPage = new LogInPage(driver);
        myAccountPage = new MyAccountPage(driver);

        homepage.clickOnSignInButton();
        loginPage.setEmailAddressField("razvanratiu@yahoo.com")
                .setPasswordField("Softvision10")
                .clickonLogInbutton();
      // myAccountPage.searchField.isDisplayed();
       Assert.assertTrue(myAccountPage.isSearchFieldDisplayed(),"The element is not displayed");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


}
