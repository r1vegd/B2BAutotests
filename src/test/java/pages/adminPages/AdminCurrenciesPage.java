package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminCurrenciesPage extends BasePage {
    public static final By CURRENCIES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[8]");
    public static final By ADD_CURRENCIES_BUTTON = By.xpath("//button[@class='btn btn-primary']");

    public AdminCurrenciesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_CURRENCIES_BUTTON);
    }

    public AdminCurrenciesPage clickCurrencies() {
        driver.findElement(CURRENCIES_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(ADD_CURRENCIES_BUTTON));
        return new AdminCurrenciesPage(driver);
    }

}
