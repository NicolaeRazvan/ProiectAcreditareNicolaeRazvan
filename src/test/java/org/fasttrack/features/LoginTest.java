package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials(){
    loginSteps.navigateToLoginPage();
    loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
    loginSteps.completeLogin();
    loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithInValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("fcx@ffe.asd", EnvConstants.USER_PASS);
        loginSteps.completeLogin();
        loginSteps.invalidLoginAssert();
    }

    @Test
    public void logoutFromAccount(){
    loginSteps.navigateToLoginPage();
    loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
    loginSteps.completeLogin();
    loginSteps.doLogout();
    }

    @Test
    public void attemptLoginWithNoUsername(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(" ",EnvConstants.USER_PASS);
        loginSteps.completeLogin();
        loginSteps.noUsernameAssert();
    }

    @Test
    public void attemptLoginWithNoPassword(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL," ");
        loginSteps.completeLogin();
        loginSteps.noPassAssert();
    }

    @Test
    public void doAdminLogin(){
        baseSteps.navigateToAdminHomePage();
        adminLoginSteps.doAdminLogin(EnvConstants.USER_EMAIL_ADMIN,EnvConstants.USER_PASS_ADMIN);
    }
}
