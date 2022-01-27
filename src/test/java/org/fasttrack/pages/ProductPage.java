package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class ProductPage extends BasePage{
    @FindBy (name = "add-to-cart")
    private WebElementFacade addToCartButton;

    @FindBy ( css = "a.star-4")
    private WebElementFacade reviewButton;

    @FindBy ( id = "comment")
    private WebElementFacade commentField;

    @FindBy ( id = "author")
    private WebElementFacade authorField;

    @FindBy ( name = "email")
    private WebElementFacade emailField;

    @FindBy ( id = "submit")
    private WebElementFacade submitButton;

    @FindBy ( css = "[title='Qty']")
    private WebElementFacade quantityBox;

    public void clickAddToCart(){
        clickOn(addToCartButton);
    }

    public void setReview(){
        clickOn(reviewButton);
    }

    public void setComment(String com){
        typeInto(commentField,com);
    }

    public void setAuthor(String aut){
        typeInto(authorField,aut);
    }

    public void setEmail(String email){
        typeInto(emailField,email);
    }

    public void doSubmit(){
        clickOn(submitButton);
    }

    public void setQuantity(String number){
        typeInto(quantityBox,number);
    }

}
