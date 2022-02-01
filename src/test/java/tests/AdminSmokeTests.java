package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;


import static org.testng.Assert.assertTrue;

public class AdminSmokeTests extends BaseTest {

    @Test
    public void applicationsAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isApplicationsAdminPageOpened = adminApplicationsPage
                .clickApplicationsRegistration()
                .isPageOpen();
        assertTrue(isApplicationsAdminPageOpened, "'Applications' page hasn't opened");
    }

    @Test
    public void privateZonesAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isPrivateZonesAdminPageOpened = adminPrivateZonesPage
                .clickPrivateZones()
                .isPageOpen();
        assertTrue(isPrivateZonesAdminPageOpened, "'Private zones' page hasn't opened");
    }

    @Test
    public void catalogAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isCatalogAdminPageOpened = adminCatalogPage
                .clickCatalog()
                .isPageOpen();
        assertTrue(isCatalogAdminPageOpened, "'Catalog' page hasn't opened");
    }

    @Test
    public void organizationsAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isOrganizationsAdminPageOpened = adminOrganizationsPage
                .clickOrganizations()
                .isPageOpen();
        assertTrue(isOrganizationsAdminPageOpened, "'Organizations' page hasn't opened");
    }

    @Test
    public void eventsAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isEventsAdminPageOpened = adminEventsPage
                .clickEvents()
                .isPageOpen();
        assertTrue(isEventsAdminPageOpened, "'Events' page hasn't opened");
    }

    @Test
    public void brandsAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isBrandsAdminPageOpened = adminBrandsPage
                .clickBrands()
                .isPageOpen();
        assertTrue(isBrandsAdminPageOpened, "'Brands' page hasn't opened");
    }

    @Test
    public void sizeDesignationsAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isSizeDesignationsAdminPageOpened = adminSizeDesignationsPage
                .clickSizeDesignations()
                .isPageOpen();
        assertTrue(isSizeDesignationsAdminPageOpened, "'Size Designations' page hasn't opened");
    }

    @Test
    public void currenciesAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isCurrenciesAdminPageOpened = adminCurrenciesPage
                .clickCurrencies()
                .isPageOpen();
        assertTrue(isCurrenciesAdminPageOpened, "'Currencies' page hasn't opened");
    }

    @Test
    public void classifierManagementAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isClassifierManagementAdminPageOpened = adminClassifierManagementPage
                .clickClassifierManagement()
                .isPageOpen();
        assertTrue(isClassifierManagementAdminPageOpened, "'Classifier Management' page hasn't opened");
    }

    @Test
    public void countriesAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isCountriesAdminPageOpened = adminCountriesPage
                .clickCountries()
                .isPageOpen();
        assertTrue(isCountriesAdminPageOpened, "'Countries' page hasn't opened");
    }

    @Test
    public void categoriesAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isCategoriesAdminPageOpened = adminCategoriesPage
                .clickCategories()
                .isPageOpen();
        assertTrue(isCategoriesAdminPageOpened, "'Categories' page hasn't opened");
    }

    @Test
    public void characteristicsAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isCharacteristicsAdminPageOpened = adminCharacteristicsPage
                .clickCharacteristics()
                .isPageOpen();
        assertTrue(isCharacteristicsAdminPageOpened, "'Characteristics' page hasn't opened");
    }

    @Test
    public void attributesAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isAttributesAdminPageOpened = adminAttributesPage
                .clickAttributes()
                .isPageOpen();
        assertTrue(isAttributesAdminPageOpened, "'Attributes' page hasn't opened");
    }

    @Test
    public void measurementUnitsAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isMeasurementsUnitsAdminPageOpened = adminMeasurementUnitsPage
                .clickMeasurementUnits()
                .isPageOpen();
        assertTrue(isMeasurementsUnitsAdminPageOpened, "'Measurement Units' page hasn't opened");
    }

    @Test
    public void relationsIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isRelationsAdminPageOpened = adminRelationsPage
                .clickRelations()
                .isPageOpen();
        assertTrue(isRelationsAdminPageOpened, "'Relations' page hasn't opened");
    }

    @Test
    public void industriesIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isIndustriesAdminPageOpened = adminIndustriesPage
                .clickIndustries()
                .isPageOpen();
        assertTrue(isIndustriesAdminPageOpened, "'Industries' page hasn't opened");
    }

    @Test
    public void usersIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isUsersAdminPageOpened = adminUsersPage
                .clickUsers()
                .isPageOpen();
        assertTrue(isUsersAdminPageOpened, "'Users' page hasn't opened");
    }

    @Test
    public void rolesIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isRolesAdminPageOpened = adminRolesPage
                .clickRoles()
                .isPageOpen();
        assertTrue(isRolesAdminPageOpened, "'Roles' page hasn't opened");
    }

    @Test
    public void packagesIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isPackagesAdminPageOpened = adminPackagesPage
                .clickPackages()
                .isPageOpen();
        assertTrue(isPackagesAdminPageOpened, "'Packages' page hasn't opened");
    }

    @Test
    public void permissionsIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isPermissionsAdminPageOpened = adminPermissionsPage
                .clickPermissions()
                .isPageOpen();
        assertTrue(isPermissionsAdminPageOpened, "'Permissions' page hasn't opened");
    }

    @Test
    public void interfacesIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isInterfacesAdminPageOpened = adminInterfacesPage
                .clickInterfaces()
                .isPageOpen();
        assertTrue(isInterfacesAdminPageOpened, "'Interfaces' page hasn't opened");
    }

    @Test
    public void templatesIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isTemplatesAdminPageOpened = adminTemplatesPage
                .clickTemplates()
                .isPageOpen();
        assertTrue(isTemplatesAdminPageOpened, "'Templates' page hasn't opened");
    }

    @Test
    public void classifierIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isClassifierAdminPageOpened = adminClassifiersPage
                .clickClassifier()
                .isPageOpen();
        assertTrue(isClassifierAdminPageOpened, "'Classifier' page hasn't opened");
    }

    @Test
    public void emailsIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isEmailsAdminPageOpened = adminEmailsPage
                .clickEmails()
                .isPageOpen();
        assertTrue(isEmailsAdminPageOpened, "'Emails' page hasn't opened");
    }

    @Test
    public void languagesIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isLanguagesAdminPageOpened = adminLanguagesPage
                .clickLanguages()
                .isPageOpen();
        assertTrue(isLanguagesAdminPageOpened, "'Languages' page hasn't opened");
    }


    @Test
    public void helpCenterAdminIsOpen() {
        loginPage
                .open()
                .login(ADMIN_LOGIN, ADMIN_PASSWORD);
        boolean isHelpCenterAdminPageOpened = adminHelpCenterPage
                .clickHelpCenter()
                .isPageOpen();
        assertTrue(isHelpCenterAdminPageOpened, "'Help Center' page hasn't opened");
    }


}
