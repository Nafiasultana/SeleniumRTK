package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddToCart {
    private WebDriver driver;

    // Locators
    private By addToCartButton = By.xpath("//button[contains(text(),'Add to Cart')]");
    private By successMessage = By.xpath("//div[@class='success-message']");

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
