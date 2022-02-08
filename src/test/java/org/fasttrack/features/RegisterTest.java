package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidCredentials(){
        loginSteps.navigateToLoginPage();
        registerSteps.doRegister("emailregister@gmail.com","!Password43210");
        registerSteps.completeRegister();
    }

    @Test
    public void registerWithInvalidCredentials(){
        loginSteps.navigateToLoginPage();
        registerSteps.doRegister("addas@ssad",EnvConstants.USER_PASS);
        registerSteps.completeRegister();
        registerSteps.regFail();
    }

    @Test
    public void attemptRegisterWithNoUsername(){
        loginSteps.navigateToLoginPage();
        registerSteps.doRegister(" ",EnvConstants.USER_PASS);
        registerSteps.completeRegister();
        registerSteps.regNoUserAssert();
    }

    @Test
    public void attemptRegisterWithNoPassword(){
        loginSteps.navigateToLoginPage();
        registerSteps.doRegister("email@gmail.com","");
        registerSteps.completeRegister();
        registerSteps.reggNoPassAssert();
    }

    @Test
    public void attemptRegisterWithAlreadyUsedEmail(){
        loginSteps.navigateToLoginPage();
        registerSteps.doRegister(EnvConstants.USER_EMAIL,"!Password12345");
        registerSteps.completeRegister();
        registerSteps.regSameEmail();
    }
}
