package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@Log4j2
public abstract class BasePage {
//    public static final String BASE_URL = "https://stage.lacit.net/";

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract boolean isPageOpen();

    public boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (NoSuchElementException ex) {
            log.info(">>>>>>>!!!" + ex.getMessage());
            return false;
        }
    }

}