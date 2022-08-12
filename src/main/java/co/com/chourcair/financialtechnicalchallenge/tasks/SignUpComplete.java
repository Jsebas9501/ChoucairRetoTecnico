package co.com.chourcair.financialtechnicalchallenge.tasks;

import co.com.chourcair.financialtechnicalchallenge.model.UtestDataComplete;
import co.com.chourcair.financialtechnicalchallenge.userinterface.UtestCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class SignUpComplete implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public SignUpComplete(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static SignUpComplete formComplete(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(SignUpComplete.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UtestCompletePage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestCompletePage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestCompletePage.CHECKBOX_02),
                Click.on(UtestCompletePage.CHECKBOX_03),
                Click.on(UtestCompletePage.END_BUTTON)
        );
    }
}
