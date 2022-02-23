package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorPreordersPage extends BasePage {
    public static final By PREORDERS_AND_ORDERS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[6]");
    public static final By PREORDERS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[6]");
    public static final By PREORDERS_SHOW_BY = By.xpath("//ul[@class='d-flex']");

    public VendorPreordersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(PREORDERS_SHOW_BY);
    }

    public VendorPreordersPage clickPreorders() {
        driver.findElement(PREORDERS_AND_ORDERS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(PREORDERS_VENDOR_SIDE_MENU_BUTTON));
        driver.findElement(PREORDERS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PREORDERS_SHOW_BY));
        return new VendorPreordersPage(driver);
    }

}
