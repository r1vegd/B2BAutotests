package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminPermissionsPage extends BasePage {
    public static final By USERS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[12]");
    public static final By PERMISSIONS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[23]");
    public static final By ADD_PERMISSION_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminPermissionsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_PERMISSION_BUTTON);
    }

    public AdminPermissionsPage clickPermissions() {
        driver.findElement(USERS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(PERMISSIONS_ADMIN_SIDE_MENU_BUTTON));
        driver.findElement(PERMISSIONS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_PERMISSION_BUTTON));
        return new AdminPermissionsPage(driver);
    }

}
