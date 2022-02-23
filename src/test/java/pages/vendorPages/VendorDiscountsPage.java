package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorDiscountsPage extends BasePage {
    public static final By PRICES_AND_DISCOUNTS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[3]");
    public static final By DISCOUNTS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[5]");
    public static final By DISCOUNTS_ADD_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public VendorDiscountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DISCOUNTS_ADD_BUTTON);
    }

    public VendorDiscountsPage clickDiscounts() {
        driver.findElement(PRICES_AND_DISCOUNTS_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(DISCOUNTS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(DISCOUNTS_ADD_BUTTON));
        return new VendorDiscountsPage(driver);
    }

}
