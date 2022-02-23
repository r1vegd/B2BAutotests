package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class CustomerCatalogPage extends BasePage {
    public static final By CATALOG_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[2]");
    public static final By MODEL_TRIGGER = By.xpath("//div[@class='switch-checkbox-wrapper switch-checkbox-wrapper_catalog mx-3']");

    public CustomerCatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODEL_TRIGGER);
    }

    public CustomerCatalogPage clickCatalog() {
        driver.findElement(CATALOG_CUSTOMER_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MODEL_TRIGGER));
        return new CustomerCatalogPage(driver);
    }

}
