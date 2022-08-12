package co.com.chourcair.financialtechnicalchallenge.tasks;

import co.com.chourcair.financialtechnicalchallenge.model.UtestDataAddress;
import co.com.chourcair.financialtechnicalchallenge.model.UtestDataPersonal;
import co.com.chourcair.financialtechnicalchallenge.userinterface.UtestAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class SignUpAddress implements Task {

    private String strCity;
    private String strZip;
    private String strCountry;

    public SignUpAddress(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }
    public static SignUpAddress formAddress(String strCity, String strZip, String strCountry) {
        return Tasks.instrumented(SignUpAddress.class, strCity, strZip, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strCity).into(UtestAddressPage.INPUT_CITY),
                Enter.theValue(strZip).into(UtestAddressPage.INPUT_ZIP),
                Click.on(UtestAddressPage.COUNTRY),
                Enter.theValue(strCountry).into(UtestAddressPage.SELECT_COUNTRY),
                Click.on(UtestAddressPage.NEXT_DEVICES_BUTTON)
        );
    }
}
