package co.com.sofka.userInterface.webPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebPageCreateAnAccount extends PageObject {

    public static final Target EMAIL_ADRESS = Target
            .the("Enter email")
            .located(By.id("email_create"));

    public static final Target BUTTON_CREATE = Target
            .the("Create an account")
            .located(By.id("SubmitCreate"));

    //For fill elements

    public static final Target TITTLE = Target
            .the("Mr.")
            .located(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]/label"));

    public static final Target FIRST_NAME = Target
            .the("First Name")
            .located(By.id("customer_firstname"));

    public static final Target LAST_NAME = Target
            .the("Last Name")
            .located(By.name("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(By.id("passwd"));

    public static final Target ADRESS = Target
            .the("Adress1")
            .located(By.id("address1"));

    public static final Target CITY = Target
            .the("City")
            .located(By.id("city"));

    public static final Target STATE = Target
            .the("State")
            .located(By.id("id_state"));

    public static final Target ZIP_POSTAL_CODE = Target
            .the("Postal Code")
            .located(By.id("postcode"));

    public static final Target COUNTRY = Target
            .the("COuntry")
            .located(By.id("id_country"));

    public static final Target PHONE = Target
            .the("Phone")
            .located(By.id("phone"));

    public static final Target REGISTER_BUTTON = Target
            .the("Register Button")
            .located(By.id("submitAccount"));

    public static final Target ACCOUNT_VALIDATION = Target
            .the("My account")
            .located(By.xpath("//*[@id=\"center_column\"]/p"));










}
