package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;


public class CheckoutPage extends BasePage{

    @FindBy (id = "billing_first_name")
    private WebElementFacade firstName;

    @FindBy ( id = "billing_last_name")
    private WebElementFacade lastName;

    @FindBy ( id = "billing_address_1")
    private WebElementFacade billingAddress;

    @FindBy ( id = "billing_city")
    private WebElementFacade city;

    @FindBy (id = "billing_state")
    private WebElementFacade dropDownSelect;

    @FindBy ( id = "billing_postcode")
    private WebElementFacade postcode;

    @FindBy ( id = "billing_phone")
    private WebElementFacade phoneNumber;

    @FindBy ( id = "place_order")
    private WebElementFacade placeOrder;

    public void setFirstName(String name){
        typeInto(firstName,name);
    }

    public void setLastName(String last){
        typeInto(lastName,last);
    }

    public void setBillingAddress(String address){
        typeInto(billingAddress,address);
    }

    public void setCounty(String countyInitial){
        Select county = new Select(dropDownSelect);
        county.selectByValue(countyInitial);
    }

    public void setCity(String cityAddress){
        typeInto(city,cityAddress);
    }


    public void setPostcode(String code){
        typeInto(postcode,code);
    }

    public void setPhoneNumber(String number){
        typeInto(postcode,number);
    }

    public void clickPlaceOrder(){
        clickOn(placeOrder);
    }
}
