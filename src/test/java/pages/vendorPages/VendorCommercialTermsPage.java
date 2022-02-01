package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorCommercialTermsPage extends BasePage {
    public static final By MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By COMMERCIAL_TERMS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[13]");
    public static final By SAVE_COMMERCIAL_TERMS_BUTTON = By.xpath("//button[@class='btn btn-primary btn-lg']");

    public VendorCommercialTermsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SAVE_COMMERCIAL_TERMS_BUTTON);
    }

    public VendorCommercialTermsPage clickCommercialTerms() {
        driver.findElement(MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(COMMERCIAL_TERMS_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorCommercialTermsPage(driver);
    }

}
