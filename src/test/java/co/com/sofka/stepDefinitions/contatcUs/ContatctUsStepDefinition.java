package co.com.sofka.stepDefinitions.contatcUs;

import co.com.sofka.stepDefinitions.SetUp;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.ContactUsFailed.contactUsFailed;
import static co.com.sofka.questions.ContactUsSuccessful.contactUsSuccessful;
import static co.com.sofka.tasks.openWebPage.OpenWebPage.openWebPage;
import static co.com.sofka.tasks.webPageYourLogo.BrowseToContactUs.browseToContactUs;
import static co.com.sofka.tasks.webPageYourLogo.FillContactUs.fillContactUs;
import static co.com.sofka.tasks.webPageYourLogo.FillContactUsFailed.fillContactUsFailed;
import static co.com.sofka.tasks.webPageYourLogo.FillSignIn.fillSignIn;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ContatctUsStepDefinition extends SetUp {

    Faker faker = new Faker();

    private static final String ACTOR_NAME = "Robert Aroca";
    private static final String CONTACT_SUCCESSFUL ="Your message has been successfully sent to our team.";
    private static final String CONTACT_FAILED = "Invalid email address.";

    @Given("dado que me encuentro en el modulo de contacto")
    public void dado_que_me_encuentro_en_el_modulo_de_contacto() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openWebPage());

    }
    @When("ingreso los datos correctos en los campos obligatorios")
    public void ingreso_los_datos_correctos_en_los_campos_obligatorios() {
        theActorInTheSpotlight().attemptsTo(
                browseToContactUs(),
                fillContactUs().usingEmailContact(faker.internet().emailAddress())
                        .usingOrderReference(faker.number().digits(5))
                                .usingMesagge(faker.country().name())
                                );


    }
    @Then("se debe mostrar mensaje de envio exitoso")
    public void se_debe_mostrar_mensaje_de_envio_exitoso() {
        theActorInTheSpotlight().should(
                seeThat(contactUsSuccessful().contactUsVerification(CONTACT_SUCCESSFUL),
                equalTo(true))

        );
    }
    //segundo escenario

    @Given("dado deseo contactarme con servicio al cliente")
    public void dado_deseo_contactarme_con_servicio_al_cliente() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openWebPage());

    }
    @When("no ingreso el campo obligatorio de email")
    public void no_ingreso_el_campo_obligatorio_de_email() {
        theActorInTheSpotlight().attemptsTo(
                browseToContactUs(),
                fillContactUsFailed().usingOrderReference(faker.number().digits(5))
                        .usingMesagge(faker.color().name())
        );

    }
    @Then("el sisteme debera solicitar que se diligencie ese campo")
    public void el_sisteme_debera_solicitar_que_se_diligencie_ese_campo() {
        theActorInTheSpotlight().should(
                seeThat(contactUsFailed().failedContactMessage(CONTACT_FAILED),
                        equalTo(true))
                );

    }



}
