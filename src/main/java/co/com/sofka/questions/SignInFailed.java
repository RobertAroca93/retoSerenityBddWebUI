package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userInterface.webPage.WebPageSignIn.LOGIN_ERROR;

public class SignInFailed implements Question<Boolean> {

    private String failedLoginMessage;

    public SignInFailed failedLoginMessage (String failedLoginMessage){
        this.failedLoginMessage = failedLoginMessage;
        return this;

    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (LOGIN_ERROR.resolveFor(actor).containsOnlyText(failedLoginMessage));
    }
    public static SignInFailed signInFailed(){
        return new SignInFailed();
    }
}
