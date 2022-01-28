package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void basicSearchTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        loginSteps.completeLogin();
        searchSteps.doSearch("T-Shirt");
    }

    @Test
    public void executeSearchForSpecificProduct(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        loginSteps.completeLogin();
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
    }

    @Test
    public void searchByPriceLowToHigh(){
        searchSteps.doSearch("T-Shirt");
        searchSteps.executeSort("price");
        searchSteps.checkPrice();
        searchSteps.priceAscending();
    }

    @Test
    public void searchByPriceHighToLow(){
        searchSteps.doSearch("T-Shirt");
        searchSteps.executeSort("price-desc");
        searchSteps.checkPrice();
        searchSteps.priceDescending();
    }

    @Test
    public void searchNewProductFromAdmin(){
        baseSteps.navigateToAdminHomePage();
        adminLoginSteps.doAdminLogin(EnvConstants.USER_EMAIL_ADMIN,EnvConstants.USER_PASS_ADMIN);
        adminProductSteps.clickAddNewProduct();
        adminProductSteps.nameAndPostNewProduct("AdminShirt");
        baseSteps.navigateToHomePage();
        searchSteps.doSearch("AdminShirt");
    }
}
