package selenide_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;
import steps.LoginPageSteps;

public class RemoveBackpackTest {

    @Test
    public void removeBackpackTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddBackpack();
        productsPage.openCart();
        CartPage cartPage = new CartPage();
        cartPage.removeBackpack();
        Assert.assertFalse(cartPage.checkBackpack(), String.format("Backpack is in the cart"));
    }
}
