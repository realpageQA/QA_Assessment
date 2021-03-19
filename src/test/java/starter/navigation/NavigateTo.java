package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable thePracticeHomePage() {
        return Task.where("{0} opens the home page",
                Open.browserOn().the(PracticeHomePage.class)
        );
    }

    public static Performable theLoginPage() {
        return Task.where("{0} clicks on sign in",
                Click.on(NavigationForm.SIGN_IN_BUTTON)
        );
    }
}