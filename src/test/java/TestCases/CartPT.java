package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCart;
public class CartPT extends WebDriver{

    @Test
    public void testPositiveAddToCart() {
        AddToCart cart = new AddToCart(driver);
        cart.clickAddToCartButton();
        Assert.assertTrue(cart.isSuccessMessageDisplayed());
    }
}