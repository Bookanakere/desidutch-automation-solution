package starter;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceMobileDriver implements DriverSource {


    public static final String USERNAME = "oauth-rash.pb-80227";
    public static final String ACCESS_KEY = "028b6f75-ef79-4a11-b492-b7dfdbd444c9";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    @Override
    public WebDriver newDriver() {
        try {

            MutableCapabilities sauceOptions = new MutableCapabilities();
            sauceOptions.setCapability("name", "DesiDutch_IOS_TEST");
            sauceOptions.setCapability("recordVideo","true");

            DesiredCapabilities capabilities = new DesiredCapabilities().iphone();
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("deviceName", "iPhone XS Simulator");
            capabilities.setCapability("platformVersion", "14.3");
            capabilities.setCapability("deviceOrientation", "portrait");
            capabilities.setCapability("appiumVersion", "1.20.1");
            capabilities.setCapability("browserName", "Safari");
            capabilities.setCapability("sauce:options", sauceOptions);
            WebDriver driver= new IOSDriver<IOSElement>(new URL(URL), capabilities);
            return driver;
        } catch (MalformedURLException e) {
            throw new Error(e);
        }

    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
