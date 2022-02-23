package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminLanguagesPage extends BasePage {
    public static final By LOCALIZATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[13]");
    public static final By LANGUAGES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[29]");
    public static final By LANGUAGES_SEARCH_INPUT = By.xpath("//input[@type='text']");

    public AdminLanguagesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LANGUAGES_SEARCH_INPUT);
    }

    public AdminLanguagesPage clickLanguages() {
        driver.findElement(LOCALIZATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(LANGUAGES_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(LANGUAGES_SEARCH_INPUT));
        return new AdminLanguagesPage(driver);
    }

}
