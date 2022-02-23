package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminBrandsPage extends BasePage {
    public static final By BRANDS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[6]");
    public static final By ADD_BRANDS_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminBrandsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_BRANDS_BUTTON);
    }

    public AdminBrandsPage clickBrands() {
        driver.findElement(BRANDS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_BRANDS_BUTTON));
        return new AdminBrandsPage(driver);
    }

}
