package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorHelpCenterPage extends BasePage {
    public static final By HELP_CENTER_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[10]");
    public static final By SEARCH_HELP_CENTER_INPUT = By.xpath("//input[@type='text']");

    public VendorHelpCenterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SEARCH_HELP_CENTER_INPUT);
    }

    public VendorHelpCenterPage clickHelpCenter() {
        driver.findElement(HELP_CENTER_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorHelpCenterPage(driver);
    }

}
