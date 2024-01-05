package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GraphicsPage {
    WebDriver driver;

    public GraphicsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By scaleToFit = AppiumBy.accessibilityId("ScaleToFit");
    private By vertices = AppiumBy.accessibilityId("Vertices");

    public void enterScaleToFit(){
        MobileActions mb = new MobileActions(driver);
        mb.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(scaleToFit).click();
    }
    private By scaleToFitDisplay= By.xpath("//android.widget.TextView[@text=\"Graphics/ScaleToFit\"]");

    public String changeDisplayCheck()
    {
        return driver.findElement(scaleToFitDisplay).getAttribute("displayed");
    }

    public void enterVertices(){
        MobileActions mb = new MobileActions(driver);
        mb.scrollDownToSpecificText("Vertices");
        driver.findElement(vertices).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mb.swipe(0.75,200,200,"right");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mb.swipe(0.75,200,200,"left");
    }

}