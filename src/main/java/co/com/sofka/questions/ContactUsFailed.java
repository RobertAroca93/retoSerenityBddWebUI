package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userInterface.webPage.WebPageContactUs.CONTACT_FAILED;

public class ContactUsFailed implements Question<Boolean> {

    private String failedContactUsMessage;

    public ContactUsFailed failedContactMessage (String failedContactUsMessage){
        this.failedContactUsMessage = failedContactUsMessage;
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (CONTACT_FAILED.resolveFor(actor).containsOnlyText(failedContactUsMessage));
    }
    public static ContactUsFailed contactUsFailed(){ return new ContactUsFailed();}
}
