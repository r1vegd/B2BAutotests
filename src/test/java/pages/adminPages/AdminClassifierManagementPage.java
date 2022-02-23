package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminClassifierManagementPage extends BasePage {
    public static final By FIRST_CATEGORY_IMPORT_BUTTON = By.xpath("(//i[@class='fa fa-download'])[1]");
    public static final By IMPORT_BUTTON = By.xpath("//div[@class='icon-tool_text fa fa-add']");

    public AdminClassifierManagementPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(IMPORT_BUTTON);
    }

    public AdminClassifierManagementPage clickClassifierManagement() {
        driver.findElement(FIRST_CATEGORY_IMPORT_BUTTON).click();
        return new AdminClassifierManagementPage(driver);
    }

}
