package org.fasttrack.features;

import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class ReviewTest extends BaseTest{

    @Test
    public void reviewAProduct(){
        searchSteps.doSearch("T-Shirt");
        searchSteps.findAndSelectProduct("T-Shirt new green");
        reviewSteps.chooseReviewRating();
        reviewSteps.leaveAComment("Very good.");
        reviewSteps.leaveYourName(EnvConstants.USER_NAME);
        reviewSteps.leaveYourEmail(EnvConstants.USER_EMAIL);
        reviewSteps.clickSubmit();
    }
}
