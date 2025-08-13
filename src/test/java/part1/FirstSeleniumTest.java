package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
        driver.get("https://www.saucedemo.com/v1/");
    }
    @AfterClass
   public void tearDown()
    {
        //driver.quit();
    }
    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("problem_user");
        var password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
        
    }



}
