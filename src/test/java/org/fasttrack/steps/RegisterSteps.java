package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{

    @Step
    public void doRegister(String email,String password){
        loginPage.setRegisterEmail(email);
        loginPage.setRegisterPasswordField(password);
    }

    @Step
    public void completeRegister(){
        loginPage.clickRegisterButton();
    }

    @Step
    public void regFail(){
        myAccountPage.registerFail();
    }

    @Step
    public void regNoUserAssert(){
        loginPage.errorRegNoUser();
    }

    @Step
    public void reggNoPassAssert(){
        loginPage.errorRegNoPass();
    }

    @Step
    public void regSameEmail(){
        loginPage.errorSameEmail();
    }
}
