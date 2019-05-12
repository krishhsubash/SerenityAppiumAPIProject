package serenity.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.steps.serenity.HomePageSerenitySteps;

public class HomePageSteps {

@Steps
    HomePageSerenitySteps homePageSerenitySteps;
    @When("^I launch the test URL successfully$")
    public void iLaunchTheTestURLSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageSerenitySteps.launchTestURL();
    }

    @Then("^I verify user is redirected to the website successfully$")
    public void iVerifyUserIsRedirectedToTheWebsiteSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageSerenitySteps.verifyUserRedirected();
    }

    @When("^I click on \"([^\"]*)\" button in Home Page$")
    public void iClickOnButtonInHomePage(String button) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageSerenitySteps.clickButton(button);
    }

    @And("^I close the browser successfully$")
    public void iCloseTheBrowserSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePageSerenitySteps.closeBrowser();
    }
}
