package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminPage extends BasePage{

    @FindBy ( css = "li#menu-posts-product.wp-has-submenu")
    private WebElementFacade productsButton;


    @FindBy ( css = "[href=\"http://qa4.fasttrackit.org:8008/wp-admin/post-new.php?post_type=product\"]:nth-child(2)")
    private  WebElementFacade addNewButton;

    @FindBy ( id = "title")
    private WebElementFacade productTitle;

    @FindBy ( id = "_regular_price")
    private WebElementFacade itemPrice;

    @FindBy ( id = "publish")
    private WebElementFacade publishButton;

    @FindBy ( css = "a.submitdelete")
    private WebElementFacade deleteItemButton;



    public void clickProductButton(){
        clickOn(productsButton);
    }

    public void clickAddNew(){
        clickOn(addNewButton);
    }

    public void setProductTitle(String name){
        typeInto(productTitle,name);
    }

    public void clickPublishButton(){
        clickOn(publishButton);
    }

    public void clickDeleteItem(){
        clickOn(deleteItemButton);
    }

    public void setItemPrice(String price){
        typeInto(itemPrice,price);
    }
}
