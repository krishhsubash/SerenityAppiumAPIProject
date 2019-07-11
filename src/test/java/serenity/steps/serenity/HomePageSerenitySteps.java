package serenity.steps.serenity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;
import serenity.pages.HomePage;

import java.io.IOException;

public class HomePageSerenitySteps {

    HomePage homePage;
    @Step
    public void launchTestURL() {
        homePage.launchTestURL();
    }

    @Step
    public void verifyUserRedirected() {
        homePage.verifyUserRedirected();
    }

    @Step
    public void clickButton(String button) throws IOException {
        homePage.clickButton(button);
    }

    @Step
    public void closeBrowser() {
        homePage.closeBrowser();
    }

    @Step
    public void verifyLoggedUserRedirected() throws IOException {
        homePage.verifyLoggedUserRedirected();
    }

    @Step
    public void clickCartIcon() throws IOException {
        homePage.clickCartIcon();
    }

    @Step
    public void enterproduct(String product) throws IOException {
        homePage.enterProduct(product);
    }
}
