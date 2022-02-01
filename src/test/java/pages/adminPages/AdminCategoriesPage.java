package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminCategoriesPage extends BasePage {
    public static final By CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By CATEGORIES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[13]");
    public static final By ADD_CATEGORY_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminCategoriesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_CATEGORY_BUTTON);
    }

    public AdminCategoriesPage clickCategories() {
        driver.findElement(CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(CATEGORIES_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminCategoriesPage(driver);
    }

}
