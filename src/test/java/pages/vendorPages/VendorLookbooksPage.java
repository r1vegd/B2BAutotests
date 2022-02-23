package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorLookbooksPage extends BasePage {
    public static final By LANDING_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[7]");
    public static final By LOOKBOOK_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[9]");
    public static final By ADD_LOOKBOOK_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public VendorLookbooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_LOOKBOOK_BUTTON);
    }

    public VendorLookbooksPage clickLookbooks() {
        driver.findElement(LANDING_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(LOOKBOOK_SIDE_MENU_BUTTON));
        driver.findElement(LOOKBOOK_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_LOOKBOOK_BUTTON));
        return new VendorLookbooksPage(driver);
    }

}
