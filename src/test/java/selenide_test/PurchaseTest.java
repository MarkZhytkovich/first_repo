package selenide_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductsPage;
import steps.CheckoutPageSteps;
import steps.LoginPageSteps;

@Log4j2
public class PurchaseTest extends BaseTest {
    @Test
    @Description("Buying a product from a catalog")
    @Severity(SeverityLevel.CRITICAL)
    public void purchaseTest() {
        log.info("Log into account");
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.info("Add product to cart");
        productsPage.clickAddOnesie();
        log.info("Open product cart");
        productsPage.openCart();
        CartPage cartPage = new CartPage();
        log.info("Start checkout");
        cartPage.clickCheckout();
        CheckoutPageSteps checkoutPageSteps = new CheckoutPageSteps();
        log.info("Send personal information");
        checkoutPageSteps.checkout("walter", "white", "220025");
        CheckoutPage checkoutPage = new CheckoutPage();
        log.info("Click finish");
        checkoutPage.clickFinish();
        Assert.assertTrue(checkoutPage.checkCompleteHeader(), String.format("Checkout header isn't displayed"));
    }
}
