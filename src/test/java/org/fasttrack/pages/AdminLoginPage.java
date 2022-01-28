package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminLoginPage extends BasePage{
    @FindBy ( id = "user_login")
    private WebElementFacade userAdmin;

    @FindBy ( id = "user_pass")
    private WebElementFacade passAdmin;

    @FindBy ( id = "wp-submit")
    private WebElementFacade buttonLoginAdmin;

    public void adminLogin(String id, String pass){
        typeInto(userAdmin,id);
        typeInto(passAdmin,pass);
        clickOn(buttonLoginAdmin);
    }
}
