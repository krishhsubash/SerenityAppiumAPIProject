package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import serenity.pages.ProductPage;

import java.io.IOException;

public class ProductPageSerenitySteps {
    ProductPage productPage;
    @Step
    public void verifyUserDisplayedWithSearchResults() throws IOException {
        productPage.verifyUserDisplayedWithSearchResults();
    }

    @Step
    public void verifyPaginationSearchResults() throws IOException {
        productPage.verifyPaginationSearchResults();
    }

    @Step
    public void selectProductToBeAdded() throws IOException {
        productPage.selectProductToBeAdded();
    }

    @Step
    public void verifyUserSelectsQuantity() throws IOException {
        productPage.userSelectsQuantity();
    }

    @Step
    public void clickAddToCart() throws IOException {
        productPage.clickAddToCart();
    }
}
