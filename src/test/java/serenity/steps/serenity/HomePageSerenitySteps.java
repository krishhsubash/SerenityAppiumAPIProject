package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import serenity.pages.HomePage;

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
    public void clickButton(String button) {
        homePage.clickButton(button);
    }

    @Step
    public void closeBrowser() {
        homePage.closeBrowser();
    }
}
