package co.com.chourcair.financialtechnicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPersonalPage extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("where we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where we write the last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where we write the email")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("where we select the month of birth")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("where we select the day of birth")
            .located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("where we select the year of birth")
            .located(By.id("birthYear"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("go to location form button ")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}