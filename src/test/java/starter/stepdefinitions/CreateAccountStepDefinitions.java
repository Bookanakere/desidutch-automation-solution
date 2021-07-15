package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.CreateAccountSteps;

import java.util.Map;


public class CreateAccountStepDefinitions {

    Map<String, String> customerInfo;

    @Steps
    CreateAccountSteps createAccountSteps;


    @Given("I am on the create my account page")
    public void iAmOnTheCreateMyAccountPage() {
        createAccountSteps.goToCreateMyAccountPage();

    }

    @When("I fill in required information")
    public void iFillInRequiredInformation(Map<String,String> customerInfoData) {
        customerInfo = customerInfoData;
        createAccountSteps.setCustomerInformation(customerInfoData);
        createAccountSteps.submitFormToCreateAccount();
    }

    @Then("my account should be created")
    public void myAccountShouldBeCreated() {
        createAccountSteps.verifyLoginGreetingsTitle(customerInfo.get("firstName"));
    }
}
