package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import pages.Form;
import pages.Image;

public class BaseTest {
        public WebDriver driver;
        public Form formPage;
        public Image imagePage;

        @BeforeMethod
        public  void setUp(){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            formPage = new Form(driver);
            imagePage = new Image(driver);
        }

        @AfterMethod
        public void close(){
            driver.quit();
        }
}
