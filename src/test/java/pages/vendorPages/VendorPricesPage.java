package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorPricesPage extends BasePage {
    public static final By PRICES_AND_DISCOUNTS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[3]");
    public static final By PRICES_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[4]");
    public static final By ADD_PRICE_LIST_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public VendorPricesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_PRICE_LIST_BUTTON);
    }

    public VendorPricesPage clickPrices() {
        driver.findElement(PRICES_AND_DISCOUNTS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(PRICES_VENDOR_SIDE_MENU_BUTTON));
        driver.findElement(PRICES_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_PRICE_LIST_BUTTON));
        return new VendorPricesPage(driver);
    }

}
