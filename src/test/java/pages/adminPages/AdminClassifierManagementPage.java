package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminClassifierManagementPage extends BasePage {
    public static final By CLASSIFIER_MANAGEMENT_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By FIRST_CLASSIFIER_IMPORT_BUTTON = By.xpath("(//i[@class='fa fa-download'])[1]");

    public AdminClassifierManagementPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(FIRST_CLASSIFIER_IMPORT_BUTTON);
    }

    public AdminClassifierManagementPage clickClassifierManagement() {
        driver.findElement(CLASSIFIER_MANAGEMENT_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(FIRST_CLASSIFIER_IMPORT_BUTTON));
        return new AdminClassifierManagementPage(driver);
    }

}
