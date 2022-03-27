package co.com.sofka.tasks.openWebPage;

import co.com.sofka.userInterface.onWebPage.OnWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenWebPage implements Task {

    private OnWebPage onWebPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(onWebPage)
        );


    }
    public static OpenWebPage openWebPage(){
        return new OpenWebPage();
    }
}
