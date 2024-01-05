import Pages.Accessi_BilityPage;
import Pages.CustomTitlePage;
import Pages.HomePage;
import Pages.Setup;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_ClickAction {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
        driver= new Setup(driver).setupDeviceInNativeAppium();
        homePage = new HomePage(driver);
    }
    @Test
    public void testClickAction() {
        new HomePage(driver)
                .enterAccessi_bility();
        String expected = new Accessi_BilityPage(driver).displayCheck();
        Assert.assertTrue(expected.equals("true"));

    }
}
