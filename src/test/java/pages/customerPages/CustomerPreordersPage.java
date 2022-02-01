package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerPreordersPage extends BasePage {
    public static final By PREORDERS_AND_ORDERS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[8]");
    public static final By PREORDERS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[9]");
    public static final By PREORDERS_TITLE = By.xpath("//div[@class='main-title d-flex align-items-center mb-40']");


    public CustomerPreordersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(PREORDERS_TITLE);
    }

    public CustomerPreordersPage clickPreorders() {
        driver.findElement(PREORDERS_AND_ORDERS_CUSTOMER_SIDE_MENU_BUTTON).click();
        driver.findElement(PREORDERS_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerPreordersPage(driver);
    }

}
