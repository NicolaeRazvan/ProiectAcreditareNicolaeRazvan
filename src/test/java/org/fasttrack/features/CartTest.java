package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void addAProductToCart(){
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        productPageSteps.addToCart();
    }

    @Test
    public void RemoveAnItemFromCart(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        loginSteps.completeLogin();
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        productPageSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.removeItemFromCart();
    }

    @Test
    public void cartSummaryTest(){
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        productPageSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.getTotal();
        cartSteps.checkGrandTotalPriceIsCorrect();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
    }

    @Test
    public void addCertainQuantityToCart(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        productPageSteps.changeQuantityOfProduct("4");
        productPageSteps.addToCart();
        cartSteps.navigateToCartPage();
    }

    @Test
    public void changeProductQuantityFromCart(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        productPageSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.changeQuantityFromCart("6");
        cartSteps.updateCart();
    }

    @Test
    public void undoCartDelete(){
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        productPageSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.getTotal();
        cartSteps.removeItemFromCart();
        cartSteps.clickUndoButton();
        cartSteps.getTotal();//functioneaza ca un mini assert deoarece daca undo-ul nu funtioneaza nu are de pe ce lua pret
    }
}
