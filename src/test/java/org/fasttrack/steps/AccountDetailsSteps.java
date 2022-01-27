package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class AccountDetailsSteps extends BaseSteps{

    @Step
    public void navigateToAccountDetails(){
        myAccountPage.clickAccountDetails();
    }

    @Step
    public void putCurrentPassword(String current){
        accountDetailsPage.setCurrentPass(current);
    }

    @Step
    public void putNewPassword(String newpass){
        accountDetailsPage.setNewPass(newpass);
    }

    @Step
    public void confirmYourPassword(String confirm){
        accountDetailsPage.setConfirmPass(confirm);
    }
}
