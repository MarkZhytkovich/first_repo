package selenide_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;
import steps.LoginPageSteps;
@Log4j2
public class RemoveBackpackTest extends BaseTest {

    @Test
    @Description("Removing backpack from cart")
    @Severity(SeverityLevel.NORMAL)
    public void removeBackpackTest() {
        log.info("Log into account");
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.info("Add backpack to cart");
        productsPage.clickAddBackpack();
        log.info("Click to open cart");
        productsPage.openCart();
        CartPage cartPage = new CartPage();
        log.info("Remove backpack from cart");
        cartPage.removeBackpack();
        Assert.assertFalse(cartPage.checkBackpack(), String.format("Backpack is in the cart"));
    }
}
