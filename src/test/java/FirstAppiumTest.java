import io.appium.java_client.remote.MobileCapabilityType;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstAppiumTest {


    // Run browser tests
    @Test()
    public void firstAppiumTest2() throws IOException {
        // Pre Steps: Android SDK, AVD MAnager with started device
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy Nexus API 29");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
//        capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "com.android.calculator");
        WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        System.out.println(driver.toString());
        driver.get("https://www.president.gov.ua/");
        driver.get("http://appium.io");
        driver.get("http://www.automationtestinghub.com");
        driver.get("https://www.president.gov.ua/");
        driver.quit();
    }

    @Test()
    public void firstAppiumTest3() throws IOException {
        // Pre Steps: Android SDK, AVD MAnager with started device
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Nexus 7 API 29");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
//        capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "com.android.calculator");
        WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        System.out.println(driver.toString());
        driver.get("https://www.president.gov.ua/");
        driver.get("http://appium.io");
        driver.get("http://www.automationtestinghub.com");
        driver.get("https://www.president.gov.ua/");
        driver.quit();
    }

    public void captureScreenshot(WebDriver driver) throws IOException {
        String extension = ".png";
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = RandomString.make(4);
        String date = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        FileUtils.copyFile(scrFile, new File("./src" + date + timestamp + extension));
    }
}
