package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.CheckoutSteps;
import starter.steps.GenericSteps;
import starter.steps.SearchSteps;

public class CheckoutStepDefinitions {

    @Steps
    CheckoutSteps checkoutSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    GenericSteps genericSteps;

    @Given("I am on the {string} section")
    public void iAmOnTheSection(String collectionInput) {
        searchSteps.searchCollection(collectionInput);
    }

    @When("I add {string} to the cart")
    public void iAddToTheCart(String productInput) {
        checkoutSteps.addToCart(productInput);
    }

    @And("checkout")
    public void checkout() {
        checkoutSteps.goToCart();
        checkoutSteps.checkout();
    }

    @Then("I should be taken to the information page")
    public void iShouldBeTakenToTheInformationPage() {
        checkoutSteps.verifyPageHeader();
    }
}
