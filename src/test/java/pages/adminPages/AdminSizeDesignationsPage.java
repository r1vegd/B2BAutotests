package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminSizeDesignationsPage extends BasePage {
    public static final By SIZE_DESIGNATIONS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[7]");
    public static final By ADD_SIZE_DESIGNATIONS_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminSizeDesignationsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_SIZE_DESIGNATIONS_BUTTON);
    }

    public AdminSizeDesignationsPage clickSizeDesignations() {
        driver.findElement(SIZE_DESIGNATIONS_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminSizeDesignationsPage(driver);
    }

}
