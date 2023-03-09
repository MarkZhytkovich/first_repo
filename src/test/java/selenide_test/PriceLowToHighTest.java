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
public class PriceLowToHighTest extends BaseTest {

    @Test
    @Description("Sort products from low to high")
    @Severity(SeverityLevel.MINOR)
    public void priceLowToHighTest() {
        log.info("Log into account");
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.info("Click to sort prices from low to high");
        productsPage.clickSelector("lohi");
        Assert.assertTrue(productsPage.checkLowestPrice());
    }
}
