package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import serenity.pages.LoginPage;

import java.io.IOException;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginPageSerenitySteps {
    LoginPage loginPage;
    @Step
    public void clickLoginButton() throws IOException {
        loginPage.clickLoginButton();
    }

    @Step
    public void enterTextLoginPage(String data) throws IOException {
        loginPage.enterTextLoginPage(data);
    }

    @Step
    public void verifyUserRedirectedLoginPage() {
        loginPage.verifyUserRedirected();
    }

    @Step
    public void clickContinueButton() throws IOException {
        loginPage.clickContinueButton();
    }

    @Step
    public void enterPasswordLoginPage(String data) throws IOException {
        loginPage.enterPasswordLoginPage(data);
    }
}
