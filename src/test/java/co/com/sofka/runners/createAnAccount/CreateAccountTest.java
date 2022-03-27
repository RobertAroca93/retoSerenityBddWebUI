package co.com.sofka.runners.createAnAccount;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/createAnAccount.feature"},
        glue = {"co.com.sofka.stepDefinitions.createAnAccount"},
        tags = {""}

)
public class CreateAccountTest {
}
