package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorOrganizationPage extends BasePage {
    public static final By MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By ORGANIZATION_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[10]");
    public static final By EDIT_ORGANIZATION_BUTTON = By.xpath("//button[@class='btn ml-20 btn-dark']");

    public VendorOrganizationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(EDIT_ORGANIZATION_BUTTON);
    }

    public VendorOrganizationPage clickOrganization() {
        driver.findElement(MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(ORGANIZATION_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorOrganizationPage(driver);
    }

}
