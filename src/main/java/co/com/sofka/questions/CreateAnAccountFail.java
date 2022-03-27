package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userInterface.webPage.WebPageCreateAnAccount.REGISTER_ERROR;

public class CreateAnAccountFail implements Question<Boolean> {

    private String failRegisterMessage;

    public CreateAnAccountFail registerVerificationFail (String failRegisterMessage){
        this.failRegisterMessage = failRegisterMessage;
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (REGISTER_ERROR.resolveFor(actor).containsOnlyText(failRegisterMessage));
    }
    public static CreateAnAccountFail createAnAccountFail(){
        return new CreateAnAccountFail();
    }
}
