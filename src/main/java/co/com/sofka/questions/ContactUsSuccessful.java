package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userInterface.webPage.WebPageContactUs.MESAGGE_OK;

public class ContactUsSuccessful implements Question<Boolean> {

    private String successfulContactMessage;

    public ContactUsSuccessful contactUsVerification (String successfulContactMessage){
        this.successfulContactMessage = successfulContactMessage;
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (MESAGGE_OK.resolveFor(actor).containsOnlyText(successfulContactMessage));
    }
    public static ContactUsSuccessful contactUsSuccessful(){
        return new ContactUsSuccessful();
    }
}
