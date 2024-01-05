import Pages.CustomTitlePage;
import Pages.GraphicsPage;
import Pages.HomePage;
import Pages.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_Scrolling {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
        driver= new Setup(driver).setupDeviceInNativeAppium();
        homePage = new HomePage(driver);
    }
    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not

        new HomePage(driver)
                .enterGraphics()
                .enterScaleToFit();
        String expected = new GraphicsPage(driver).changeDisplayCheck();
        Assert.assertTrue(expected.equals("true"));


    }
}
