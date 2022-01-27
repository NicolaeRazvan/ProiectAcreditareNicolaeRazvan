package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class AccountDetailsTest extends BaseTest{

    @Test
    public void changeYourPassword(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        loginSteps.completeLogin();
        accountDetailsSteps.navigateToAccountDetails();
        accountDetailsSteps.putCurrentPassword(EnvConstants.USER_PASS);
        accountDetailsSteps.putNewPassword(EnvConstants.USER_PASS);
        accountDetailsSteps.confirmYourPassword(EnvConstants.USER_PASS);
    }
}
