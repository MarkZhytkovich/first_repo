package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    private SelenideElement firstNameInput = $(By.id("first-name"));
    private SelenideElement lastNameInput = $(By.id("last-name"));
    private SelenideElement zipCodeInput = $(By.id("postal-code"));
    private SelenideElement continueButton = $(By.id("continue"));
    private SelenideElement finishButton = $(By.id("finish"));
    private SelenideElement completeHeader = $(By.className("complete-header"));

    public void inputFirstName(String firstName) {
        firstNameInput
                .shouldBe(visible)
                .sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameInput
                .shouldBe(visible)
                .sendKeys(lastName);
    }

    public void inputZipCode(String zipCode) {
        zipCodeInput
                .shouldBe(visible)
                .sendKeys(zipCode);
    }

    public void clickContinue() {
        continueButton
                .shouldBe(enabled)
                .click();
    }

    public void clickFinish() {
        finishButton
                .shouldBe(enabled)
                .click();
    }

    public boolean checkCompleteHeader() {
        return completeHeader.isDisplayed();
    }
}
