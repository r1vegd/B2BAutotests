package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerEventsPage extends BasePage {
    public static final By EVENTS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[6]");
    public static final By EVENTS_SEARCH_INPUT = By.xpath("(//input[@type='text'])[2]");

    public CustomerEventsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(EVENTS_SEARCH_INPUT);
    }

    public CustomerEventsPage clickEvents() {
        driver.findElement(EVENTS_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerEventsPage(driver);
    }

}
