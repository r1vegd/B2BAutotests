package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminClassifiersPage extends BasePage {
    public static final By LOCALIZATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[13]");
    public static final By CLASSIFIER_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[27]");
    public static final By CLASSIFIER_SEARCH_INPUT = By.xpath("//input[@type='text']");

    public AdminClassifiersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CLASSIFIER_SEARCH_INPUT);
    }

    public AdminClassifiersPage clickClassifier() {
        driver.findElement(LOCALIZATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(CLASSIFIER_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(CLASSIFIER_SEARCH_INPUT));
        return new AdminClassifiersPage(driver);
    }

}



