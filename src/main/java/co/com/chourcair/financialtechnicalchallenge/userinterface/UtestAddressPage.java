package co.com.chourcair.financialtechnicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAddressPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("where we write the city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("where we write the zip")
            .located(By.id("zip"));

    public static final Target COUNTRY = Target.the("where we arrow the country")
            .located(By.cssSelector("div[name='countryId']"));
    public static final Target SELECT_COUNTRY = Target.the("where we write the country")
            .located(By.cssSelector("input[placeholder='Select a country']"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("go to devices form button ")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
