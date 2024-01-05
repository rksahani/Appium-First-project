package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;

    public ViewsPage(WebDriver driver)
    {
        this.driver = driver;
    }

   private By radioGroup = AppiumBy.accessibilityId("Radio Group");

    public RadioGroupPage enterRadioGroup(){
        MobileActions mb = new MobileActions(driver);
        mb.scrollDownToSpecificTextContained("Radio Group");
        driver.findElement(radioGroup).click();
        return new RadioGroupPage(driver);
    }
}
