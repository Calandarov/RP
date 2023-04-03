package pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.base.BaseTest;
import pages.login.LoginPage;
import pages.login.LoginPageData;

public class LoginPageTest extends BaseTest {
    @Test
    public void validLogin() throws InterruptedException {
        loginPage.openPage(LoginPageData.URL);
        Thread.sleep(2000);
        loginPage.inputLogin(LoginPageData.LOGIN);
        Thread.sleep(2000);
        loginPage.clickSignInBtn();
        Thread.sleep(2000);
        loginPage.inputPasswd(LoginPageData.PASS);
        loginPage.clickSignInBtn();
        Thread.sleep(2000);
        Assertions.assertTrue(loginPage.atPage());
        Assertions.assertEquals(LoginPageData.USER_NAME, loginPage.getUserName());
    }
}
