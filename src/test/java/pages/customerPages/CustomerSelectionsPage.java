package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class CustomerSelectionsPage extends BasePage {
    public static final By SELECTIONS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[7]");
    public static final By SELECTION_SEARCH_INPUT = By.xpath("(//input[@type='text'])[4]");

    public CustomerSelectionsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SELECTION_SEARCH_INPUT);
    }

    public CustomerSelectionsPage clickSelections() {
        driver.findElement(SELECTIONS_CUSTOMER_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SELECTION_SEARCH_INPUT));
        return new CustomerSelectionsPage(driver);
    }


}
