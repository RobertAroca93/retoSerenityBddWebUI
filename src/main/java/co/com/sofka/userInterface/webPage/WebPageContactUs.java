package co.com.sofka.userInterface.webPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebPageContactUs extends PageObject {

    public static final Target SUBJECT_HEADING = Target
            .the("Subject Heading")
            .located(By.id("id_contact"));

    public static final Target EMAIL_CONTACT = Target
            .the("Email Adress")
            .located(By.id("email"));

    public static final Target ORDER_REFERENCE = Target
            .the("Order Reference")
            .located(By.id("id_order"));

    public static final Target MESSAGE = Target
            .the("Message")
            .located(By.id("message"));

    public static final Target BUTTON_SEND = Target
            .the("Button Send Message")
            .located(By.xpath("//*[@id=\"submitMessage\"]/span"));


    public static final Target MESAGGE_OK = Target
            .the("Message Send")
            .located(By.xpath("//*[@id=\"center_column\"]/p"));

    public static final Target CONTACT_FAILED = Target
            .the("Contact Failed")
            .located(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));

}

