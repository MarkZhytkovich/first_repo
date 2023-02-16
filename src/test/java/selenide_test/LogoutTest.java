package selenide_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import steps.LoginPageSteps;

public class LogoutTest {

    @Test
    public void logoutTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickBurgerMenuButton();
        productsPage.clickLogoutButton();
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.checkLoginButton(), String.format("Login button isn't displayed"));
    }
}
