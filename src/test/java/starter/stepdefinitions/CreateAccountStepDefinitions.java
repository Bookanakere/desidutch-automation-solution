package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.CreateAccountSteps;


public class CreateAccountStepDefinitions {


    @Steps
    CreateAccountSteps createAccountSteps;


    @Given("I am on the create my account page")
    public void iAmOnTheCreateMyAccountPage() {
        createAccountSteps.goToCreateMyAccountPage();

    }

    @When("I fill in required information")
    public void iFillInRequiredInformation() {
        createAccountSteps.setCustomerInformation();
        createAccountSteps.submitFormToCreateAccount();
    }

    @Then("my account should be created")
    public void myAccountShouldBeCreated() {
        createAccountSteps.verifyLoginGreetingsTitle();
    }
}
