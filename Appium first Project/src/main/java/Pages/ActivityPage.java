package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    WebDriver driver;

    public ActivityPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By customTitle = AppiumBy.accessibilityId("Custom Title");

    public CustomTitlePage enterCustomTitle(){
        driver.findElement(customTitle).click();
        return new CustomTitlePage(driver);
    }
}
