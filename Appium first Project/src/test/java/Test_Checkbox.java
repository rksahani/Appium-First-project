import Pages.CheckBoxPage;
import Pages.HomePage;
import Pages.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_Checkbox {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() throws MalformedURLException
    {
        driver= new Setup(driver).setupDeviceInNativeAppium();
        homePage = new HomePage(driver);
    }
    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver).enterAccessi_bility()
                .enterAccessibility_Node_Querying()
                .clickCheckBox();

        String expected = new CheckBoxPage(driver).checkTick();
        Assert.assertTrue(expected.equals("true"));

    }
}
