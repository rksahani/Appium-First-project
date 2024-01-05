package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

   private By access_ibility = AppiumBy.accessibilityId("Access'ibility");
   private By app = AppiumBy.accessibilityId("App");
    private By graphics = AppiumBy.accessibilityId("Graphics");
    private By views = AppiumBy.accessibilityId("Views");
    public Accessi_BilityPage enterAccessi_bility(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(access_ibility).isDisplayed());
        driver.findElement(access_ibility).click();
        return new Accessi_BilityPage(driver);
    }

    public AppPage enterApp(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(app).isDisplayed());
        driver.findElement(app).click();
        return new AppPage(driver);
    }

    public GraphicsPage enterGraphics(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(graphics).isDisplayed());
        driver.findElement(graphics).click();
        return new GraphicsPage(driver);
    }
    public ViewsPage enterViews(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(views).isDisplayed());
        driver.findElement(views).click();
        return new ViewsPage(driver);
    }

}
