import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class appiumDay1 {
    @Test
    public void test01() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "I4113");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "C:\\Users\\Lenovo X270\\IdeaProjects\\AppiumWise\\apps\\calculator-vault-3-0-9-ced41a50b.apk");

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }
}
