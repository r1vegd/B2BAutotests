package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerStandsPage extends BasePage {
    public static final By STANDS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[3]");
    public static final By STAND_SEARCH_INPUT = By.xpath("(//input[@type='text'])[3]");

    public CustomerStandsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(STAND_SEARCH_INPUT);
    }

    public CustomerStandsPage clickStands() {
        driver.findElement(STANDS_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerStandsPage(driver);
    }


}
