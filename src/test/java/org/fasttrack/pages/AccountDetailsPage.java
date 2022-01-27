package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountDetailsPage extends BasePage{

    @FindBy ( id = "password_current")
    private WebElementFacade currentPass;

    @FindBy ( id = "password_1")
    private WebElementFacade newPass;

    @FindBy ( id = "password_2")
    private WebElementFacade confirmPass;

    public void setCurrentPass(String pass){
        typeInto(currentPass,pass);
    }

    public void setNewPass(String pass){
        typeInto(newPass,pass);
    }

    public void setConfirmPass(String pass){
        typeInto(confirmPass,pass);
    }

}
