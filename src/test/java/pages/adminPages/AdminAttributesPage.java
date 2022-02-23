package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminAttributesPage extends BasePage {
    public static final By CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By ATTRIBUTES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[15]");
    public static final By ATTRIBUTES_SEARCH_INPUT = By.xpath("//input[@type='text']");

    public AdminAttributesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ATTRIBUTES_SEARCH_INPUT);
    }

    public AdminAttributesPage clickAttributes() {
        driver.findElement(CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(ATTRIBUTES_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ATTRIBUTES_SEARCH_INPUT));
        return new AdminAttributesPage(driver);
    }

}
