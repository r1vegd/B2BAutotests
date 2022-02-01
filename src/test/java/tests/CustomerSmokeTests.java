package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class CustomerSmokeTests extends BaseTest {

    @Test
    public void mainPageCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isMainPageCustomerPageOpened = customerMainPage
                .isPageOpen();
        assertTrue(isMainPageCustomerPageOpened, "'Main Page' page hasn't opened");
    }

    @Test
    public void catalogCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isCatalogCustomerPageOpened = customerCatalogPage
                .clickCatalog()
                .isPageOpen();
        assertTrue(isCatalogCustomerPageOpened, "'Catalog' page hasn't opened");
    }

    @Test
    public void standsCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isStandsCustomerPageOpened = customerStandsPage
                .clickStands()
                .isPageOpen();
        assertTrue(isStandsCustomerPageOpened, "'Stands' page hasn't opened");
    }

    @Test
    public void brandsCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isBrandsCustomerPageOpened = customerBrandsPage
                .clickBrands()
                .isPageOpen();
        assertTrue(isBrandsCustomerPageOpened, "'Brands' page hasn't opened");
    }

    @Test
    public void contactsCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isContactsCustomerPageOpened = customerContactsPage
                .clickContacts()
                .isPageOpen();
        assertTrue(isContactsCustomerPageOpened, "'Contacts' page hasn't opened");
    }

    @Test
    public void eventsCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isEventsCustomerPageOpened = customerEventsPage
                .clickEvents()
                .isPageOpen();
        assertTrue(isEventsCustomerPageOpened, "'Events' page hasn't opened");
    }

    @Test
    public void selectionsCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isSelectionsCustomerPageOpened = customerSelectionsPage
                .clickSelections()
                .isPageOpen();
        assertTrue(isSelectionsCustomerPageOpened, "'Selections' page hasn't opened");
    }

    @Test
    public void preordersCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isPreordersCustomerPageOpened = customerPreordersPage
                .clickPreorders()
                .isPageOpen();
        assertTrue(isPreordersCustomerPageOpened, "'Preorders' page hasn't opened");
    }

    @Test
    public void ordersCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isOrdersCustomerPageOpened = customerOrdersPage
                .clickOrders()
                .isPageOpen();
        assertTrue(isOrdersCustomerPageOpened, "'Orders' page hasn't opened");
    }

    @Test
    public void organizationCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isOrganizationCustomerPageOpened = customerOrganizationPage
                .clickOrganization()
                .isPageOpen();
        assertTrue(isOrganizationCustomerPageOpened, "'Organization' page hasn't opened");
    }

    @Test
    public void rolesCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isRolesCustomerPageOpened = customerRolesPage
                .clickRoles()
                .isPageOpen();
        assertTrue(isRolesCustomerPageOpened, "'Roles' page hasn't opened");
    }

    @Test
    public void helpCenterCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isHelpCenterCustomerPageOpened = customerHelpCenterPage
                .clickHelpCenter()
                .isPageOpen();
        assertTrue(isHelpCenterCustomerPageOpened, "'Help Center' page hasn't opened");
    }

    @Test
    public void surveysCustomerIsOpen() {
        loginPage
                .open()
                .login(CUSTOMER_LOGIN, CUSTOMER_PASSWORD);
        boolean isSurveysCustomerPageOpened = customerSurveyPage
                .clickSurveys()
                .isPageOpen();
        assertTrue(isSurveysCustomerPageOpened, "'Surveys' page hasn't opened");
    }


}
