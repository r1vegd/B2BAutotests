package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorSalesUnitsPage extends BasePage {
    public static final By SALES_UNITS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[8]");
    public static final By SALES_UNITS_SEARCH_INPUT = By.xpath("//input[@class='custom-input form-control']");

    public VendorSalesUnitsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SALES_UNITS_SEARCH_INPUT);
    }

    public VendorSalesUnitsPage clickSalesUnits() {
        driver.findElement(SALES_UNITS_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorSalesUnitsPage(driver);
    }

}
