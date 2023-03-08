package selenide_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import steps.LoginPageSteps;
@Log4j2
public class PriceHighToLowTest extends BaseTest {

    @Test
    @Description("Sort products from high to low")
    @Severity(SeverityLevel.MINOR)
    public void priceHighToLowTest() {
        log.info("Log into account");
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.info("Click to sort prices from high to low");
        productsPage.clickSelector("hilo");
        Assert.assertTrue(productsPage.checkHighestPrice());
    }
}