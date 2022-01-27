package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy (css = "a.remove")
    private WebElementFacade removeButton;

    @FindBy ( css = ".checkout-button")
    private WebElementFacade checkoutButton;

    @FindBy ( css = "td.product-subtotal span.woocommerce-Price-amount ")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy ( css = "tr.cart-subtotal span.woocommerce-Price-amount ")
    private WebElementFacade subtotalText;

    @FindBy ( css = "tr.shipping span.woocommerce-Price-amount ")
    private WebElementFacade shippingFeeText;

    @FindBy ( css = "tr.order-total span.woocommerce-Price-amount ")
    private WebElementFacade grandTotal;

    @FindBy ( css = "[title='Qty']")
    private WebElementFacade quantityCartField;

    @FindBy ( css = "[value='Update cart']")
    private WebElementFacade updateCartButton;

    @FindBy ( css = "a.restore-item")
    private WebElementFacade undoButton;

    public void clickRemoveItem(){
        clickOn(removeButton);
    }

    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }

    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public int getSubtotalPriceWithTaxes(){
        String x = subtotalText.getText();
        String y = "0";
        if (shippingFeeText.isPresent()){
            y = shippingFeeText.getText();
        }
        return getIntFromPrice(x) + getIntFromPrice(y);
    }

    public boolean isGrandTotalPriceCorrect(){
        return getSubtotalPriceWithTaxes() == getIntFromPrice(grandTotal.getText());
    }

    public void setQuantityCart(String value){
        typeInto(quantityCartField,value);
    }

    public void clickUpdateCart(){
        clickOn(updateCartButton);
    }

    public void clickUndo(){
        clickOn(undoButton);
    }
}
