package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminIndustriesPage extends BasePage {
    public static final By CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By INDUSTRIES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[18]");
    public static final By ADD_INDUSTRY_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminIndustriesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_INDUSTRY_BUTTON);
    }

    public AdminIndustriesPage clickIndustries() {
        driver.findElement(CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(INDUSTRIES_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminIndustriesPage(driver);
    }

}
