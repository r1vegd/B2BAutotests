package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminRolesPage extends BasePage {
    public static final By USERS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[12]");
    public static final By ROLES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[21]");
    public static final By ADD_ROLE_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminRolesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_ROLE_BUTTON);
    }

    public AdminRolesPage clickRoles() {
        driver.findElement(USERS_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(ROLES_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminRolesPage(driver);
    }


}
