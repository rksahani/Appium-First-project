package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    WebDriver driver;

    public CustomTitlePage(WebDriver driver)
    {
        this.driver = driver;
    }

 private    By box = By.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]");
    private By changeLeft = AppiumBy.accessibilityId("Change Left");

    public void enterTitle(){
        driver.findElement(box).clear();
        driver.findElement(box).sendKeys("Appium");
        driver.findElement(changeLeft).click();
    }

   private By changedDisplay= By.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]");

    public String changeDisplayCheck()
    {
        return driver.findElement(changedDisplay).getAttribute("Displayed");
    }

}
