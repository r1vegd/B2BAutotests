package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerBrandsPage extends BasePage {
    public static final By BRANDS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[4]");
    public static final By BRAND_SEARCH_INPUT = By.xpath("(//input[@type='text'])[2]");

    public CustomerBrandsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BRAND_SEARCH_INPUT);
    }

    public CustomerBrandsPage clickBrands() {
        driver.findElement(BRANDS_CUSTOMER_SIDE_MENU_BUTTON).click();
        return new CustomerBrandsPage(driver);
    }


}
