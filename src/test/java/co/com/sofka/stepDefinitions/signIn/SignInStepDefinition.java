package co.com.sofka.stepDefinitions.signIn;

import co.com.sofka.stepDefinitions.SetUp;
import co.com.sofka.tasks.webPageYourLogo.FillSignInFailed;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.CreateAnAccountSuccessful.createAnAccountSuccessful;
import static co.com.sofka.questions.SignInFailed.signInFailed;
import static co.com.sofka.questions.SignInSuccesful.signInSuccesful;
import static co.com.sofka.tasks.openWebPage.OpenWebPage.openWebPage;
import static co.com.sofka.tasks.webPageYourLogo.BrowseToSignIn.browseToSignIn;
import static co.com.sofka.tasks.webPageYourLogo.FillSignIn.fillSignIn;
import static co.com.sofka.tasks.webPageYourLogo.FillSignInFailed.fillSignInFailed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SignInStepDefinition extends SetUp {

    Faker faker = new Faker();

    private static final String ACTOR_NAME = "Robert Aroca";
    private static final String LOGIN_SUCCESSFUL = "Welcome to your account. Here you can manage all of your personal information and orders.";
    private static final String LOGIN_FAILED = "Authentication failed.";

    @Given("dado que estoy registrado en la plataforma")
    public void dado_que_estoy_registrado_en_la_plataforma() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openWebPage());

    }
    @When("ingreso mis datos correctamente")
    public void ingreso_mis_datos_correctamente() {
        theActorInTheSpotlight().attemptsTo(
                browseToSignIn(),
                fillSignIn().usingEmailSignIn("robert-device@hotmail.es").usingPasswordSignIn("123456")
        );


    }
    @Then("debo ingresar a mi cuenta exitosamente")
    public void debo_ingresar_a_mi_cuenta_exitosamente() {
        theActorInTheSpotlight().should(
                seeThat(signInSuccesful().loginVerification(LOGIN_SUCCESSFUL))
                );

    }
    //segundo escenario

    @Given("dado que me encuentr en el apartado de login")
    public void dado_que_me_encuentr_en_el_apartado_de_login() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openWebPage());

    }

    @When("ingreso mis datos sin registrarme")
    public void ingreso_mis_datos_sin_registrarme() {
        theActorInTheSpotlight().attemptsTo(
                browseToSignIn(),
                fillSignInFailed().usingEmailSignIn(faker.internet().emailAddress())
                        .usingPasswordSignIn(faker.internet().password())
        );


    }
    @Then("el sistema debe mostrar el mensaje de error")
    public void el_sistema_debe_mostrar_el_mensaje_de_error() {
        theActorInTheSpotlight().should(
                seeThat(signInFailed().failedLoginMessage(LOGIN_FAILED))
        );

    }


}
