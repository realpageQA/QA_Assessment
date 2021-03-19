package starter.myaccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MyAccountData  {
    public static Question<String> currentProfileName() {
        return actor -> TextContent.of(MyAccountOverview.USER_INFO).viewedBy(actor).asString().trim();
    }
}
