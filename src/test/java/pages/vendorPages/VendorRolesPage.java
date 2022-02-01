package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorRolesPage extends BasePage {
    public static final By MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By ROLES_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[11]");
    public static final By ADD_ROLE_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public VendorRolesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_ROLE_BUTTON);
    }

    public VendorRolesPage clickRoles() {
        driver.findElement(MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(ROLES_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorRolesPage(driver);
    }

}
