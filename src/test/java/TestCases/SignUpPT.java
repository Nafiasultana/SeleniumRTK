package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUp;
public class SignUpPT extends WebDriver {

    @Test
    public void testPositiveSignUp() {
        SignUp signUp = new SignUp(driver);
        signUp.enterEmail("new_user@example.com");
        signUp.clickSignUpButton();
        Assert.assertTrue(signUp.isSuccessMessageDisplayed());
    }
}