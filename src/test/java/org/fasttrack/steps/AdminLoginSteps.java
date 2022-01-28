package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class AdminLoginSteps extends BaseSteps{

    @Step
    public void doAdminLogin(String user,String pas){
        adminLoginPage.adminLogin(user,pas);
    }
}
