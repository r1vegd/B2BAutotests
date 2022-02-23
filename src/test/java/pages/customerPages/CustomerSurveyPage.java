package pages.customerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class CustomerSurveyPage extends BasePage {
    public static final By SURVEYS_CUSTOMER_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By SURVEYS_BREADCRUMBS = By.xpath("//li[@class='current-breadcrumb']/span");

    public CustomerSurveyPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SURVEYS_BREADCRUMBS);
    }

    public CustomerSurveyPage clickSurveys() {
        driver.findElement(SURVEYS_CUSTOMER_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SURVEYS_BREADCRUMBS));
        return new CustomerSurveyPage(driver);
    }

}
