package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{
    @Step
    public void doSearch(String value){
        homePage.clickSearchIcon();
        homePage.setSearchField(value);
        homePage.clickSecondSearchButton();
    }

    @Step
    public void findAndSelectProduct(String productName){
        Assert.assertTrue(searchResultsPage.locateProduct(productName));
    }

    @Step
    public void checkPrice(){
        searchResultsPage.isPriceCorrect();
    }

    @Step
    public void executeSort(String value){
        searchResultsPage.setSort(value);
    }

    @Step
    public void priceAscending(){
        searchResultsPage.priceIsAscending();
    }

    @Step
    public void priceDescending(){
        searchResultsPage.priceIsDescending();
    }


}
