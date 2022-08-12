package co.com.chourcair.financialtechnicalchallenge.stepdefinitions;

import co.com.chourcair.financialtechnicalchallenge.model.UtestDataAddress;
import co.com.chourcair.financialtechnicalchallenge.model.UtestDataComplete;
import co.com.chourcair.financialtechnicalchallenge.model.UtestDataDevices;
import co.com.chourcair.financialtechnicalchallenge.model.UtestDataPersonal;
import co.com.chourcair.financialtechnicalchallenge.questions.ShouldSeeText;
import co.com.chourcair.financialtechnicalchallenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class UserRegistrationStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^the user wants to register on Utest$")
    public void sebastianWantsToRegisterOnUtest() {
        OnStage.theActorCalled("Sebastian").wasAbleTo(OpenUp.thePage());
    }

    @When("^the user clicks button Join Today$")
    public void theUserClicksButtonJoinToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickRegister.theButton());
    }

    @And("^the user completes form 1 with the following data:$")
    public void theUserCompletesForm1WithTheFollowingData(List<UtestDataPersonal> data){
        OnStage.theActorInTheSpotlight().attemptsTo(SignUpPersonal
                .formPersonal(
                        data.get(0).getStrFirstName(),
                        data.get(0).getStrLastName(),
                        data.get(0).getStrEmail(),
                        data.get(0).getStrMonth(),
                        data.get(0).getStrDay(),
                        data.get(0).getStrYear()
                        ));

    }

    @And("^the user completes form 2 with the following data:$")
    public void theUserCompletesForm2WithTheFollowingData(List<UtestDataAddress> data){
        OnStage.theActorInTheSpotlight().attemptsTo(SignUpAddress
                .formAddress(
                        data.get(0).getStrCity(),
                        data.get(0).getStrZip(),
                        data.get(0).getStrCountry()
                ));
    }

    @And("^the user completes form 3 with the following data:$")
    public void theUserCompletesForm3WithTheFollowingData(List<UtestDataDevices> data){
        OnStage.theActorInTheSpotlight().attemptsTo(SignUpDevices
                .formDevices(
                        data.get(0).getStrComputer(),
                        data.get(0).getStrVersion(),
                        data.get(0).getStrLanguage(),
                        data.get(0).getStrCellPhone(),
                        data.get(0).getStrModel(),
                        data.get(0).getStrSystem()
                ));
    }

    @And("^the user completes form final with the following data:$")
    public void theUserCompletesFormFinalWithTheFollowingData(List<UtestDataComplete> data){
        OnStage.theActorInTheSpotlight().attemptsTo(SignUpComplete
                .formComplete(
                        data.get(0).getStrPassword(),
                        data.get(0).getStrConfirmPassword()
                ));
    }

    @Then("^the user should see the text (\"([^\"]*)\")$")
    public void theUserShouldSeeTheText(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(ShouldSeeText.Text(text)));
    }

}

