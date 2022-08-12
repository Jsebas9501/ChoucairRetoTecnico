package co.com.chourcair.financialtechnicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestCompletePage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("where we write the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where we write the confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_02 = Target.the("where we confirm checkbox 2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECKBOX_03 = Target.the("where we confirm checkbox 3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target END_BUTTON = Target.the("where we confirm register")
            .located(By.id("laddaBtn"));
}
