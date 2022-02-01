package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminEventsPage extends BasePage {
    public static final By EVENTS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[5]");
    public static final By ADD_EVENT_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminEventsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_EVENT_BUTTON);
    }

    public AdminEventsPage clickEvents() {
        driver.findElement(EVENTS_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminEventsPage(driver);
    }

}
