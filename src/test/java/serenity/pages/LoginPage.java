package serenity.pages;

import net.thucydides.core.pages.PageObject;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginPage extends PageObject {
    public void verifyUserRedirected() {
        String loginPageTitle = getDriver().getTitle();
        if(loginPageTitle.equals("Amazon Sign In")) {
            System.out.print("tested");
        }
    }
}
