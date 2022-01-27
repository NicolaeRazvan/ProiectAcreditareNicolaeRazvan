package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class MyAccountPage extends BasePage{
    @FindBy (css = ".woocommerce-MyAccount-content p:first-child")
    private WebElementFacade loginHelloMessageElement;

    @FindBy (css = ".woocommerce-MyAccount-navigation li:nth-child(5) a")
    private WebElementFacade accountDetailsButton;

    @FindBy ( css = ".woocommerce-MyAccount-navigation li:last-child a")
    private WebElementFacade logoutButton;

    @FindBy ( css = ".woocommerce-error li")
    private WebElementFacade regFailError;

    public void checkUserLoggedIn(String username){
    loginHelloMessageElement.shouldContainText("Hello " +username);
    }

    public void clickAccountDetails(){
        clickOn(accountDetailsButton);
    }

    public void clickLogout(){
        clickOn(logoutButton);
    }

    public void registerFail(){
        Assert.assertEquals("Error: Please provide a valid email address.",regFailError.getText());
    }
}
