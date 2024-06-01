import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.BaseTest;

public class BrokenImgTest extends BaseTest {

    @Test
    public void findBrokenImage(){
        driver.get("https://practice.expandtesting.com/broken-images");
        //Iterate over all <img> tag
        for(WebElement image:imagePage.images){
            //get src attribute from <img> tage
            String url = image.getAttribute("src");
            verifyLink(url);
        }
    }

    public static void verifyLink(String url){
        //hit the url
        Response response = RestAssured.given().contentType("application/json").get(url);
        //check status code
        if(response.getStatusCode() != 200){
            System.out.println(url + " -- Image is broken");
        }
        else{
            System.out.println(url + " -- Image is not broken");
        }

    }
}
