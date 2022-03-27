package co.com.sofka.runners.contactUs;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/contactUs.feature"},
        glue = {"co.com.sofka.stepDefinitions.contatcUs"},
        tags = {""}
)

public class ContactUsTest {
}
