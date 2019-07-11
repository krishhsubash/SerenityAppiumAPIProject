package serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.jruby.RubyProcess;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary/")
public class DefinitionTestSuite {



}
