package co.com.sofka.tasks.webPageYourLogo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userInterface.webPage.WebPageContactUs.*;
import static co.com.sofka.userInterface.webPage.WebPageCreateAnAccount.STATE;

public class FillContactUs implements Task {

    public String email;
    public String orderReference;
    public String message;

    public FillContactUs usingEmailContact (String email){
        this.email= email;
        return this;
    }
    public FillContactUs usingOrderReference (String orderReference){
        this.orderReference = orderReference;
        return this;
    }
    public FillContactUs usingMesagge (String message){
        this.message = message;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBJECT_HEADING),
                Click.on(SUBJECT_HEADING),
                SelectFromOptions.byVisibleText("Webmaster").from(SUBJECT_HEADING),

                Scroll.to(EMAIL_CONTACT),
                Enter.theValue(email).into(EMAIL_CONTACT),

                Scroll.to(ORDER_REFERENCE),
                Enter.theValue(orderReference).into(ORDER_REFERENCE),

                Scroll.to(MESSAGE),
                Enter.theValue(message).into(MESSAGE),

                Scroll.to(BUTTON_SEND),
                Click.on(BUTTON_SEND)

        );

    }
    public static FillContactUs fillContactUs(){return new FillContactUs();}

}
