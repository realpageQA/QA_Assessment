package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.ClickOnButton;
import starter.login.EnterEmail;
import starter.login.EnterPassword;
import starter.myaccount.MyAccountData;
import starter.navigation.NavigateTo;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has a valid account")
    public void has_a_valid_account(String user) {
        this.name = user;
        theActorCalled(this.name).attemptsTo(
                NavigateTo.thePracticeHomePage()
        );
    }

    @When("when user clicks on sign in")
    public void when_user_clicks_on_sign_in() {
        theActorInTheSpotlight().attemptsTo(
            NavigateTo.theLoginPage()
        );
    }

    @And("enters (.*) as email")
    public void enters_email(String email) {
        theActorInTheSpotlight().attemptsTo(
                EnterEmail.typing(email)
        );
    }

    @And("enters (.*) as password")
    public void enters_password(String password) {
        theActorInTheSpotlight().attemptsTo(
                EnterPassword.typing(password)
        );
    }

    @And("clicks sign in")
    public void clicks_sign_in() {
        theActorInTheSpotlight().attemptsTo(
                ClickOnButton.login()
        );
    }

    @Then("the user is successfully logged in")
    public void the_user_is_successfully_logged_in() {
        theActorInTheSpotlight().should(
                seeThat("The profile name",MyAccountData.currentProfileName(),equalTo("name last name"))
        );
    }

}
