package co.com.sofka.tasks.webPageYourLogo;

import javafx.stage.Screen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userInterface.webPage.WebPageSignIn.*;

public class FillSignIn implements Task {

    public String emailSignIn;
    public String passwordSigIn;

    public FillSignIn usingEmailSignIn(String emailSignIn){
        this.emailSignIn = emailSignIn;
        return this;
    }
    public FillSignIn usingPasswordSignIn(String passwordSigIn){
        this.passwordSigIn = passwordSigIn;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(EMAIL_SIGNIN),
                Enter.theValue(emailSignIn).into(EMAIL_SIGNIN),

                Scroll.to(PASSWORD),
                Enter.theValue(passwordSigIn).into(PASSWORD),

                Scroll.to(BUTTON_SIGNIN),
                Click.on(BUTTON_SIGNIN)



        );

    }
    public static FillSignIn fillSignIn(){
        return new FillSignIn();
    }
}
