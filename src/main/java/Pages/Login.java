package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Login {
    private WebDriver driver;

    // Locators
    private By emailField = By.id("login-email");
    private By passwordField = By.id("login-password");
    private By loginButton = By.id("login-submit");
    private By errorMessage = By.xpath("//div[@class='error-message']");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}
