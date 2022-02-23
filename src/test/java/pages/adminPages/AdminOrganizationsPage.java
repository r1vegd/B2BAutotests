package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminOrganizationsPage extends BasePage {
    public static final By ORGANIZATIONS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[4]");
    public static final By ORGANIZATIONS_SEARCH_INPUT = By.xpath("//input[@type='text']");

    public AdminOrganizationsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ORGANIZATIONS_SEARCH_INPUT);
    }

    public AdminOrganizationsPage clickOrganizations() {
        driver.findElement(ORGANIZATIONS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ORGANIZATIONS_SEARCH_INPUT));
        return new AdminOrganizationsPage(driver);
    }

}
