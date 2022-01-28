package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class ProductTest extends BaseTest{

    @Test
    public void createNewProductFromAdmin(){
        baseSteps.navigateToAdminHomePage();
        adminLoginSteps.doAdminLogin(EnvConstants.USER_EMAIL_ADMIN,EnvConstants.USER_PASS_ADMIN);
        adminProductSteps.clickAddNewProduct();
        adminProductSteps.nameAndPostNewProduct("vaza");
        adminProductSteps.deleteItem();

    }


}
