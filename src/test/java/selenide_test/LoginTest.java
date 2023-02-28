package selenide_test;

import models.SwagLabsLoginModel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import prepare_data.PrepareLoginData;
import steps.LoginPageSteps;

public class LoginTest {
    @Test
    public void loginTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(System.getProperty("username"), System.getProperty("password"));
        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.checkPageTitle());
    }

    @Test(dataProvider = "InvalidLoginData")
    public void loginValidationTest(SwagLabsLoginModel swagLabsLoginModel) {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(swagLabsLoginModel.getUsername(), swagLabsLoginModel.getPassword());
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.checkErrorMessage());
    }

    @DataProvider(name ="InvalidLoginData")
    public Object[][] input(){
        return new Object[][]{
                {PrepareLoginData.getUserWithEmptyInputs()},
                {PrepareLoginData.getUserWithoutPassword()},
                {PrepareLoginData.getUserWithoutUsername()},
                {PrepareLoginData.getUserWithInvalidCredentials()}
        };
    }
}
