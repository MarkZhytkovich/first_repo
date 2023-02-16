package steps;

import pages.CheckoutPage;

public class CheckoutPageSteps {
    CheckoutPage checkoutPage = new CheckoutPage();

    public void checkout(String firstName, String lastName, String zipCode) {
        checkoutPage.inputFirstName(firstName);
        checkoutPage.inputLastName(lastName);
        checkoutPage.inputZipCode(zipCode);
        checkoutPage.clickContinue();
    }
}
