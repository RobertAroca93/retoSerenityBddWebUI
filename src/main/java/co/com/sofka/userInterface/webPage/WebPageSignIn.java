package co.com.sofka.userInterface.webPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebPageSignIn extends PageObject {

    public static final Target EMAIL_SIGNIN = Target
            .the("Email")
            .located(By.id("email"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(By.id("passwd"));

    public static final Target BUTTON_SIGNIN = Target
            .the("Login")
            .located(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
//*[@id="login_form"]/div/p[2]

    public static final Target LOGIN_VALIDATION = Target
            .the("MY ACCOUNT")
            .located(By.xpath("//*[@id=\"center_column\"]/p"));

    public static final Target LOGIN_ERROR = Target
            .the("Login Failed")
            .located(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));

}
