package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerOrdersPage extends BasePage {
    public static final By PREORDERS_AND_ORDERS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[8]");
    public static final By ORDERS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[10]");
    public static final By ORDERS_TITLE = By.xpath("//div[@class='main-title d-flex align-items-center mb-40']");

    public CustomerOrdersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ORDERS_TITLE);
    }

    public CustomerOrdersPage clickOrders() {
        driver.findElement(PREORDERS_AND_ORDERS_CUSTOMER_SIDE_MENU_BUTTON).click();
        driver.findElement(ORDERS_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerOrdersPage(driver);
    }

}
