package selenide_test;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import steps.LoginPageSteps;

@Log4j2
public class LogoutTest extends BaseTest {

    @Test
    @Description("Log out from swag labs account")
    @Severity(SeverityLevel.NORMAL)
    public void logoutTest() {
        log.info("Log into account");
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.info("Open side menu");
        productsPage.clickBurgerMenuButton();
        log.info("Click logout button");
        productsPage.clickLogoutButton();
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.checkLoginButton(), String.format("Login button isn't displayed"));
    }
}

