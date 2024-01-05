package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppPage {
    WebDriver driver;

    public AppPage(WebDriver driver)
    {
        this.driver = driver;
    }

   private By activity = AppiumBy.accessibilityId("Activity");

    public ActivityPage enterActivity(){
        driver.findElement(activity).click();
        return new ActivityPage(driver);
    }
}
