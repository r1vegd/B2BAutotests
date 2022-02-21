package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {ADMIN_LOGIN, ADMIN_PASSWORD},
                {VENDOR_LOGIN, VENDOR_PASSWORD},
                {CUSTOMER_LOGIN, CUSTOMER_PASSWORD},
        };
    }

//    @Test
//    public void positiveLogin() {
//        boolean isHomePageOpened = loginPage
//                .open()
//                .login("-", "-")
//                .isPageOpen();
//        assertTrue(isHomePageOpened, "Invalid login");
//    }

    @Test(dataProvider = "loginData")
    public void allTypesUsersAuth(String username, String password) {
        boolean isHomePageOpened = loginPage
                .open()
                .login(username, password)
                .isPageOpen();
        assertTrue(isHomePageOpened, "Invalid login");
    }

//    @Test
//        public void forgotPassword() {
//        loginPage.open();
//        loginPage.clickForgotPasswordLink();
//        Assert.assertEquals(loginPage.getForgotPasswordTitle(),"Forgot password?",
//                "'Forgot password' page hasn't opened");
//    }


}
