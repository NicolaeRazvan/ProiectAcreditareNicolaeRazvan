package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchResultsPage extends BasePage{
    @FindBy (id = "primary")
    private List<WebElementFacade> productsList;

    @FindBy ( css = ".price :not(del) .woocommerce-Price-amount, .price>.amount")
    private List<WebElementFacade> listOfProducts1;

    @FindBy ( css = ".orderby")
    private WebElementFacade sortPrice;


    public boolean locateProduct(String name){
        for (WebElementFacade element : productsList){
            if (element.findElement(By.cssSelector(".azera_shop_grid_first li:first-child h2")).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("h2")).click();
                return true;
            }
        }
        return false;
    }

    public void setSort(String selectInitial){
        Select county = new Select(sortPrice);
        county.selectByValue(selectInitial);
    }


    public boolean isPriceCorrect() {
        return getIntFromPrice(listOfProducts1.get(0).getText()) < getIntFromPrice(listOfProducts1.get(listOfProducts1.size()-1).getText());
    }

    public boolean priceIsAscending() {
        int a = getIntFromPrice(listOfProducts1.get(0).getText());
        int b = getIntFromPrice(listOfProducts1.get(listOfProducts1.size() - 1).getText());
        Assert.assertTrue("Ascending price is correct.", a < b);
        return a < b;
    }

    public boolean priceIsDescending() {
        int a = getIntFromPrice(listOfProducts1.get(0).getText());
        int b = getIntFromPrice(listOfProducts1.get(listOfProducts1.size() - 1).getText());
        Assert.assertTrue("Ascending price is correct.", a > b);
        return a > b;
    }






}
