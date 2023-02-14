package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProductElement {

    private String productXpath = "//div[@class='inventory_item_name' and contains (text(), '%s')]";
    private String addToCartXpath = "//button[@id='add-to-cart-%s']";
    private String removeXpath = "//button[@id='remove-%s']";

    private String productName;
    private String addToCartButtonId;
    private String removeButtonId;
    private SelenideElement product;
    private SelenideElement addButton;
    private SelenideElement removeButton;


    public ProductElement(String productName, String addToCartButtonId, String removeButtonId) {
        this.productName = productName;
        this.addToCartButtonId = addToCartButtonId;
        this.removeButtonId = removeButtonId;
    }

    private void initElement() {
        String locator = String.format(productXpath, productName);
        product = $x(locator).shouldBe(enabled);
    }

    private void initAddToCart() {
        String locator = String.format(addToCartXpath, addToCartButtonId);
        addButton = $x(locator)
                .shouldBe(visible)
                .shouldBe(enabled);
    }

    private void initRemove() {
        String locator = String.format(removeXpath, removeButtonId);
        removeButton = $x(locator)
                .shouldBe(visible)
                .shouldBe(enabled);
    }


    public void openProductDetails() {
        initElement();
        product.click();
    }

    public void addProductToCart() {
        initAddToCart();
        addButton.isEnabled();
        addButton.click();
    }

    public void removeProductFromCart() {
        initRemove();
        removeButton.isEnabled();
        removeButton.click();
    }



}
