package selenide_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import steps.LoginPageSteps;

public class PriceHighToLowTest {

    @Test
    public void priceHighToLowTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickSelector("hilo");
        Assert.assertTrue(productsPage.checkHighestPrice());
    }
}