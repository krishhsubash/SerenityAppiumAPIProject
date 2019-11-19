package serenity.pages;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.cache.annotation.CacheAnnotationParser;

public class MybrowsecapEnhancer implements BeforeAWebdriverScenario {
    @Override
    public DesiredCapabilities apply(EnvironmentVariables environmentVariables, SupportedWebDriver supportedWebDriver, TestOutcome testOutcome, DesiredCapabilities desiredCapabilities) {
        String browserName = desiredCapabilities.getBrowserName();
        if(browserName.equals("Chrome")) {
            desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
            desiredCapabilities.setJavascriptEnabled(true);
            desiredCapabilities.setCapability(CapabilityType.SUPPORTS_LOCATION_CONTEXT,true);
            desiredCapabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT,true);
            desiredCapabilities.setCapability("name",testOutcome.getStoryTitle() + " - " + testOutcome.getTitle());
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-popup-blocking");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-gpu");
			options.addArguments("--privileged");
			options.addArguments("--disable-dev-shm-usage");
        }
        else if(browserName.equals("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            //options.setBinary(""); // to test different version of the firefox browsers
            options.setAcceptInsecureCerts(true);
            //options.setProxy(setProxyURL(String proxyURL)) // if application is deployed in the proxy network
            options.setHeadless(true);
            options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
            options.setPageLoadStrategy(PageLoadStrategy.EAGER); // will not wait for the complete page to load
            options.addArguments("--headless");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-gpu");
            options.addArguments("--privileged");
            options.addArguments("--disable-dev-shm-usage");
        }
        return desiredCapabilities;
    }

    public Proxy setProxyURL(String url) {
        Proxy pr = new Proxy();
        pr.setProxyAutoconfigUrl(url);
        return pr;

    }
}
