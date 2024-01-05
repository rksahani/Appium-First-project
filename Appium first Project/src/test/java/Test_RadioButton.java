import Pages.HomePage;
import Pages.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_RadioButton
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
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        new HomePage(driver).enterViews()
                .enterRadioGroup()
                .clickSnack();
        Assert.assertEquals(driver.findElement(By.id("io.appium.android.apis:id/choice")).getText(), "You have selected: 2131296758");

    }
}
