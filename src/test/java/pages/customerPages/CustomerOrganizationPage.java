package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerOrganizationPage extends BasePage {
    public static final By MY_ORGANIZATION_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[9]");
    public static final By ORGANIZATION_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[12]");
    public static final By EDIT_ORGANIZATION_BUTTON = By.xpath("//button[@class='btn ml-20 btn-dark']");

    public CustomerOrganizationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(EDIT_ORGANIZATION_BUTTON);
    }

    public CustomerOrganizationPage clickOrganization() {
        driver.findElement(MY_ORGANIZATION_CUSTOMER_SIDE_MENU_BUTTON).click();
        driver.findElement(ORGANIZATION_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerOrganizationPage(driver);
    }


}
