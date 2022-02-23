package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorWarehousePage extends BasePage {
    public static final By WAREHOUSES_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By CREATE_WAREHOUSE_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public VendorWarehousePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CREATE_WAREHOUSE_BUTTON);
    }

    public VendorWarehousePage clickWarehouses() {
        driver.findElement(WAREHOUSES_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(CREATE_WAREHOUSE_BUTTON));
        return new VendorWarehousePage(driver);
    }

}
