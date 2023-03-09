package selenide_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j2;
import models.SwagLabsLoginModel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import prepare_data.PrepareLoginData;
import steps.LoginPageSteps;

@Log4j2
public class LoginTest extends BaseTest {
    @Test
    @Description("Log into swag labs account")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTest() {
        log.info("Log into account");
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(System.getProperty("username"), System.getProperty("password"));
        ProductsPage productsPage = new ProductsPage();
        Assert.assertTrue(productsPage.checkPageTitle());
    }

    @Test(dataProvider = "InvalidLoginData")
    @Description("Log into swag labs account using invalid credentials")
    @Severity(SeverityLevel.NORMAL)
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
