package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminCatalogPage extends BasePage {
    public static final By CATALOG_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[3]");
    public static final By SELECT_ALL_BUTTON = By.xpath("//div[@class='select-all-btn d-flex align-items-center fa fa-select']");

    public AdminCatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SELECT_ALL_BUTTON);
    }

    public AdminCatalogPage clickCatalog() {
        driver.findElement(CATALOG_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminCatalogPage(driver);
    }

}
