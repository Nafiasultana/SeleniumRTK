package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCart;
public class CartNT extends WebDriver {
    @Test
    public void testNegativeAddToCart() {
        AddToCart cart = new AddToCart(driver);
        Assert.assertFalse(cart.isSuccessMessageDisplayed());
    }
}