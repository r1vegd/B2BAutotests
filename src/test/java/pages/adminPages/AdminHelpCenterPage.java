package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminHelpCenterPage extends BasePage {
    public static final By HELP_CENTER_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[14]");
    public static final By HELP_CENTER_INPUT = By.xpath("//input[@type='text']");

    public AdminHelpCenterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(HELP_CENTER_INPUT);
    }

    public AdminHelpCenterPage clickHelpCenter() {
        driver.findElement(HELP_CENTER_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(HELP_CENTER_INPUT));
        return new AdminHelpCenterPage(driver);
    }

}
