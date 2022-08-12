package co.com.chourcair.financialtechnicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class UtestPage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON = Target.the("Join Today button")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target TEXT_CONFIRM = Target.the("Text confirm")
            .located(By.cssSelector("div.image-box-header > h1"));

}
