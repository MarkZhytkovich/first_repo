package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static urls.WebUrls.LOGIN_URl;

public class LoginPage extends BasePage {
    private SelenideElement usernameInputField = $(By.id("user-name"));
    private SelenideElement passwordInputField = $(By.id("password"));
    private SelenideElement loginButton = $(By.id("login-button"));

    public void openPage() {
        open(LOGIN_URl);
    }

    public void inputUsername(String username) {
        usernameInputField
                .shouldBe(visible)
                .sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordInputField
                .shouldBe(visible)
                .sendKeys(password);
    }

    public void clickLogin() {
        loginButton
                .shouldBe(enabled)
                .click();
    }

    public boolean checkLoginButton() {
        return loginButton.isDisplayed();
    }
}
