import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileBrowsing {
    @Test
    public void mobileBrowsingTest() throws MalformedURLException {
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("platformName", "Android");
    cap.setCapability("platformVersion", "9.0");
    cap.setCapability("deviceName", "I4113");
    cap.setCapability("browserName", "chrome");
    cap.setCapability("chromedriverExecutable", "C:\\Users\\Lenovo X270\\IdeaProjects\\AppiumWise1\\apps\\chromedriver.exe");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1"), cap);
    }
}
