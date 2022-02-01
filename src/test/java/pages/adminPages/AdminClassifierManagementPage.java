package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminClassifierManagementPage extends BasePage {
    public static final By CLASSIFIER_MANAGEMENT_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By IMPORT_BUTTON = By.xpath("//div[@class='icon-tool_text fa fa-add']");

    public AdminClassifierManagementPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(IMPORT_BUTTON);
    }

    public AdminClassifierManagementPage clickClassifierManagement() {
        driver.findElement(CLASSIFIER_MANAGEMENT_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminClassifierManagementPage(driver);
    }

}
