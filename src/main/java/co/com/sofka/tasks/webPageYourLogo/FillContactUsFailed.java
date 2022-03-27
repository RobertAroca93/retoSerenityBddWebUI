package co.com.sofka.tasks.webPageYourLogo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userInterface.webPage.WebPageContactUs.*;
import static co.com.sofka.userInterface.webPage.WebPageContactUs.BUTTON_SEND;

public class FillContactUsFailed implements Task {

    public String orderReference;
    public String message;

    public FillContactUsFailed usingOrderReference (String orderReference){
        this.orderReference = orderReference;
        return this;
    }
    public FillContactUsFailed usingMesagge (String message){
        this.message = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBJECT_HEADING),
                Click.on(SUBJECT_HEADING),
                SelectFromOptions.byVisibleText("Webmaster").from(SUBJECT_HEADING),

                Scroll.to(ORDER_REFERENCE),
                Enter.theValue(orderReference).into(ORDER_REFERENCE),

                Scroll.to(MESSAGE),
                Enter.theValue(message).into(MESSAGE),

                Scroll.to(BUTTON_SEND),
                Click.on(BUTTON_SEND)

        );

    }
    public static FillContactUsFailed fillContactUsFailed(){return new FillContactUsFailed();}
}
