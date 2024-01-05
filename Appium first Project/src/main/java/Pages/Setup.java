package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Setup
{
    WebDriver driver;
    public Setup(WebDriver driver)
    {
        this.driver=driver;
    }

   public WebDriver setupDeviceInNativeAppium()throws MalformedURLException
   {

       String AppName = System.getProperty("user.dir") + "/src/test/resources/TestDataFiles/ApiDemos-debug.apk";
       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability("platformName", "Android");
       caps.setCapability("appium:deviceName", "Demo");
       caps.setCapability("appium:app", AppName);
       caps.setCapability("appium:platformVersion", "14");
       caps.setCapability("appium:automationName", "UiAutomator2");
       driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
       return driver;
   }

//   public void EndSetup() throws MalformedURLException
//   {
//       if (driver != null)
//       {
//            driver.quit();
//        }
//   }

}
