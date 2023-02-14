package steps;

import pages.LoginPage;

public class LoginPageSteps {
    private LoginPage loginPage = new LoginPage();

    public void login(String username, String password) {
        loginPage.openPage();
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickLogin();
    }
}
