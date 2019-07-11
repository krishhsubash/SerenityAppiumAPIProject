package serenity.pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import serenity.utils.ReadLocatorsYaml;
import serenity.utils.YamlUtil;
import xmlConfig.Constants;

import java.io.IOException;



public class HomePage extends BasePage {

    YamlUtil readLocatorsYaml = new YamlUtil();


    public void launchTestURL() {
       getDriver().get("https://amazon.in");
        //getDriver().get(Constants.testUrl);
    }

    public void verifyUserRedirected() {
        String websiteTitle = getDriver().getTitle();
        if(websiteTitle.equals("Online shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
    }


    public void closeBrowser() {
        getDriver().close();
    }

    public void clickButton(String button) throws IOException {
        switch(button) {
            case "Login":
                String locator = readLocatorsYaml.readLocators("xpath","homePage","homePageLoginLink");
                System.out.println(locator);
                getDriver().findElement(By.xpath(locator)).click();
                break;
        }
    }

    public void verifyLoggedUserRedirected() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","homePage","userLoggedIn");
        Assert.assertTrue(getDriver().findElement(By.xpath(locator)).isDisplayed());
    }

    public void clickCartIcon() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","homePage","cartIcon");
        getDriver().findElement(By.xpath(locator)).click();
    }

    public void enterProduct(String product) throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","homePage","searchBox");
        enterText(By.xpath(locator),product);
        String searchLocator = readLocatorsYaml.readLocators("xpath","homePage","searchIcon");
        getDriver().findElement(By.xpath(searchLocator)).click();
    }
}
