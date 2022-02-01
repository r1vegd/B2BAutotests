package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CustomerMainPage extends BasePage {
    public static final By MAIN_PAGE_IMAGE = By.xpath("//img[@title and @alt]");

    public CustomerMainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MAIN_PAGE_IMAGE);
    }
}
