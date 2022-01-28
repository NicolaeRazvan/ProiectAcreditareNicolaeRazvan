package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class AdminProductSteps extends BaseSteps{

    @Step
    public void navigateToProductPage(){
        adminPage.clickProductButton();
    }

    @Step
    public void clickAddNewProduct(){
        adminPage.clickProductButton();
        adminPage.clickAddNew();
    }

    @Step
    public void nameAndPostNewProduct(String name){
        adminPage.setProductTitle(name);
        adminPage.clickPublishButton();
    }

    @Step
    public void deleteItem(){
        adminPage.clickDeleteItem();
    }

    @Step public void newItemWithPrice(String name,String price){
        adminPage.setProductTitle(name);
        adminPage.setItemPrice(price);
        adminPage.clickPublishButton();
    }
}
