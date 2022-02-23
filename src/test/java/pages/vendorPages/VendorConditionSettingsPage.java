package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorConditionSettingsPage extends BasePage {
    public static final By MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By CONDITION_SETTINGS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[12]");
    public static final By CONDITION_SETTINGS_TITLE = By.xpath("//div[@class='main-title d-flex align-items-center mb-40']");

    public VendorConditionSettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CONDITION_SETTINGS_TITLE);
    }

    public VendorConditionSettingsPage clickConditionSettings() {
        driver.findElement(MY_ORGANIZATION_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(CONDITION_SETTINGS_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONDITION_SETTINGS_TITLE));
        return new VendorConditionSettingsPage(driver);
    }

}
