package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorSurveyPage extends BasePage {
    public static final By SURVEY_MAIN_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[12]");
    public static final By SURVEY_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[14]");
    public static final By SURVEY_BREADCRUMBS = By.xpath("//li[@class='current-breadcrumb']");

    public VendorSurveyPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SURVEY_BREADCRUMBS);
    }

    public VendorSurveyPage clickSurvey() {
        driver.findElement(SURVEY_MAIN_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(SURVEY_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorSurveyPage(driver);
    }

}
