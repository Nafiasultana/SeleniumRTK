package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignUp {
    private WebDriver driver;

    // Locators
    private By emailField = By.id("register-email");
    private By signUpButton = By.id("register-submit");
    private By errorMessage = By.xpath("//div[@class='error-message']");

    public SignUp(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}
