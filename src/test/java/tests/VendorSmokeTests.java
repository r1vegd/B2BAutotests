package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class VendorSmokeTests extends BaseTest {

    @Test
    public void catalogVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isCatalogVendorPageOpened = vendorCatalogPage
                .clickVendorCatalog()
                .isPageOpen();
        assertTrue(isCatalogVendorPageOpened, "'Catalog' page hasn't opened");
    }

    @Test
    public void activeStandsIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isActiveStandsVendorPageOpened = vendorActiveStandsPage
                .clickActiveStands()
                .isPageOpen();
        assertTrue(isActiveStandsVendorPageOpened, "'Active stands' page hasn't opened");
    }

    @Test
    public void archivedStandsIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isArchivedStandsVendorPageOpened = vendorArchivedStandsPage
                .clickArchivedStands()
                .isPageOpen();
        assertTrue(isArchivedStandsVendorPageOpened, "'Archive stands' page hasn't opened");
    }

    @Test
    public void privateStandsIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isPrivateStandsVendorPageOpened = vendorPrivateStandsPage
                .clickPrivateStands()
                .isPageOpen();
        assertTrue(isPrivateStandsVendorPageOpened, "'Private stands' page hasn't opened");
    }

    @Test
    public void pricesIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isPricesVendorPageOpened = vendorPricesPage
                .clickPrices()
                .isPageOpen();
        assertTrue(isPricesVendorPageOpened, "'Prices' page hasn't opened");
    }

    @Test
    public void discountsIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isDiscountsVendorPageOpened = vendorDiscountsPage
                .clickDiscounts()
                .isPageOpen();
        assertTrue(isDiscountsVendorPageOpened, "'Discounts' page hasn't opened");
    }

    @Test
    public void contactsVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isContactsVendorPageOpened = vendorContactsPage
                .clickContacts()
                .isPageOpen();
        assertTrue(isContactsVendorPageOpened, "'Contacts' page hasn't opened");
    }

    @Test
    public void eventsVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isEventsVendorPageOpened = vendorEventsPage
                .clickEvents()
                .isPageOpen();
        assertTrue(isEventsVendorPageOpened, "'Events' page hasn't opened");
    }

    @Test
    public void preordersVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isPreordersVendorPageOpened = vendorPreordersPage
                .clickPreorders()
                .isPageOpen();
        assertTrue(isPreordersVendorPageOpened, "'Preorders' page hasn't opened");
    }

    @Test
    public void orderVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isOrdersVendorPageOpened = vendorOrdersPage
                .clickOrders()
                .isPageOpen();
        assertTrue(isOrdersVendorPageOpened, "'Orders' page hasn't opened");
    }

    @Test
    public void bannersVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isBannersVendorPageOpened = vendorBannersPage
                .clickBanners()
                .isPageOpen();
        assertTrue(isBannersVendorPageOpened, "'Banners' page hasn't opened");
    }

    @Test
    public void lookbooksVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isLookbooksVendorPageOpened = vendorLookbooksPage
                .clickLookbooks()
                .isPageOpen();
        assertTrue(isLookbooksVendorPageOpened, "'Lookbooks' page hasn't opened");
    }

    @Test
    public void salesUnitsIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isSalesUnitsVendorPageOpened = vendorSalesUnitsPage
                .clickSalesUnits()
                .isPageOpen();
        assertTrue(isSalesUnitsVendorPageOpened, "'SalesUnits' page hasn't opened");
    }

    @Test
    public void organizationVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isOrganizationVendorPageOpened = vendorOrganizationPage
                .clickOrganization()
                .isPageOpen();
        assertTrue(isOrganizationVendorPageOpened, "'Organization' page hasn't opened");
    }

    @Test
    public void rolesVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isRolesVendorPageOpened = vendorRolesPage
                .clickRoles()
                .isPageOpen();
        assertTrue(isRolesVendorPageOpened, "'Roles' page hasn't opened");
    }

    @Test
    public void conditionSettingsVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isConditionSettingsVendorPageOpened = vendorConditionSettingsPage
                .clickConditionSettings()
                .isPageOpen();
        assertTrue(isConditionSettingsVendorPageOpened, "'Condition Settings' page hasn't opened");
    }

    @Test
    public void commercialTermsVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isCommercialTermsVendorPageOpened = vendorCommercialTermsPage
                .clickCommercialTerms()
                .isPageOpen();
        assertTrue(isCommercialTermsVendorPageOpened, "'Commercial Terms' page hasn't opened");
    }

    @Test
    public void helpCenterVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isHelpCenterVendorPageOpened = vendorHelpCenterPage
                .clickHelpCenter()
                .isPageOpen();
        assertTrue(isHelpCenterVendorPageOpened, "'HelpCenter' page hasn't opened");
    }

    @Test
    public void warehousesVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isWarehousesVendorPageOpened = vendorWarehousePage
                .clickWarehouses()
                .isPageOpen();
        assertTrue(isWarehousesVendorPageOpened, "'Warehouses' page hasn't opened");
    }

    @Test
    public void surveyVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isSurveyVendorPageOpened = vendorSurveyPage
                .clickSurvey()
                .isPageOpen();
        assertTrue(isSurveyVendorPageOpened, "'Survey' page hasn't opened");
    }

    @Test
    public void managingSurveyVendorIsOpen() {
        loginPage
                .open()
                .login(VENDOR_LOGIN, VENDOR_PASSWORD);
        boolean isManagingSurveyVendorPageOpened = vendorManagingSurveysPage
                .clickManagingSurvey()
                .isPageOpen();
        assertTrue(isManagingSurveyVendorPageOpened, "'Managing Survey' page hasn't opened");
    }


}
