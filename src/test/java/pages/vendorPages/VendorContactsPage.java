package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorContactsPage extends BasePage {
    public static final By CONTACTS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[4]");
    public static final By SEARCH_CONTACTS_INPUT = By.xpath("//input[@class='custom-input form-control']");

    public VendorContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SEARCH_CONTACTS_INPUT);
    }

    public VendorContactsPage clickContacts() {
        driver.findElement(CONTACTS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_CONTACTS_INPUT));
        return new VendorContactsPage(driver);
    }

}
