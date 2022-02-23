package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminMeasurementUnitsPage extends BasePage {
    public static final By CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By MEASUREMENT_UNITS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[16]");
    public static final By ADD_UNIT_BUTTON = By.xpath("//button[@class='btn btn-primary']");


    public AdminMeasurementUnitsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_UNIT_BUTTON);
    }

    public AdminMeasurementUnitsPage clickMeasurementUnits() {
        driver.findElement(CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(MEASUREMENT_UNITS_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_UNIT_BUTTON));
        return new AdminMeasurementUnitsPage(driver);
    }

}
