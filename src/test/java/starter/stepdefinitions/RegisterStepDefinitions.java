package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.DataForm;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.myaccount.MyAccountData;
import starter.navigation.NavigateTo;
import starter.register.ClickOn;
import starter.register.FillForm;
import starter.register.PerformClickOn;
import starter.register.EnterEmailToRegister;
import java.sql.Timestamp;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinitions {
    String user;


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) is on HomePage")
    public void the_user_is_on_HomePage(String user) {
        this.user = user;
        theActorCalled(user).attemptsTo(
                NavigateTo.thePracticeHomePage()
        );
    }

    @When("the user clicks on Sign in")
    public void the_user_clicks_on_Sign_in() {
        theActorInTheSpotlight().attemptsTo(
                NavigateTo.theLoginPage()
        );
    }

    @And("user enters (.*)")
    public void user_enters_email(String email) {
        Timestamp ts=new Timestamp(System.currentTimeMillis());
        email=email+ts.getTime();
        theActorInTheSpotlight().attemptsTo(
                EnterEmailToRegister.typing(email)
        );
    }

    @And("User Clicks create account")
    public void user_Clicks_create_account() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("User fills sign up form")
    public void user_fills_sign_up_form(List<String> form) {
        theActorInTheSpotlight().attemptsTo(FillForm.withTheData(form));
    }

    @And("User clicks register")
    public void user_clicks_register() {
        theActorInTheSpotlight().attemptsTo(ClickOn.register());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("the user is taken my account page")
    public void the_user_is_taken_my_account_page() {
        theActorInTheSpotlight().should(
                seeThat("The profile name", MyAccountData.currentProfileName(),equalTo("name last name"))
        );
    }

}
