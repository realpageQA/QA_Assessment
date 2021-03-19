package starter.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.login.ClickOnButton;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Task{

        public static Performable register() {
            return instrumented(ClickOn.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(RegisterForm.REGISTER_BUTTON)
            );
        }
}
