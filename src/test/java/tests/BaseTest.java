package tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.LoginPage;
import pages.adminPages.*;
import pages.customerPages.*;
import pages.vendorPages.*;
import utils.PropertyReader;
import utils.TestListener;


import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {

    WebDriver driver;
    protected LoginPage loginPage;
    protected VendorCatalogPage vendorCatalogPage;
    protected VendorActiveStandsPage vendorActiveStandsPage;
    protected VendorArchivedStandsPage vendorArchivedStandsPage;
    protected VendorPrivateStandsPage vendorPrivateStandsPage;
    protected VendorPricesPage vendorPricesPage;
    protected VendorDiscountsPage vendorDiscountsPage;
    protected VendorContactsPage vendorContactsPage;
    protected VendorEventsPage vendorEventsPage;
    protected VendorPreordersPage vendorPreordersPage;
    protected VendorOrdersPage vendorOrdersPage;
    protected VendorBannersPage vendorBannersPage;
    protected VendorLookbooksPage vendorLookbooksPage;
    protected VendorSalesUnitsPage vendorSalesUnitsPage;
    protected VendorOrganizationPage vendorOrganizationPage;
    protected VendorRolesPage vendorRolesPage;
    protected VendorConditionSettingsPage vendorConditionSettingsPage;
    protected VendorCommercialTermsPage vendorCommercialTermsPage;
    protected VendorHelpCenterPage vendorHelpCenterPage;
    protected VendorWarehousePage vendorWarehousePage;
    protected VendorSurveyPage vendorSurveyPage;
    protected VendorManagingSurveysPage vendorManagingSurveysPage;

    protected CustomerMainPage customerMainPage;
    protected CustomerCatalogPage customerCatalogPage;
    protected CustomerStandsPage customerStandsPage;
    protected CustomerBrandsPage customerBrandsPage;
    protected CustomerContactsPage customerContactsPage;
    protected CustomerEventsPage customerEventsPage;
    protected CustomerSelectionsPage customerSelectionsPage;
    protected CustomerPreordersPage customerPreordersPage;
    protected CustomerOrdersPage customerOrdersPage;
    protected CustomerOrganizationPage customerOrganizationPage;
    protected CustomerRolesPage customerRolesPage;
    protected CustomerHelpCenterPage customerHelpCenterPage;
    protected CustomerSurveyPage customerSurveyPage;

    protected AdminApplicationsPage adminApplicationsPage;
    protected AdminPrivateZonesPage adminPrivateZonesPage;
    protected AdminCatalogPage adminCatalogPage;
    protected AdminOrganizationsPage adminOrganizationsPage;
    protected AdminEventsPage adminEventsPage;
    protected AdminBrandsPage adminBrandsPage;
    protected AdminSizeDesignationsPage adminSizeDesignationsPage;
    protected AdminCurrenciesPage adminCurrenciesPage;
    protected AdminClassifierManagementPage adminClassifierManagementPage;
    protected AdminCountriesPage adminCountriesPage;
    protected AdminCategoriesPage adminCategoriesPage;
    protected AdminCharacteristicsPage adminCharacteristicsPage;
    protected AdminAttributesPage adminAttributesPage;
    protected AdminMeasurementUnitsPage adminMeasurementUnitsPage;
    protected AdminRelationsPage adminRelationsPage;
    protected AdminIndustriesPage adminIndustriesPage;
    protected AdminUsersPage adminUsersPage;
    protected AdminRolesPage adminRolesPage;
    protected AdminPackagesPage adminPackagesPage;
    protected AdminPermissionsPage adminPermissionsPage;
    protected AdminInterfacesPage adminInterfacesPage;
    protected AdminTemplatesPage adminTemplatesPage;
    protected AdminClassifiersPage adminClassifiersPage;
    protected AdminEmailsPage adminEmailsPage;
    protected AdminLanguagesPage adminLanguagesPage;
    protected AdminHelpCenterPage adminHelpCenterPage;

    public String VENDOR_LOGIN;
    public String VENDOR_PASSWORD;

    public String CUSTOMER_LOGIN;
    public String CUSTOMER_PASSWORD;

    public String ADMIN_LOGIN;
    public String ADMIN_PASSWORD;


    @BeforeMethod
    public void setUp(ITestContext testContext) {
        ADMIN_LOGIN = System.getenv().getOrDefault("ADMIN_LOGIN", PropertyReader.getProperty("admin.login"));
        ADMIN_PASSWORD = System.getenv().getOrDefault("ADMIN_PASSWORD", PropertyReader.getProperty("admin.password"));

        VENDOR_LOGIN = System.getenv().getOrDefault("VENDOR_LOGIN", PropertyReader.getProperty("vendor.login"));
        VENDOR_PASSWORD = System.getenv().getOrDefault("VENDOR_PASSWORD", PropertyReader.getProperty("vendor.password"));

        CUSTOMER_LOGIN = System.getenv().getOrDefault("CUSTOMER_LOGIN", PropertyReader.getProperty("customer.login"));
        CUSTOMER_PASSWORD = System.getenv().getOrDefault("CUSTOMER_PASSWORD", PropertyReader.getProperty("customer.password"));

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        vendorCatalogPage = new VendorCatalogPage(driver);
        vendorActiveStandsPage = new VendorActiveStandsPage(driver);
        vendorArchivedStandsPage = new VendorArchivedStandsPage(driver);
        vendorPrivateStandsPage = new VendorPrivateStandsPage(driver);
        vendorPricesPage = new VendorPricesPage(driver);
        vendorDiscountsPage = new VendorDiscountsPage(driver);
        vendorContactsPage = new VendorContactsPage(driver);
        vendorEventsPage = new VendorEventsPage(driver);
        vendorPreordersPage = new VendorPreordersPage(driver);
        vendorOrdersPage = new VendorOrdersPage(driver);
        vendorBannersPage = new VendorBannersPage(driver);
        vendorLookbooksPage = new VendorLookbooksPage(driver);
        vendorSalesUnitsPage = new VendorSalesUnitsPage(driver);
        vendorOrganizationPage = new VendorOrganizationPage(driver);
        vendorRolesPage = new VendorRolesPage(driver);
        vendorConditionSettingsPage = new VendorConditionSettingsPage(driver);
        vendorCommercialTermsPage = new VendorCommercialTermsPage(driver);
        vendorHelpCenterPage = new VendorHelpCenterPage(driver);
        vendorWarehousePage = new VendorWarehousePage(driver);
        vendorSurveyPage = new VendorSurveyPage(driver);
        vendorManagingSurveysPage = new VendorManagingSurveysPage(driver);

        customerMainPage = new CustomerMainPage(driver);
        customerCatalogPage = new CustomerCatalogPage(driver);
        customerStandsPage = new CustomerStandsPage(driver);
        customerBrandsPage = new CustomerBrandsPage(driver);
        customerContactsPage = new CustomerContactsPage(driver);
        customerEventsPage = new CustomerEventsPage(driver);
        customerSelectionsPage = new CustomerSelectionsPage(driver);
        customerPreordersPage = new CustomerPreordersPage(driver);
        customerOrdersPage = new CustomerOrdersPage(driver);
        customerOrganizationPage = new CustomerOrganizationPage(driver);
        customerRolesPage = new CustomerRolesPage(driver);
        customerHelpCenterPage = new CustomerHelpCenterPage(driver);
        customerSurveyPage = new CustomerSurveyPage(driver);

        adminApplicationsPage = new AdminApplicationsPage(driver);
        adminPrivateZonesPage = new AdminPrivateZonesPage(driver);
        adminCatalogPage = new AdminCatalogPage(driver);
        adminOrganizationsPage = new AdminOrganizationsPage(driver);
        adminEventsPage = new AdminEventsPage(driver);
        adminBrandsPage = new AdminBrandsPage(driver);
        adminSizeDesignationsPage = new AdminSizeDesignationsPage(driver);
        adminCurrenciesPage = new AdminCurrenciesPage(driver);
        adminClassifierManagementPage = new AdminClassifierManagementPage(driver);
        adminCountriesPage = new AdminCountriesPage(driver);
        adminCategoriesPage = new AdminCategoriesPage(driver);
        adminCharacteristicsPage = new AdminCharacteristicsPage(driver);
        adminAttributesPage = new AdminAttributesPage(driver);
        adminMeasurementUnitsPage = new AdminMeasurementUnitsPage(driver);
        adminRelationsPage = new AdminRelationsPage(driver);
        adminIndustriesPage = new AdminIndustriesPage(driver);
        adminUsersPage = new AdminUsersPage(driver);
        adminRolesPage = new AdminRolesPage(driver);
        adminPackagesPage = new AdminPackagesPage(driver);
        adminPermissionsPage = new AdminPermissionsPage(driver);
        adminInterfacesPage = new AdminInterfacesPage(driver);
        adminTemplatesPage = new AdminTemplatesPage(driver);
        adminClassifiersPage = new AdminClassifiersPage(driver);
        adminEmailsPage = new AdminEmailsPage(driver);
        adminLanguagesPage = new AdminLanguagesPage(driver);
        adminHelpCenterPage = new AdminHelpCenterPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}