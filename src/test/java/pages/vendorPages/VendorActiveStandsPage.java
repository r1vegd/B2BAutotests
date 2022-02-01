package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorActiveStandsPage extends BasePage {
    public static final By STANDS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[2]");
    public static final By ACTIVE_STANDS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[1]");
    public static final By ADD_STAND_BUTTON = By.xpath("//button[@data-aqa]");

    public VendorActiveStandsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_STAND_BUTTON);
    }

    public VendorActiveStandsPage clickActiveStands() {
        driver.findElement(STANDS_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(ACTIVE_STANDS_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorActiveStandsPage(driver);
    }

}
