package selenide_test;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import steps.LoginPageSteps;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    @Test
    public void loginTest() {
        open("https://www.saucedemo.com/");
        $(By.id("user-name")).sendKeys("standard_user");
        $(By.id("password")).sendKeys("secret_sauce");
        $(By.id("login-button")).click();
        $(By.id("add-to-cart-sauce-labs-backpack")).click();
        $(By.xpath("//a[@class='shopping_cart_link']")).click();
        SelenideElement sauceBackpack = $(new ByText("Sauce Labs Backpack"));
        Assert.assertTrue(sauceBackpack.isDisplayed());
    }

    @Test
    public void loginTestRefactored() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddBackpack();
        productsPage.openCart();
        CartPage cartPage = new CartPage();
        Assert.assertTrue(cartPage.checkBackpack());
    }
}
