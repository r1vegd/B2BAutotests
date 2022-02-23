package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminTemplatesPage extends BasePage {
    public static final By LOCALIZATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[13]");
    public static final By TEMPLATES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[26]");
    public static final By TEMPLATES_SEARCH_INPUT = By.xpath("//input[@type='text']");

    public AdminTemplatesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(TEMPLATES_SEARCH_INPUT);
    }

    public AdminTemplatesPage clickTemplates() {
        driver.findElement(LOCALIZATION_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(TEMPLATES_ADMIN_SIDE_MENU_BUTTON));
        driver.findElement(TEMPLATES_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(TEMPLATES_SEARCH_INPUT));
        return new AdminTemplatesPage(driver);
    }

}
