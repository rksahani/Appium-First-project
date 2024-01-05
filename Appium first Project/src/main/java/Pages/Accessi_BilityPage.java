package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessi_BilityPage {
    WebDriver driver;

    public Accessi_BilityPage(WebDriver driver)
    {
        this.driver = driver;
    }

   private By Accessibility_Node_Querying = AppiumBy.accessibilityId("Accessibility Node Querying");
    private By apiNode= By.xpath("//android.widget.TextView[@text=\"API Demos\"]");

    public String displayCheck()
    {
        return driver.findElement(apiNode).getAttribute("displayed");
    }

    public CheckBoxPage enterAccessibility_Node_Querying(){
        driver.findElement(Accessibility_Node_Querying).click();
        return new CheckBoxPage(driver);
    }
}
