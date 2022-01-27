package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage{

    @FindBy (id = "menu-item-122")
    private WebElementFacade accountLink;

    @FindBy (css = "div.header-search")
    private WebElementFacade searchIcon;

    @FindBy (name = "s")
    private WebElementFacade searchField;

    @FindBy (css = "[value='Search']")
    private WebElementFacade completeSearch;

    @FindBy ( css = "[title='View your shopping cart']")
    private WebElementFacade cartIcon;

    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickSecondSearchButton(){
        clickOn(completeSearch);
    }

    public void clickCartIcon(){
        clickOn(cartIcon);
    }
}
