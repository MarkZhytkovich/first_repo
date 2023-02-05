package Locators;


import org.openqa.selenium.By;

public class Locators {
    By twitterLink = By.linkText("Twitter");
    By facebookPartialLink = By.partialLinkText("Face");
    By divTag = By.tagName("select");
    By products = By.className("title");
    By checkout = By.name("checkout");
    By cart = By.id("add-to-cart");
    By allElements = By.cssSelector("*");
    By addToCart =  By.cssSelector("#add-to-cart");
    By buttons = By.cssSelector("#header_container button");
    By productName = By.cssSelector("div[class='inventory_item_name']");
    By findCart = By.cssSelector("button[data-test]");

    By twitterLinkXpath = By.xpath("//a[@href='https://twitter.com/saucelabs']");
    By facebookXpath = By.xpath("//a[contains(text(), 'Face')]");
    By select = By.xpath("//select");
    By checkoutXpath = By.xpath("//button[@name='checkout']");
    By cartId = By.xpath("//button[contains(@id, 'add-to-cart')]");
    By allXpath = By.xpath("//*");
    By secondElement = By.xpath("(//button[text()='Add to cart'])[2]");
    By operatorOr = By.xpath("//div[contains(@class, 'inventory_item_label') or contains(@class, 'inventory_item_img')]");
    By operatorAnd = By.xpath("//button[contains (@class, 'btn_primary') and contains (@name, 'add-to-cart-sauce-labs-onesie')]");
    By followingSibling = By.xpath("//div[@class='inventory_item_price']/following-sibling::button");
    By precedingSibling = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']/preceding-sibling::div");
}
