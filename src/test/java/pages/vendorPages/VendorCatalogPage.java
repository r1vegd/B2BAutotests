package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorCatalogPage extends BasePage {
    public static final By CATALOG_VENDOR_SIDE_MENU_BUTTON = By.xpath("//i[@class='fa fa-catalog_active']");
    public static final By DOWNLOAD_UPLOAD_PRODUCTS_BUTTON = By.xpath("//button[@class='btn dropdown-toggle btn-secondary d-flex align-items-center']//span");

    public VendorCatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DOWNLOAD_UPLOAD_PRODUCTS_BUTTON);
    }

    public VendorCatalogPage clickVendorCatalog() {
        driver.findElement(CATALOG_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(DOWNLOAD_UPLOAD_PRODUCTS_BUTTON));
        return new VendorCatalogPage(driver);
    }

}
