package co.com.chourcair.financialtechnicalchallenge.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/userRegistration.feature"},
        tags = "@stories",
        glue = {"co.com.chourcair.financialtechnicalchallenge.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
