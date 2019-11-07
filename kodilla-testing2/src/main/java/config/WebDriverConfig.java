package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String FIREFOX = "firefox_driver";
    public final static String CHROME = "chrome_driver";

    public static WebDriver getDriver (final String driver){
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if(driver.equals(FIREFOX)){
            return new FirefoxDriver();
        } else if(driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
