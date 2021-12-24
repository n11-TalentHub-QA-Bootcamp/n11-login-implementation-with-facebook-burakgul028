package starter.n11seller.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SignUpPageElements {
    public static Target USERNAME_FIELD = Target.the("username textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("passwordInputText"));
    public static Target PASSWORD_RETYPE_FIELD = Target.the("pass retype textbox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target EMAIL_RETYPE_FIELD = Target.the("email Retype textbox").located(By.id("emailRetypeInputText"));
    public static Target SHOP_NAME_FIELD = Target.the("shop name textbox").located(By.id("nicknameInputText"));
    //public static Target SIGNUP_BTN = Target.the("signup btn").located(By.id("loginCommandButton"));

}
