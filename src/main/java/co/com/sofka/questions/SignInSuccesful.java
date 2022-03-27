package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userInterface.webPage.WebPageSignIn.LOGIN_VALIDATION;

public class SignInSuccesful implements Question<Boolean> {

    private String successfulLoginMessage;

    public SignInSuccesful loginVerification (String successfulLoginMessage){
        this.successfulLoginMessage = successfulLoginMessage;
        return this;

    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (LOGIN_VALIDATION.resolveFor(actor).containsOnlyText(successfulLoginMessage));
    }
    public static SignInSuccesful signInSuccesful(){
        return new SignInSuccesful();
    }
}
