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
    By productName = By.cssSelector("div[class=\"inventory_item_name\"]");
    By findCart = By.cssSelector("button[data-test]");
}
