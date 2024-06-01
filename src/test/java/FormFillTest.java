import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseTest;

public class FormFillTest extends BaseTest {

    @Test
    public void fillForm() throws InterruptedException{
        driver.get("https://automationintesting.com/selenium/testpage/");
        //fill the form
        formPage.enterFirstName("Prutha");
        formPage.enterSurName("Chauhan");
        formPage.selectGender("Female");
        formPage.clickOnRadioButton("Red");
        formPage.selectContactType("Email");
        formPage.enterText("Hello welcome to the world");
        formPage.selectCountry("Africa");
        //submit form
        formPage.clickOnButton();

        //Assertions
       Assert.assertTrue(formPage.firstName.getAttribute("value").isEmpty());
       Assert.assertTrue(formPage.surName.getAttribute("value").isEmpty());
    }
}
