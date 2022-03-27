package co.com.sofka.userInterface.webPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebPageHome extends PageObject {

    public static final Target SIGN_IN = Target
            .the("Sign In")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

    public static final Target CONTACT_US = Target
            .the("Contact")
            .located(By.xpath("//*[@id=\"contact-link\"]/a"));
}
