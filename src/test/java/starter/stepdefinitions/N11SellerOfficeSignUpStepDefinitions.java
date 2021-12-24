package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11seller.navigation.signup.LoginSignUp;
import starter.n11seller.navigation.tasks.NavigateTo;



public class N11SellerOfficeSignUpStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the login page")
    public void userLaunchBrowserAndOpenTheMainPage() {

        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11SellerOfficeHomePage());


    }

    @When("user signed in selleroffice with valid credentials")
    public void userSignedInSellerofficeWithValidCredentials() {
        actor.attemptsTo(LoginSignUp.loginThePage(
                "n11sellerburak",
                "n11bootcamp1234",
                "n11bootcamp1234",
                "n11bootcamp.burak@gmail.com",
                "n11bootcamp.burak@gmail.com",
                "N11SellerBurak"));

    }

    @Then("user signed in seller" +
            "office successfully")
    public void userSignedInSellerofficeSuccessfully() {
    }
}