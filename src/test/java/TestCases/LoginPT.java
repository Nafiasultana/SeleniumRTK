package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;
public class LoginPT extends WebDriver {

    @Test
    public void testPositiveLogin() {
        Login login = new Login(driver);
        login.enterEmail("valid_email");
        login.enterPassword("valid_password");
        login.clickLoginButton();
        Assert.assertFalse(login.isErrorMessageDisplayed());
    }
}
