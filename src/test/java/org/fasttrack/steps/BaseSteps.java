package org.fasttrack.steps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrack.pages.*;
import org.fasttrack.utils.EnvConstants;

public class BaseSteps extends ScenarioSteps {
    public LoginPage loginPage;
    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public SearchResultsPage searchResultsPage;
    public ProductPage productPage;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;
    public AccountDetailsPage accountDetailsPage;



    @Step
    public void navigateToAdminHomePage() {
        getDriver().get(EnvConstants.ADMIN_BASE_URL);
    }

    @Step
    public void navigateToHomePage() {
        getDriver().get(EnvConstants.BASE_URL);

    }

}