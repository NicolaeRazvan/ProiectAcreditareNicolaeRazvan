package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps{
    @Step
    public void putFirstName(String name){
        checkoutPage.setFirstName(name);
    }

    @Step
    public void putLastName(String name){
        checkoutPage.setLastName(name);
    }

    @Step
    public void putBillingAddress(String add){
        checkoutPage.setBillingAddress(add);
    }

    @Step
    public void putCity(String city){
        checkoutPage.setCity(city);
    }

    @Step
    public void selectACounty(String initial){
        checkoutPage.setCounty(initial);
    }


    @Step
    public void putPostcode(String code){
        checkoutPage.setPostcode(code);
    }

    @Step
    public void putPhoneNumber(String number){
        checkoutPage.setPhoneNumber(number);
    }

    @Step
    public void clickOrder(){
        checkoutPage.clickPlaceOrder();
    }
}
