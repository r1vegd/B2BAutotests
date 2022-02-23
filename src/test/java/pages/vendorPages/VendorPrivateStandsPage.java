package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorPrivateStandsPage extends BasePage {
    public static final By STANDS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[2]");
    public static final By PRIVATE_STANDS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[3]");
    public static final By SEARCH_PRIVATE_STANDS = By.xpath("//input[@class='custom-input form-control']");

    public VendorPrivateStandsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SEARCH_PRIVATE_STANDS);
    }

    public VendorPrivateStandsPage clickPrivateStands() {
        driver.findElement(STANDS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(PRIVATE_STANDS_VENDOR_SIDE_MENU_BUTTON));
        driver.findElement(PRIVATE_STANDS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_PRIVATE_STANDS));
        return new VendorPrivateStandsPage(driver);
    }

}
