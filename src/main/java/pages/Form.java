package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.Action;

import java.util.List;

public class Form {
    WebDriver driver;
    Action action;

    public Form(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Action(driver);
    }

    @FindBy(how = How.ID,using = "firstname")
    public WebElement firstName;

    @FindBy(how = How.ID,using = "surname")
    public WebElement surName;

    @FindBy(how = How.ID,using = "gender")
    public WebElement gender;

    @FindBy(how = How.XPATH,using = "//select[@id='gender']/option")
    public List<WebElement> dropdownGender;

    @FindBy(how = How.XPATH,using = "//input[@type='radio']")
    public List<WebElement> color;

    @FindBy(how = How.TAG_NAME,using = "textarea")
    public WebElement textArea;

    @FindBy(how = How.XPATH,using = "//input[@id='checkbox1']")
    public WebElement email;

    @FindBy(how = How.XPATH,using = "//input[@id='checkbox2']")
    public WebElement sms;

    @FindBy(how = How.XPATH,using = "//select[@id='continent']/option")
    public List<WebElement> countryList;

    @FindBy(how = How.ID,using ="submitbutton")
    public WebElement button;

    public void enterFirstName(String input){
        action.enterText(firstName,input);
    }

    public void enterSurName(String input){
        action.enterText(surName,input);
    }

    public void clickOnButton() {
        action.clickOn(button);
    }

    public void selectGender(String type){
        action.clickOn(gender);
        for(WebElement gen: dropdownGender){
            if(gen.getAttribute("value").equalsIgnoreCase(type)){
                action.clickOn(gen);
            }
        }
    }

    public void clickOnRadioButton(String type){
        for(WebElement radio: color){
            if(radio.getAttribute("id").equalsIgnoreCase(type)){
                action.clickOn(radio);
            }
        }
    }

    public void enterText(String text){
        action.enterText(textArea, text);
    }

    public void selectContactType(String type){
        if(type.equalsIgnoreCase("Email")){
            action.clickOn(email);
        }
        else{
            action.clickOn(sms);
        }
    }

    public void selectCountry(String type){
        for(WebElement country: countryList){
            if(country.getAttribute("value").equalsIgnoreCase(type)){
                action.clickOn(country);
            }
        }
    }
}
