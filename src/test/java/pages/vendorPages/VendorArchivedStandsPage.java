package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorArchivedStandsPage extends BasePage {
    public static final By STANDS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[2]");
    public static final By ARCHIVED_STANDS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[2]");
    public static final By SEARCH_ARCHIVED_STANDS = By.xpath("//input[@class='custom-input form-control']");

    public VendorArchivedStandsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SEARCH_ARCHIVED_STANDS);
    }

    public VendorArchivedStandsPage clickArchivedStands() {
        driver.findElement(STANDS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ARCHIVED_STANDS_VENDOR_SIDE_MENU_BUTTON));
        driver.findElement(ARCHIVED_STANDS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_ARCHIVED_STANDS));
        return new VendorArchivedStandsPage(driver);
    }

}
