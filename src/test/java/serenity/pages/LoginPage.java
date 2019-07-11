package serenity.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import serenity.utils.YamlUtil;

import java.io.IOException;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginPage extends BasePage {
    YamlUtil readLocatorsYaml = new YamlUtil();
    public void verifyUserRedirected() {
        String loginPageTitle = getDriver().getTitle();
        if(loginPageTitle.equals("Amazon Sign In")) {
        }
    }

    public void enterTextLoginPage(String data) throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","homePage","username");
        enterText(By.xpath(locator),data);
    }

    public void clickContinueButton() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","homePage","continue");
        getDriver().findElement(By.xpath(locator)).click();
    }

    public void enterPasswordLoginPage(String data) throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","homePage","password");
        enterText(By.xpath(locator),data);
    }

    public void clickLoginButton() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","homePage","loginButton");
        getDriver().findElement(By.xpath(locator)).click();
    }
}
