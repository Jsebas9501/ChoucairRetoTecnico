package co.com.chourcair.financialtechnicalchallenge.tasks;


import co.com.chourcair.financialtechnicalchallenge.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickRegister implements Task {

    public static ClickRegister theButton() {
        return Tasks.instrumented(ClickRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPage.JOIN_TODAY_BUTTON)
        );
    }
}
