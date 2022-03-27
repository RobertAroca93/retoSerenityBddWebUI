package co.com.sofka.runners.singIn;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/signIn.feature"},
        glue = {"co.com.sofka.stepDefinitions.signIn"},
        tags = {""}
)
public class SignInTest {
}
