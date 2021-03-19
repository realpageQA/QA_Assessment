package starter.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.login.ClickOnButton;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PerformClickOn implements Task {
    public static Performable createAccount() {
        return instrumented(ClickOnButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginRegisterForm.CREATE_ACCOUNT_FORM),
                Click.on(LoginRegisterForm.CREATE_ACCOUNT_BUTTON)
        );
    }
}
