package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminCountriesPage extends BasePage {
    public static final By COUNTRIES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[10]");
    public static final By ADD_COUNTRY_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminCountriesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_COUNTRY_BUTTON);
    }

    public AdminCountriesPage clickCountries() {
        driver.findElement(COUNTRIES_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_COUNTRY_BUTTON));
        return new AdminCountriesPage(driver);
    }

}
