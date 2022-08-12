package co.com.chourcair.financialtechnicalchallenge.questions;

import co.com.chourcair.financialtechnicalchallenge.userinterface.UtestCompletePage;
import co.com.chourcair.financialtechnicalchallenge.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.rest.interactions.Ensure;


public class ShouldSeeText implements Question<Boolean> {

    private String text = "Welcome to the world's largest community of freelance software testers!";

    public ShouldSeeText(String text) {
        this.text = text;
    }

    public static ShouldSeeText Text(String text){
        return new ShouldSeeText(text);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textConfirm = Text.of(UtestPage.TEXT_CONFIRM).viewedBy(actor).asString();
        Boolean resp = false;

        if (textConfirm == text){
            resp = true;
        }
        return resp;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
