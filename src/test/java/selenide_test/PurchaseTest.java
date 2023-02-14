package selenide_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductsPage;
import steps.CheckoutPageSteps;
import steps.LoginPageSteps;

public class PurchaseTest {

    @Test
    public void purchaseTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddOnesie();
        productsPage.openCart();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckout();
        CheckoutPageSteps checkoutPageSteps = new CheckoutPageSteps();
        checkoutPageSteps.checkout("walter", "white", "220025");
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickFinish();
        Assert.assertTrue(checkoutPage.checkCompleteHeader(), String.format("Checkout header isn't displayed"));
    }
}
