import org.testng.annotations.Test;
import utility.BaseTest;

public class FormFillTest extends BaseTest {

    @Test
    public void fillForm() throws InterruptedException{
        driver.get("https://automationintesting.com/selenium/testpage/");
        formPage.enterFirstName("Prutha");
        formPage.enterSurName("Chauhan");
        formPage.selectGender("Female");
        formPage.clickOnRadioButton("Red");
        formPage.selectContactType("Email");
        formPage.enterText("Hello welcome to the world");
        formPage.selectCountry("Africa");
        formPage.clickOnButton();
    }
}
