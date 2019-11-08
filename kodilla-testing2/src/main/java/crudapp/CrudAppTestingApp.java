package crudapp;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public final static String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public final static String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    public final static String XPATH_WAITFOR = "//select[1]";
    public final static String XPATH_SELECT = "//div[contains(@class, \"task_container\")]/form/div/fieldset/select[1]";


    public static void main (String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://szalajm.github.io/");

        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
        searchField.sendKeys("New robotic task");

        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));
        textareaField.sendKeys("The robotic content");

        while (!driver.findElement(By.xpath(XPATH_WAITFOR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoards = new Select(selectCombo);
        selectBoards.selectByIndex(1);
    }
}
