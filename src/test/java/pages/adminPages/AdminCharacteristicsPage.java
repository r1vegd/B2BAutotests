package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminCharacteristicsPage extends BasePage {
    public static final By CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By CHARACTERISTICS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[14]");
    public static final By ADD_CHARACTERISTIC_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminCharacteristicsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_CHARACTERISTIC_BUTTON);
    }

    public AdminCharacteristicsPage clickCharacteristics() {
        driver.findElement(CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(CHARACTERISTICS_ADMIN_SIDE_MENU_BUTTON));
        driver.findElement(CHARACTERISTICS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_CHARACTERISTIC_BUTTON));
        return new AdminCharacteristicsPage(driver);
    }

}
