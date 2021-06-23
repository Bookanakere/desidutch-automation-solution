package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.GenericSteps;
import starter.steps.SearchSteps;

import static org.junit.Assert.assertEquals;

public class SearchStepDefinitions {

    @Steps
    SearchSteps searchSteps;

    @Steps
    GenericSteps genericSteps;

    @Before
    public void openTheApplication(){
        genericSteps.openHomePage();
    }

    @Given("I am on the homepage of the desidutchstore")
    public void iAmOnTheHomepageOfTheDesidutchstore() {
    }

    @When("I search for collection of {string}")
    public void iSearchForCollectionOf(String collectionInput) {
        searchSteps.searchCollection(collectionInput);
    }

    @Then("I should see {string}")
    public void iShouldSee(String collectionResult) {
        searchSteps.verifyTitleForSearchCollectionResult(collectionResult);
    }

    @When("I search for category of {string}")
    public void iSearchForCategoryOf(String categoryInput) {
        searchSteps.searchCategory(categoryInput);
    }

    @Then("I should see items for {string}")
    public void iShouldSeeItemsFor(String collectionResult) {
        searchSteps.verifyTitleForSearchCategoryResult(collectionResult);
    }
}
