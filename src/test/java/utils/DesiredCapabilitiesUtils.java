package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DesiredCapabilitiesUtils {

    public static AndroidDriver<AndroidElement> setupAndroidDesiredCapabilities() throws MalformedURLException {
        File appFile = new File(ConfigReader.getProperty("apkAppPath"));

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
        desiredCapabilities.setCapability("app", appFile.getAbsolutePath());

        URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<AndroidElement> driver = new AndroidDriver(appiumServerUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}


