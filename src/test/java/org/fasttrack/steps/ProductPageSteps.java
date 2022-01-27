package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class ProductPageSteps extends BaseSteps{
    @Step
    public void addToCart(){
        productPage.clickAddToCart();
    }

    @Step
    public void changeQuantityOfProduct(String number){
        productPage.setQuantity(number);
    }

}
