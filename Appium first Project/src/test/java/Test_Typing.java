import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_Typing
{
    WebDriver driver;
   HomePage homePage;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
       driver= new Setup(driver).setupDeviceInNativeAppium();
         homePage = new HomePage(driver);
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new HomePage(driver).enterApp()
                .enterActivity()
                .enterCustomTitle()
                .enterTitle();
        String expected = new CustomTitlePage(driver).changeDisplayCheck();
        Assert.assertTrue(expected.equals("true"));

    }
}
