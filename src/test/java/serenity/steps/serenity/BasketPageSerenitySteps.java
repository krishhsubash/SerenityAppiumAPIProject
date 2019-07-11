package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import serenity.pages.BasketPage;

import java.io.IOException;

public class BasketPageSerenitySteps {

    BasketPage basketPage;
    @Step
    public void verifyUserRedirectedBasketPage() throws IOException {
        basketPage.verifyUserRedirectedBasketPage();
    }

    @Step
    public void verifyProductAddedToCart() throws IOException {
        basketPage.verifyProductAddedToCart();
    }


    @Step
    public void clickButtonCart(String productButton) throws IOException {
        basketPage.clickButtonCart(productButton);
    }


    @Step
    public void verifyUserRedirectedCheckoutPage() throws IOException {
        basketPage.verifyUserRedirectCheckoutPage();
    }

    @Step
    public void clickCartButton(String cartButton) throws IOException {
        basketPage.clickCartButton(cartButton);
    }
}
