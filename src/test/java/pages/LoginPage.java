package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;

public class LoginPage extends BasePage {
    public String BASE_URL;
    public static final By SIDE_MENU_LOGO = By.xpath("//div[@class='fa-logo-white']");

    public static final By USERNAME_INPUT = By.xpath("//input[@name='login']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@name='password']");
    public static final By LOGIN_BUTTON = By.xpath("//button[@class='btn form-container__btn-login btn-primary']");

    public static final By FORGOT_PASS_LINK = By.xpath("//p[@class='forgotten-password']");
    public static final By FORGOT_PASS_TITLE = By.xpath("//span[@class='title']");

    public static final By CREATE_NEW_ACC_LINK = By.xpath("//span[@class='text_pseudo-link']");
    public static final By CREATE_NEW_ACC_TITLE = By.xpath("//div[@class='main-title d-flex align-items-center']//span");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SIDE_MENU_LOGO);
    }

    @Step("Open the site")
    public LoginPage open() {
        BASE_URL = System.getenv().getOrDefault("B2B_URL", PropertyReader.getProperty("b2b.url"));
        driver.get(BASE_URL);
        return this;
    }

    @Step("Login as user '{userName}' use password '{password}'")
    public LoginPage login(String userName, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_INPUT));
        wait.until(ExpectedConditions.elementToBeClickable(USERNAME_INPUT));
        driver.findElement(USERNAME_INPUT).click();
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        wait.until(ExpectedConditions.elementToBeClickable(PASSWORD_INPUT));
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON));
        driver.findElement(LOGIN_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIDE_MENU_LOGO));
        return new LoginPage(driver);
    }

    @Step("Go into password recovery page")
    public void clickForgotPasswordLink() {
        driver.findElement(FORGOT_PASS_LINK).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FORGOT_PASS_TITLE));
    }

    @Step("Go into password recovery page")
    public String getForgotPasswordTitle() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FORGOT_PASS_TITLE));
        return driver.findElement(FORGOT_PASS_TITLE).getText();
    }

    @Step("Go into create new account page")
    public void clickCreateNewAccountLink() {
        driver.findElement(CREATE_NEW_ACC_LINK).click();
    }

    @Step("Go into create new account page")
    public String getCreateNewAccountTitle() {
        return driver.findElement(CREATE_NEW_ACC_TITLE).getText();
    }

}