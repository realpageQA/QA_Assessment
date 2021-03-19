package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterPassword implements Task {

    private final String password;


    public EnterPassword(String password){
        this.password = password;
    }

    public static Performable typing(String password) {
        return instrumented(EnterPassword.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD)
        );
    }
}
