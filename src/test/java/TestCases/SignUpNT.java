package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUp;
public class SignUpNT extends WebDriver {

    @Test
    public void testNegativeSignUp() {
        SignUp signUp = new SignUp(driver);
        signUp.enterEmail("existing_user@example.com");
        signUp.clickSignUpButton();
        Assert.assertTrue(signUp.isErrorMessageDisplayed());
    }
}