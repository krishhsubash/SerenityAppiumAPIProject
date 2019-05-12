package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import serenity.pages.LoginPage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginPageSerenitySteps {
    LoginPage loginPage;
    @Step
    public void clickLoginButton() {

    }

    @Step
    public void enterTextLoginPage(String data) {
    }

    @Step
    public void verifyUserRedirectedLoginPage() {
        loginPage.verifyUserRedirected();
    }
}
