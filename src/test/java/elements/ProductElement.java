package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProductElement {

    private String productXpath = "//div[@Class='inventory_item' and contains (., '%s')]";
    private String productLinkXpath = "//div[@Class='inventory_item' and contains (., '%s')]//a";
    private String addRemoveButtonXpath = "//div[@Class='inventory_item' and contains (., '%s')]//button";

    private String productIdentifier;
    private String addRemoveButtonIdentifier;
    private SelenideElement productLink;
    private SelenideElement addButton;
    private SelenideElement removeButton;

    public ProductElement(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    private void initElement() {
        String locator = String.format(productLinkXpath, productIdentifier);
        productLink = $x(locator).shouldBe(enabled);
        String addButtonLocator = String.format(addRemoveButtonXpath, addRemoveButtonIdentifier);
        addButton = $x(addButtonLocator).shouldBe(enabled);
        String removeButtonLocator = String.format(addRemoveButtonXpath, addRemoveButtonIdentifier);
        removeButton = $x(removeButtonLocator).shouldBe(enabled);
    }

    public void openProductDetails() {
        initElement();
        productLink.click();
    }

    public void addProductToCart() {
        initElement();
        if (addButton.isDisplayed()) {
            addButton.click();
        }
    }

    public void removeProductFromCart() {
        initElement();
       if (removeButton.isDisplayed()) {
           removeButton.click();
       }
    }
}
