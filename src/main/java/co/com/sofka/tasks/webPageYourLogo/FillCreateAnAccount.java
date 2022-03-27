package co.com.sofka.tasks.webPageYourLogo;

import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userInterface.webPage.WebPageCreateAnAccount.*;

public class FillCreateAnAccount implements Task  {

    public String email;
    public String title;
    public String firstName;
    public String lastName;
    public String password;
    public String adress;
    public String city;
    public String state;
    public String postalCode;
    public String country;
    public String phone;


    public FillCreateAnAccount usingEmail(String email){
        this.email = email;
        return this;
    }
    public FillCreateAnAccount usingTitle(String title){
        this.title= title;
        return  this;
    }
    public FillCreateAnAccount usingFirstName (String firstName){
        this.firstName = firstName;
        return this;
    }
    public FillCreateAnAccount usingLastName (String lastName){
        this.lastName = lastName;
        return this;
    }
    public FillCreateAnAccount usingPassword (String password){
        this.password = password;
        return this;
    }
    public FillCreateAnAccount usingAdress (String adress){
        this.adress = adress;
        return this;
    }
    public FillCreateAnAccount usingCity (String city){
        this.city = city;
        return this;
    }
    public FillCreateAnAccount usingState (String state){
        this.state = state;
        return this;
    }
    public FillCreateAnAccount usingPostalCode (String postalCode){
        this.postalCode = postalCode;
        return this;
    }
    public FillCreateAnAccount usingCountry (String country){
        this.country = country;
        return this;
    }
    public FillCreateAnAccount usingPhone (String phone){
        this.phone = phone;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(EMAIL_ADRESS),
                Enter.theValue(email).into(EMAIL_ADRESS),

                Scroll.to(BUTTON_CREATE),
                Click.on(BUTTON_CREATE),

                Scroll.to(FIRST_NAME),
                Enter.theValue(firstName).into(FIRST_NAME),

                Scroll.to(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(ADRESS),
                Enter.theValue(adress).into(ADRESS),

                Scroll.to(CITY),
                Enter.theValue(city).into(CITY),

                Scroll.to(STATE),
                SelectFromOptions.byVisibleText("Alaska").from(STATE),

                Scroll.to(ZIP_POSTAL_CODE),
                Enter.theValue(postalCode).into(ZIP_POSTAL_CODE),

                Scroll.to(PHONE),
                Enter.theValue(phone).into(PHONE),

                Scroll.to(REGISTER_BUTTON),
                Click.on(REGISTER_BUTTON)

        );

    }
    public static FillCreateAnAccount fillCreateAnAccount(){ return new FillCreateAnAccount();}
}
