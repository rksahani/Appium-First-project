package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver;

    public CheckBoxPage(WebDriver driver)
    {
        this.driver = driver;
    }

   private By checkBox = By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[5]");

    public void clickCheckBox()
    {
        driver.findElement(checkBox).click();
    }

    private By checkClick= By.xpath("//android.widget.TextView[@content-desc=\"Task Do Taxes\"]//parent::android.widget.LinearLayout/android.widget.CheckBox");
     public String checkTick()
     {
         return driver.findElement(checkClick).getAttribute("checked");
     }

}
