package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterEmail implements Task {

    private final String email;


    public EnterEmail(String email){
        this.email = email;
    }

    public static Performable typing(String email) {
        return instrumented(EnterEmail.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginForm.EMAIL_FIELD)
        );
    }
}
