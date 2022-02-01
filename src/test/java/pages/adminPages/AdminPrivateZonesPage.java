package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminPrivateZonesPage extends BasePage {
    public static final By PRIVATE_ZONES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[2]");
    public static final By CREATE_ZONE_BUTTON = By.xpath("//div[@class='icon-tool_text fa fa-add']");

    public AdminPrivateZonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CREATE_ZONE_BUTTON);
    }

    public AdminPrivateZonesPage clickPrivateZones() {
        driver.findElement(PRIVATE_ZONES_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminPrivateZonesPage(driver);
    }

}
