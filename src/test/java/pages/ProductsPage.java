package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProductsPage extends BasePage {

    private SelenideElement addToCartBackpack = $(By.id("add-to-cart-sauce-labs-backpack"));
    private SelenideElement cartButton = $(By.xpath("//a[@class='shopping_cart_link']"));
    private SelenideElement addToCartOnesie = $(By.id("add-to-cart-sauce-labs-onesie"));
    private SelenideElement burgerMenuButton = $(By.id("react-burger-menu-btn"));
    private SelenideElement logoutButton = $(By.id("logout_sidebar_link"));
    private SelenideElement selector = $(By.tagName("select"));
    private ElementsCollection pricesCollection = $$x("//div[@class='inventory_item_price']");
    private SelenideElement firstProduct = $(By.xpath("(//div[@class='inventory_item_name'])[1]"));
    private SelenideElement sauceJacket = $(By.xpath("//div[contains (text(), 'Sauce Labs Fleece Jacket')]"));
    private SelenideElement sauceOnesie = $(By.xpath("//div[contains (text(), 'Sauce Labs Onesie')]"));


    public void clickAddBackpack() {
        addToCartBackpack
                .shouldBe(enabled)
                .click();
    }

    public void clickAddOnesie() {
        addToCartOnesie
                .shouldBe(enabled)
                .click();
    }

    public void openCart() {
        cartButton
                .shouldBe(enabled)
                .click();
    }

    public void clickBurgerMenuButton() {
        burgerMenuButton
                .shouldBe(enabled)
                .click();
    }

    public void clickLogoutButton() {
        logoutButton
                .shouldBe(enabled)
                .click();
    }

    public void clickSelector(String value) {
        selector
                .shouldBe(enabled)
                .selectOptionByValue(value);
    }

    public void getAllPrices() {
        Selenide.$$x("//div[@class='inventory_item_price");
    }

    public boolean checkHighestPrice() {
        return sauceJacket.equals(firstProduct);
    }

    public boolean checkLowestPrice() {
        return sauceOnesie.equals(firstProduct);
    }

}
