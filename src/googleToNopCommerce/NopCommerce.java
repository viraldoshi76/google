package googleToNopCommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {

    WebDriver driver;

    @Before
    public void setUp() {
        String baseUrl = "https://demo.nopcommerce.com/";//variable is initalised with url
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();//object create to execute method
        driver.manage().window().maximize();//maximize the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//to give time to open the browser
        driver.get(baseUrl);//it will open the url
    }

    @Test
    public void verifyUserToClickOnRegisterLinkSuccessfully(){
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.xpath("//span[@class='male']/input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Prime");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Time");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']//option[@value='4']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']//option[@value='4']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']//option[@value='1998']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("virald@gmail.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("B&P ltd.");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prime321");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Prime321");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
