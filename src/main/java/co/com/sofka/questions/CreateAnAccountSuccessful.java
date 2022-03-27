package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userInterface.webPage.WebPageCreateAnAccount.ACCOUNT_VALIDATION;

public class CreateAnAccountSuccessful implements Question<Boolean> {

    private String successfulRegisterMessage;

    public CreateAnAccountSuccessful registerVerification(String successfulRegisterMessage){
    this.successfulRegisterMessage = successfulRegisterMessage;
    return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (ACCOUNT_VALIDATION.resolveFor(actor).containsOnlyText(successfulRegisterMessage));

    }
    public static CreateAnAccountSuccessful createAnAccountSuccessful(){
    return new CreateAnAccountSuccessful();
    }
}
