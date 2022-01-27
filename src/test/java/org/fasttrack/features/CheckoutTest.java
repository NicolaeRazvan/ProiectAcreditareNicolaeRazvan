package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void doCheckout(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        loginSteps.completeLogin();
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        productPageSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.proceedToCheckout();
        checkoutSteps.putFirstName("Nicolae");
        checkoutSteps.putLastName("Razvan");
        checkoutSteps.putBillingAddress("Strada Covasna nr 10");
        checkoutSteps.putCity("Bucuresti");
        checkoutSteps.selectACounty("B");
        checkoutSteps.putPostcode("700000");
        checkoutSteps.putPhoneNumber("0764322105");
        checkoutSteps.clickOrder();
    }
}
