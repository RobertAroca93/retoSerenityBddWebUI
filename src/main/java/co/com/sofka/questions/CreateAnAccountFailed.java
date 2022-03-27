package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userInterface.webPage.WebPageCreateAnAccount.REGISTER_ERROR;

public class CreateAnAccountFailed implements Question<Boolean> {

    private String failRegisterMessage;

    public CreateAnAccountFailed registerVerificationFail (String failRegisterMessage){
        this.failRegisterMessage = failRegisterMessage;
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (REGISTER_ERROR.resolveFor(actor).containsOnlyText(failRegisterMessage));
    }
    public static CreateAnAccountFailed createAnAccountFail(){
        return new CreateAnAccountFailed();
    }
}
