package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminPackagesPage extends BasePage {
    public static final By USERS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[12]");
    public static final By PACKAGES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[22]");
    public static final By ADD_PACKAGE_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminPackagesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_PACKAGE_BUTTON);
    }

    public AdminPackagesPage clickPackages() {
        driver.findElement(USERS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(PACKAGES_ADMIN_SIDE_MENU_BUTTON));
        driver.findElement(PACKAGES_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_PACKAGE_BUTTON));
        return new AdminPackagesPage(driver);
    }

}
