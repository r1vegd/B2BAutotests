package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorBannersPage extends BasePage {
    public static final By LANDING_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[7]");
    public static final By BANNER_CAROUSEL_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[8]");
    public static final By ADD_BANNER_BUTTON = By.xpath("//button[@class='btn btn-dark']");

    public VendorBannersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_BANNER_BUTTON);
    }

    public VendorBannersPage clickBanners() {
        driver.findElement(LANDING_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(BANNER_CAROUSEL_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_BANNER_BUTTON));
        return new VendorBannersPage(driver);
    }

}
