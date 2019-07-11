package serenity.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.steps.serenity.BasketPageSerenitySteps;

public class BasketPageSteps {

    @Steps
    BasketPageSerenitySteps basketPageSerenitySteps;

        @Then("^I verify user is redirected to basket page successfully$")
        public void iVerifyUserIsRedirectedToBasketPageSuccessfully() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            basketPageSerenitySteps.verifyUserRedirectedBasketPage();
        }


    @Then("^I verify the product is added to cart successfully$")
    public void iVerifyTheProductIsAddedToCartSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basketPageSerenitySteps.verifyProductAddedToCart();
    }

    @When("^I click on \"([^\"]*)\" button to remove the product from the cart$")
    public void iClickOnButtonToRemoveTheProductFromTheCart(String productButton) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basketPageSerenitySteps.clickButtonCart(productButton);
    }


    @When("^I click on \"([^\"]*)\" button Cart Page$")
    public void iClickOnButtonCartPage(String cartButton) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basketPageSerenitySteps.clickCartButton(cartButton);
    }

    @Then("^I verify user is redirected to Checkout Page$")
    public void iVerifyUserIsRedirectedToCheckoutPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basketPageSerenitySteps.verifyUserRedirectedCheckoutPage();
    }



}
