package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;
public class LoginNT extends WebDriver {

    @Test
    public void testNegativeLogin() {
        Login login = new Login(driver);
        login.enterEmail("invalid_email");
        login.enterPassword("invalid_password");
        login.clickLoginButton();
        Assert.assertTrue(login.isErrorMessageDisplayed());
    }
}
