package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerContactsPage extends BasePage {
    public static final By CONTACTS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[5]");
    public static final By CONTACTS_SEARCH_INPUT = By.xpath("(//input[@type='text'])[3]");

    public CustomerContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CONTACTS_SEARCH_INPUT);
    }

    public CustomerContactsPage clickContacts() {
        driver.findElement(CONTACTS_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerContactsPage(driver);
    }

}
