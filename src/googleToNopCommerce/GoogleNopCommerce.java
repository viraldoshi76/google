package googleToNopCommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleNopCommerce {

    WebDriver driver;

    @Before
    public void setUp() {
        String baseUrl = "https://www.google.com/";//variable is initalised with url
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();//object create to execute method
        driver.manage().window().maximize();//maximize the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//to give time to open the browser
        driver.get(baseUrl);//it will open the url
    }

    @Test
    public void verifyUserClickOnComputersTagUserIsSuccessfullyNavigatedToComputersPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/computers' and text()='Computers ']")).click();

    }

    @Test
    public void verifyUserClickOnComputersTagUserIsSuccessfullyNavigatedToElectronicsPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/electronics' and text()='Electronics ']")).click();
    }

    @Test
    public void verifyUserClickOnComputersTagUserIsSuccessfullyNavigatedToApparelPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/apparel' and text()='Apparel ']")).click();
    }

    @Test
    public void verifyUserClickOnComputersTagUserIsSuccessfullyNavigatedToDigitalDownloadsPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/digital-downloads' and text()='Digital downloads ']")).click();


    }

    @Test
    public void verifyUserClickOnComputersTagUserIsSuccessfullyNavigatedToBooksPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/books' and text()='Books ']")).click();
    }

    @Test
    public void verifyUserClickOnComputersTagUserIsSuccessfullyNavigatedToJewelryPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/jewelry' and text()='Jewelry ']")).click();
    }

    @Test
    public void verifyUserClickOnComputersTagUserIsSuccessfullyNavigatedToGiftCardsPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/jewelry' and text()='Jewelry ']")).click();
    }


    @After
    public void tearDown(){
        driver.quit();
    }



}