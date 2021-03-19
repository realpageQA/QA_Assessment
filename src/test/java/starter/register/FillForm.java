package starter.register;

import models.DataForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FillForm implements Task {

    DataForm DataFillForm;

    public FillForm(List<String> dataToFillForm) {
        this.DataFillForm= new DataForm(dataToFillForm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterForm.TITLE_RADIOBUTTON),
                Enter.theValue(DataFillForm.getFristName()).into(RegisterForm.FIRST_NAME_FIELD),
                Enter.theValue(DataFillForm.getLastName()).into(RegisterForm.LAST_NAME_FIELD),
                Enter.theValue(DataFillForm.getPassword()).into(RegisterForm.PASSWORD_FIELD),
                Click.on(RegisterForm.DAY_LIST),
                Click.on(RegisterForm.MONTH_LIST),
                Click.on(RegisterForm.YEAR_LIST),
                Click.on(RegisterForm.NEWSLETTER_FIELD),
                Click.on(RegisterForm.OFFERS_FIELD),
                Enter.theValue(DataFillForm.getCompany()).into(RegisterForm.COMPANY_FIELD),
                Enter.theValue(DataFillForm.getAddress()).into(RegisterForm.ADDRESS_FIELD),
                Enter.theValue(DataFillForm.getAddress2()).into(RegisterForm.ADDRESS_LINE_FIELD),
                Enter.theValue(DataFillForm.getCity()).into(RegisterForm.CITY_FIELD),
                Click.on(RegisterForm.STATE_LIST),
                Enter.theValue(DataFillForm.getZip()).into(RegisterForm.ZIP_FIELD),
                Enter.theValue(DataFillForm.getInformation()).into(RegisterForm.INFORMATION_FIELD),
                Enter.theValue(DataFillForm.getPhone()).into(RegisterForm.PHONE_FIELD),
                Enter.theValue(DataFillForm.getMobilePhone()).into(RegisterForm.PHONE_MOBILE_FIELD),
                Enter.theValue(DataFillForm.getAlias()).into(RegisterForm.ALIAS_FIELD));
    }


    public static FillForm withTheData(List<String>form) {
        return new FillForm(form);
    }
}
