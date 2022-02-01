package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerRolesPage extends BasePage {
    public static final By MY_ORGANIZATION_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By ROLES_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[13]");
    public static final By DEFAULT_ROLES_TITLE = By.xpath("(//div[@class='title title_18'])[1]");

    public CustomerRolesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DEFAULT_ROLES_TITLE);
    }

    public CustomerRolesPage clickRoles() {
        driver.findElement(MY_ORGANIZATION_CUSTOMER_SIDE_MENU_BUTTON).click();
        driver.findElement(ROLES_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerRolesPage(driver);
    }


}
