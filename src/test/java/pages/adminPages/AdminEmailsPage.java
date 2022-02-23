package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminEmailsPage extends BasePage {
    public static final By LOCALIZATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[13]");
    public static final By EMAILS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[28]");
    public static final By EMAILS_SEARCH_INPUT = By.xpath("//input[@type='text']");

    public AdminEmailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(EMAILS_SEARCH_INPUT);
    }

    public AdminEmailsPage clickEmails() {
        driver.findElement(LOCALIZATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(EMAILS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(EMAILS_SEARCH_INPUT));
        return new AdminEmailsPage(driver);
    }

}
