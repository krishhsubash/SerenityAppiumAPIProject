package serenity.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.steps.serenity.LoginPageSerenitySteps;

public class LoginPageSteps {

@Steps
    LoginPageSerenitySteps loginPageSerenitySteps;

    @Then("^I verify user is redirected to Login page successfully$")
    public void iVerifyUserIsRedirectedToLoginPageSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPageSerenitySteps.verifyUserRedirectedLoginPage();
    }

    @When("^I enter \"([^\"]*)\" as username in login page successfully$")
    public void iEnterInLoginPageSuccessfully(String Data) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPageSerenitySteps.enterTextLoginPage(Data);
    }
    @When("^I enter \"([^\"]*)\" as password in login page successfully$")
    public void iEnterpasswordInLoginPageSuccessfully(String Data) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPageSerenitySteps.enterPasswordLoginPage(Data);
    }

    @And("^I click on Login button in Login page successfully$")
    public void iClickOnLoginButtonInLoginPageSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPageSerenitySteps.clickLoginButton();
    }

    @When("^I click on Continue Button in login page successfully$")
    public void iClickOnContinueButtonInLoginPageSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPageSerenitySteps.clickContinueButton();
    }
}
