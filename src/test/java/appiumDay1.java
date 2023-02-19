import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

;

public class appiumDay1 {
    @Test
    public void test01() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "PIXEL");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("unicodeKeyboard", "true");
        caps.setCapability("resetKeyboard", "true");
        //caps.setCapability("app", "C:\\Users\\Lenovo X270\\IdeaProjects\\AppiumWise\\apps\\calculator-vault-3-0-9-ced41a50b.apk");

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //driver.findElementById("com.android.calculator2:id/digit_9").click();
        MobileElement searchBox=driver.findElementById("com.android.chrome:id/search_box_text");
        searchBox.sendKeys("Eindhoven");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        //driver.pressKey(AndroidKey.NUMPAD_ENTER,KeyEvent(84));
//        Keyboard keyboard=driver.getKeyboard();
//        keyboard.pressKey(AndroidKey.NUMPAD_ENTER,new KeyEvent(AndroidKey.ENTER));
//        keyboard.releaseKey("66");
        //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));






    }


}
