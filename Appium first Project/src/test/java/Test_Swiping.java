import Pages.HomePage;
import Pages.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_Swiping {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
        driver= new Setup(driver).setupDeviceInNativeAppium();
        homePage = new HomePage(driver);
    }
    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left

        new HomePage(driver).enterGraphics()
                .enterVertices();




    }
}
