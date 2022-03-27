package co.com.sofka.tasks.webPageYourLogo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userInterface.webPage.WebPageSignIn.*;
import static co.com.sofka.userInterface.webPage.WebPageSignIn.BUTTON_SIGNIN;

public class FillSignInFailed implements Task {

    public String emailSignIn;
    public String passwordSigIn;

    public FillSignInFailed usingEmailSignIn(String emailSignIn){
        this.emailSignIn = emailSignIn;
        return this;
    }
    public FillSignInFailed usingPasswordSignIn(String passwordSigIn){
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
    public static FillSignInFailed fillSignInFailed(){
        return new FillSignInFailed();
    }
}
