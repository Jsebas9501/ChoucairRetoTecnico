package co.com.chourcair.financialtechnicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicesPage extends PageObject {
    public static final Target COMPUTER = Target.the("Computer").located(By.cssSelector("div[name='osId'] > div[placeholder='Select OS'] > span.btn-default"));
    public static final Target SELECT_COMPUTER = Target.the("Select your computer").located(By.cssSelector("div[name='osId'] > input[placeholder='Select OS']"));
    public static final Target VERSION = Target.the("Version").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']// span[.='Select a Version']"));
    public static final Target SELECT_VERSION = Target.the("Select version").located(By.cssSelector("input[placeholder='Select a Version']"));
    public static final Target LANGUAGE = Target.the("Language").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle'] // span[.='Select OS language']"));
    public static final Target SELECT_LANGUAGE = Target.the("Select language").located(By.cssSelector("input[placeholder='Select OS language']"));

    public static final Target CELL_PHONE = Target.the("Your mobile device").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle'] // span[.='Select Brand']"));
    public static final Target SELECT_CELL_PHONE = Target.the("Select mobile device").locatedBy("//div[.='{0}']");
    public static final Target MODEL = Target.the("Model").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle'] // span[.='Select a Model']"));
    public static final Target SELECT_MODEL = Target.the("Select model").locatedBy("//div[.='{0}']");
    public static final Target SYSTEM = Target.the("Operating System").located(By.cssSelector("div[name='handsetOSId'] > div[placeholder='Select OS'] > span.btn-default"));
    public static final Target SELECT_SYSTEM = Target.the("Select OS").locatedBy("//div[.='{0}']");
    public static final Target LAST_STEP_BUTTON = Target.the("Last Step Button").located(By.xpath("//a[@class='btn btn-blue pull-right']// span[.='Next: Last Step']"));
}
