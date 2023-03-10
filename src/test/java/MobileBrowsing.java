import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.Set;


public class MobileBrowsing {
    @Test
    public void mobileBrowsingTest() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("deviceName", "I4113");
        cap.setCapability("browserName", "chrome");
        cap.setCapability("chromedriverExecutable", "C:\\Users\\Lenovo X270\\IdeaProjects\\AppiumWise1\\apps\\chromedriver.exe");

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000);

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), cap);
        driver.get("https://www.amazon.com.tr");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone" + Keys.ENTER);

        Set<String> allKinds = driver.getWindowHandles();
        for (String handle : allKinds) {
            System.out.println("kind: " + handle);
            if (handle.contains("WEBVIEW_chrome")) {
                driver.context(handle);
            }
        }
        System.out.println(driver.getContext() + "i reached the chrome");
    }
}
