package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroupPage {
    WebDriver driver;

    public RadioGroupPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By clear = AppiumBy.accessibilityId("Clear");
   private By snack = By.id("io.appium.android.apis:id/snack");

    public void clickSnack(){
        driver.findElement(clear).click();
        driver.findElement(snack).click();
    }
}
