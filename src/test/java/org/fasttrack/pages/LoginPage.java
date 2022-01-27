package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class LoginPage extends BasePage{
    @FindBy (id = "username")
    private WebElementFacade emailField;

    @FindBy (id = "password")
    private WebElementFacade passField;

    @FindBy (id = "rememberme")
    private WebElementFacade rememberButton;

    @FindBy (name = "login")
    private WebElementFacade loginButton;

    @FindBy (id = "reg_email")
    private WebElementFacade emailRegisterField;

    @FindBy (id = "reg_password")
    private  WebElementFacade passRegisterField;

    @FindBy (name = "register")
    private WebElementFacade registerButton;

    @FindBy ( css = "ul.woocommerce-error")
    private WebElementFacade error1;

    @FindBy ( css = "ul.woocommerce-error")
    private WebElementFacade error2;

    @FindBy ( css = ".woocommerce-error li")
    private WebElementFacade error3;

    @FindBy ( css = "ul.woocommerce-error")
    private WebElementFacade regNoUser;

    @FindBy ( css = ".woocommerce-error")
    private WebElementFacade regNoPass;

    @FindBy ( css = ".woocommerce-error")
    private WebElementFacade sameEmail;


    public void setEmailField(String email){
        typeInto(emailField,email);
    }

    public void setPassField(String password){
        typeInto(passField,password);
    }

    public void clickRememeberButton(){
        clickOn(rememberButton);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void setRegisterEmail(String email){
        typeInto(emailRegisterField,email);
    }

    public void setRegisterPasswordField(String pass){
        typeInto(passRegisterField,pass);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public void error1assert(){
        Assert.assertEquals("Error: Username is required.",error1.getText());
    }

    public void error2assert(){
        Assert.assertEquals("ERROR: The password field is empty.",error2.getText());
    }

    public void error3assert(){
        Assert.assertTrue(error3.containsText("Invalid email address"));
    }

    public void errorRegNoUser(){
        Assert.assertEquals("Error: Please provide a valid email address.",regNoUser.getText());
    }

    public void errorRegNoPass(){
        Assert.assertEquals("Error: Please enter an account password.",regNoPass.getText());
    }

    public void errorSameEmail(){
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.",sameEmail.getText());
    }


}
