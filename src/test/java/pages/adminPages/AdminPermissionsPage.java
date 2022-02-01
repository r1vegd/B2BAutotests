package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(PERMISSIONS_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminPermissionsPage(driver);
    }

}
