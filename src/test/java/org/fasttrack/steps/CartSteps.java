package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void navigateToCartPage(){
        homePage.clickCartIcon();
    }

    @Step
    public void removeItemFromCart(){
        cartPage.clickRemoveItem();
    }

    @Step
    public void proceedToCheckout(){
        cartPage.clickCheckoutButton();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void checkGrandTotalPriceIsCorrect(){
        Assert.assertTrue("Total price not correct", cartPage.isGrandTotalPriceCorrect());
    }

    @Step
    public void getTotal(){
        cartPage.getSubtotalPriceWithTaxes();
    }

    @Step
    public void changeQuantityFromCart(String value){
        cartPage.setQuantityCart(value);
    }

    @Step
    public void updateCart(){
        cartPage.clickUpdateCart();
    }

    @Step
    public void clickUndoButton(){
        cartPage.clickUndo();
    }
}
