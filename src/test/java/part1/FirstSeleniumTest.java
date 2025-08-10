package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://best.aliexpress.com/?gatewayAdapt=glo2ara&browser_redirect=true");
    }
    @AfterClass
    public void tearDown()
    {
        //driver.quit();
    }
    @Test
    public void testSignuptoApplication()
    {
        driver.findElement(By.className("nfm-multiple-container pc-account rtl-account"));
    }



}
