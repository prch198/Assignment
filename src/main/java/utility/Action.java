package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {
    WebDriver driver;

    public Action(WebDriver driver){
        this.driver=driver;
    }

    public void enterText(WebElement element, String text){
        element.sendKeys(text);
    }

    public void clickOn(WebElement element){
        element.click();
    }
}
