package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class ReviewSteps extends BaseSteps{
    @Step
    public void chooseReviewRating(){
        productPage.setReview();
    }

    @Step
    public void leaveAComment(String message){
        productPage.setComment(message);
    }

    @Step
    public void leaveYourName(String name){
        productPage.setAuthor(name);
    }

    @Step
    public void leaveYourEmail(String email){
        productPage.setEmail(email);
    }

    @Step
    public void clickSubmit(){
        productPage.doSubmit();
    }
}
