package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonClass {

    WebDriver driver;

    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
    }


}
