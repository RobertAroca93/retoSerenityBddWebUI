package co.com.sofka.stepDefinitions.createAnAccount;

import co.com.sofka.stepDefinitions.SetUp;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.CreateAnAccountFailed.createAnAccountFail;
import static co.com.sofka.questions.CreateAnAccountSuccessful.createAnAccountSuccessful;
import static co.com.sofka.tasks.openWebPage.OpenWebPage.openWebPage;
import static co.com.sofka.tasks.webPageYourLogo.BrowseToSignIn.browseToSignIn;
import static co.com.sofka.tasks.webPageYourLogo.FillCreateAnAccount.fillCreateAnAccount;
import static co.com.sofka.tasks.webPageYourLogo.FillCreateAnAccountFail.fillCreateAnAccountFail;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateAccountStepDefinition extends SetUp {

    Faker faker = new Faker();

    private static final String ACTOR_NAME = "Robert Aroca";
    private static final String REGISTER_SUCCESSFUL = "Welcome to your account. Here you can manage all of your personal information and orders.";
    private static final String REGISTER_UNSUCCESSFUL= "The Zip/Postal code you've entered is invalid. It must follow this format: 00000";

    @Given("dado que me encuentro en el apartado de registro")
    public void dadoQueMeEncuentroEnElApartadoDeRegistro() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openWebPage());



    }

    @When("diligencio correctamente los datos")
    public void diligencioCorrectamenteLosDatos() {
        theActorInTheSpotlight().attemptsTo(
                browseToSignIn(),
                fillCreateAnAccount().usingEmail(faker.internet().emailAddress())
                        .usingFirstName(faker.name().firstName())
                        .usingLastName(faker.name().lastName())
                        .usingPassword(faker.internet().password())
                        .usingAdress(faker.address().fullAddress())
                        .usingCity(faker.nation().capitalCity())
                        .usingPostalCode(faker.number().digits(5))
                        .usingPhone(faker.number().digits(5))

        );
    }

    @Then("el sistema debera mostrar el mensaje de bienvenida")
    public void elSistemaDeberaMostrarElMensajeDeBienvenida() {
        theActorInTheSpotlight().should(
                seeThat(createAnAccountSuccessful().registerVerification(REGISTER_SUCCESSFUL),
                        equalTo(true)
                )
        );

    //segundo escenario

    }
    @Given("dado que me encuentro en el modulo de registro")
    public void dado_que_me_encuentro_en_el_modulo_de_registro() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openWebPage());

    }



    @When("no ingreso el campo obligatorio de codigo postal")
    public void no_ingreso_el_campo_obligatorio_de_codigo_postal() {
        theActorInTheSpotlight().attemptsTo(
                browseToSignIn(),
                fillCreateAnAccountFail().usingEmail(faker.internet().emailAddress())
                        .usingFirstName(faker.name().firstName())
                        .usingLastName(faker.name().lastName())
                        .usingPassword(faker.internet().password())
                        .usingAdress(faker.address().fullAddress())
                        .usingCity(faker.nation().capitalCity())
                        .usingPhone(faker.number().digits(5)
                        ));


    }

    @Then("el sistema debera mostrar el mensaje de error")
    public void el_sistema_debera_mostrar_el_mensaje_de_error() {
        theActorInTheSpotlight().should(
                seeThat(createAnAccountFail().registerVerificationFail(REGISTER_UNSUCCESSFUL),
                        equalTo(true)
                )
        );




    }


}
