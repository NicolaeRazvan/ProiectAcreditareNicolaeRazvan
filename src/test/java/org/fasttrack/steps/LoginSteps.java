package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginSteps extends BaseSteps{



    @Step
    public void navigateToLoginPage(){
        homePage.clickAccountLink();
    }

    @Step
    public void enterCredentials(String email,String pass){
    loginPage.setEmailField(email);
    loginPage.setPassField(pass);
    }

    @Step
    public void completeLogin(){
        loginPage.clickRememeberButton();
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(String userName){
        myAccountPage.checkUserLoggedIn(userName);
    }

    @Step
    public void doLogout(){
        myAccountPage.clickLogout();
    }

    @Step
    public void noUsernameAssert(){
        loginPage.error1assert();
    }

    @Step
    public void noPassAssert(){
        loginPage.error2assert();
    }

    @Step
    public void invalidLoginAssert(){
        loginPage.error3assert();
    }





}
