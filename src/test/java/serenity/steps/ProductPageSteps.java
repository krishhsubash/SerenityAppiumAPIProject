package serenity.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.steps.serenity.ProductPageSerenitySteps;

public class ProductPageSteps {

    @Steps
    ProductPageSerenitySteps productPageSerenitySteps;

    @Then("^I verify user is displayed with the search results$")
    public void iVerifyUserIsDisplayedWithTheSearchResults() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        productPageSerenitySteps.verifyUserDisplayedWithSearchResults();
    }

    @Then("^I verify pagination for the search results$")
    public void iVerifyPaginationForTheSearchResults() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        productPageSerenitySteps.verifyPaginationSearchResults();
    }

    @When("^I select the product to be added in cart in search results page$")
    public void iSelectTheProductToBeAddedInCartInSearchResultsPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        productPageSerenitySteps.selectProductToBeAdded();
    }

    @Then("^I verify user is able to select the quantity in the dropdown$")
    public void iVerifyUserIsAbleToSelectTheQuantityInTheDropdown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        productPageSerenitySteps.verifyUserSelectsQuantity();
    }

    @When("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        productPageSerenitySteps.clickAddToCart();
    }
}
