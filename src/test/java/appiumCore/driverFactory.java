package appiumCore;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class driverFactory {
    private static AndroidDriver<MobileElement> driver;
    private static Object IOException;

    public static AndroidDriver<MobileElement> getDriver() {
        if (driver == null) {
            createDriver();

        }
        return driver;
    }

    private static void createDriver() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");//Versao
        desiredCapabilities.setCapability("deviceName", "emulator-5554");//Nomedo Aparelho
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("automationName", "uiautomator2");//Xcuitest
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\wandersonchiconato\\IdeaProjects\\cursoAppium\\src\\test\\resources\\APK\\CTAppium_1_2.apk");


        URL remoteUrl = null;
        try {
            remoteUrl = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }




    }

}




