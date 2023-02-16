package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage {
    private SelenideElement sauceBackpack = $(new ByText("Sauce Labs Backpack"));
    private SelenideElement checkoutButton = $(By.id("checkout"));
    private SelenideElement removeBackpackButton = $(By.id("remove-sauce-labs-backpack"));

    public boolean checkBackpack() {
        return sauceBackpack.isDisplayed();
    }

    public void clickCheckout() {
        checkoutButton
                .shouldBe(enabled)
                .click();
    }

    public void removeBackpack() {
        removeBackpackButton
                .shouldBe(enabled)
                .click();
    }
}
