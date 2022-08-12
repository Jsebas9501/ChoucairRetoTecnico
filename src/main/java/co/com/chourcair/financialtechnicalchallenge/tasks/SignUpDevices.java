package co.com.chourcair.financialtechnicalchallenge.tasks;

import co.com.chourcair.financialtechnicalchallenge.model.UtestDataDevices;
import co.com.chourcair.financialtechnicalchallenge.userinterface.UtestDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class SignUpDevices implements Task {
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strCellPhone;
    private String strModel;
    private String strSystem;

    public SignUpDevices(String strComputer, String strVersion, String strLanguage, String strCellPhone, String strModel, String strSystem) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strCellPhone = strCellPhone;
        this.strModel = strModel;
        this.strSystem = strSystem;
    }

    public static SignUpDevices formDevices(String strComputer, String strVersion, String strLanguage, String strCellPhone, String strModel, String strSystem) {
        return Tasks.instrumented(SignUpDevices.class, strComputer, strVersion, strLanguage, strCellPhone, strModel, strSystem);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestDevicesPage.COMPUTER),
                Enter.theValue(strComputer).into(UtestDevicesPage.SELECT_COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.VERSION),
                Enter.theValue(strVersion).into(UtestDevicesPage.SELECT_VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.LANGUAGE),
                Enter.theValue(strLanguage).into(UtestDevicesPage.SELECT_LANGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.CELL_PHONE),
                Enter.theValue(strCellPhone).into(UtestDevicesPage.SELECT_CELL_PHONE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.MODEL),
                Enter.theValue(strModel).into(UtestDevicesPage.SELECT_MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.SYSTEM),
                Enter.theValue(strSystem).into(UtestDevicesPage.SELECT_SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.LAST_STEP_BUTTON)
        );
    }
}
