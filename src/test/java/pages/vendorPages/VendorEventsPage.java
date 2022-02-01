package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorEventsPage extends BasePage {
    public static final By EVENTS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[5]");
    public static final By SEARCH_EVENTS_INPUT = By.xpath("//input[@class='custom-input form-control']");

    public VendorEventsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SEARCH_EVENTS_INPUT);
    }

    public VendorContactsPage clickEvents() {
        driver.findElement(EVENTS_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorContactsPage(driver);
    }

}
