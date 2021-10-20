package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import screens.*;
import utils.DesiredCapabilitiesUtils;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;


public class Hooks {
    public static AndroidDriver<AndroidElement> androidDriver;
    public static WaterScreen waterScreen;
    public static FirstProductScreen firstProductScreen;
    public static CartScreen cartScreen;
    public static HomeScreen homeScreen;
    public static ThirdProductScreen thirdProductScreen;
    public static BabyCareScreen babyCareScreen;

    @Before
    public void openBrowser() throws MalformedURLException {
        androidDriver = DesiredCapabilitiesUtils.setupAndroidDesiredCapabilities();
        waterScreen = new WaterScreen(androidDriver);
        firstProductScreen = new FirstProductScreen(androidDriver);
        cartScreen = new CartScreen(androidDriver);
        homeScreen = new HomeScreen(androidDriver);
        thirdProductScreen = new ThirdProductScreen(androidDriver);
        babyCareScreen = new BabyCareScreen(androidDriver);
    }


    @After
    public void tearDown() {
        androidDriver.quit();
    }
}