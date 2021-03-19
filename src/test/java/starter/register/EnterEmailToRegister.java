package starter.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterEmailToRegister implements Task {

    private final String email;


    public EnterEmailToRegister(String email){
        this.email = email;
    }

    public static Performable typing(String email) {
        return instrumented(EnterEmailToRegister.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginRegisterForm.EMAIL_FIELD),
                Click.on(LoginRegisterForm.CREATE_ACCOUNT_FORM),
                Click.on(LoginRegisterForm.CREATE_ACCOUNT_BUTTON)
        );

    }
}
