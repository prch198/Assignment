package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Image {
    WebDriver driver;

    public Image(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.XPATH, using = "//div[@class='container']//div[@class='d-flex mt-2']/div/img")
    public List<WebElement> images;


}
