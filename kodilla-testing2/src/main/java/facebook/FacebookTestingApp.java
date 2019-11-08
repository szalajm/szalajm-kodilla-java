package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class FacebookTestingApp {
    public final static String XPATH_WAITFOR_DAY = "//select[1]";
    public final static String XPATH_WAITFOR_MONTH = "//select[2]";
    public final static String XPATH_WAITFOR_YEAR = "//select[3]";

    public final static String XPATH_SELECT_DAY = "//span[@class = \"_5k_4\"]/span/select[1]";
    public final static String XPATH_SELECT_MONTH = "//span[@class = \"_5k_4\"]/span/select[2]";
    public final static String XPATH_SELECT_YEAR = "//span[@class = \"_5k_4\"]/span/select[3]";


    public static void main (String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://pl-pl.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAITFOR_DAY)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_WAITFOR_MONTH)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_WAITFOR_YEAR)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectedDay = new Select(selectDay);
        selectedDay.selectByIndex(12);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectedMonth = new Select(selectMonth);
        selectedMonth.selectByIndex(2);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectedYear = new Select(selectYear);
        selectedYear.selectByValue("1981");
    }
}
