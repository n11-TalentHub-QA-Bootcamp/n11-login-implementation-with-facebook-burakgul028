package starter.n11seller.navigation.signup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import starter.n11seller.navigation.user_interface.n11SellerOfficeHomePageElements;
import starter.n11seller.navigation.user_interface.n11SignUpPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginSignUp implements Task {

    private final String username_text;
    private final String password_text;
    private final String retype_password_text;
    private final String email_text;
    private final String retype_email_text;
    private final String shopname_text;


    @Step("{0} Login with user name '#username_text', mail '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11SellerOfficeHomePageElements.SIGNUP_LINK),
                WaitUntil.the(n11SignUpPageElements.USERNAME_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(n11SignUpPageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(n11SignUpPageElements.USERNAME_FIELD),
                WaitUntil.the(n11SignUpPageElements.PASSWORD_FIELD,isClickable()).forNoMoreThan(3).seconds(),
                Click.on(n11SignUpPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SignUpPageElements.PASSWORD_FIELD),
                WaitUntil.the(n11SignUpPageElements.PASSWORD_RETYPE_FIELD,isClickable()).forNoMoreThan(3).seconds(),
                Click.on(n11SignUpPageElements.PASSWORD_RETYPE_FIELD),
                SendKeys.of(this.retype_password_text).into(n11SignUpPageElements.PASSWORD_RETYPE_FIELD),
                WaitUntil.the(n11SignUpPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(3).seconds(),
                Click.on(n11SignUpPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SignUpPageElements.EMAIL_FIELD),
                WaitUntil.the(n11SignUpPageElements.EMAIL_RETYPE_FIELD,isClickable()).forNoMoreThan(3).seconds(),
                Click.on(n11SignUpPageElements.EMAIL_RETYPE_FIELD),
                SendKeys.of(this.retype_email_text).into(n11SignUpPageElements.EMAIL_RETYPE_FIELD),
                Click.on(n11SignUpPageElements.SHOP_NAME_FIELD),
                SendKeys.of(this.shopname_text).into(n11SignUpPageElements.SHOP_NAME_FIELD)
        );



    }

    public LoginSignUp(String username_text,
                       String password_text,
                       String retype_password_text,
                       String email_text,
                       String retype_email_text,
                       String shopname_text){
        this.username_text = username_text;
        this.password_text = password_text;
        this.retype_password_text = retype_password_text;
        this.email_text = email_text;
        this.retype_email_text = retype_email_text;
        this.shopname_text = shopname_text;

    }



    public static LoginSignUp loginThePage(String username_text,
                                           String password_text,
                                           String retype_password_text,
                                           String email_text,
                                           String retype_email_text,
                                           String shopname_text) {
        return instrumented(LoginSignUp.class,
                username_text,retype_password_text,password_text,email_text,retype_email_text,shopname_text);
    }

}
