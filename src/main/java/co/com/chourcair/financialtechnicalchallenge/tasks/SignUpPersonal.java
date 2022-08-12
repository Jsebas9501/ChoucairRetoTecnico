package co.com.chourcair.financialtechnicalchallenge.tasks;

import co.com.chourcair.financialtechnicalchallenge.model.UtestDataPersonal;
import co.com.chourcair.financialtechnicalchallenge.userinterface.UtestPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class SignUpPersonal implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public SignUpPersonal(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    public static SignUpPersonal formPersonal(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(SignUpPersonal.class, strFirstName, strLastName, strEmail, strMonth, strDay, strYear);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(UtestPersonalPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestPersonalPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestPersonalPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UtestPersonalPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UtestPersonalPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UtestPersonalPage.SELECT_YEAR),
                Click.on(UtestPersonalPage.NEXT_LOCATION_BUTTON)
        );
    }
}