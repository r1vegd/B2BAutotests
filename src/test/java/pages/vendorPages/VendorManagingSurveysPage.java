package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class VendorManagingSurveysPage extends BasePage {
    public static final By SURVEY_MAIN_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[12]");
    public static final By MANAGING_SURVEY_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[15]");
    public static final By ADD_NEW_SURVEY_BUTTON = By.xpath("//div[@class='icon-tool fa fa-add']");

    public VendorManagingSurveysPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_NEW_SURVEY_BUTTON);
    }

    public VendorManagingSurveysPage clickManagingSurvey() {
        driver.findElement(SURVEY_MAIN_VENDOR_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(MANAGING_SURVEY_SIDE_MENU_BUTTON));
        driver.findElement(MANAGING_SURVEY_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_NEW_SURVEY_BUTTON));
        return new VendorManagingSurveysPage(driver);
    }

}
