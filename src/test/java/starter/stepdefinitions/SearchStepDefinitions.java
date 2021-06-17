package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SearchPage;

import static org.junit.Assert.assertEquals;

public class SearchStepDefinitions {

    @Steps
    SearchPage searchPage;

    @Given("I am on the homepage of the desidutchstore")
    public void iAmOnTheHomepageOfTheDesidutchstore() {
        searchPage.open();
    }

    @When("I search for collection of {string}")
    public void iSearchForCollectionOf(String collectionInput) {
        searchPage.searchCollection(collectionInput);
    }

    @Then("I should see {string}")
    public void iShouldSee(String collectionResult) {
        assertEquals(collectionResult, searchPage.getCollectionTitle());
    }

    @When("I search for category of {string}")
    public void iSearchForCategoryOf(String categoryInput) {
        searchPage.searchCategory(categoryInput);
        
    }

    @Then("I should see items for {string}")
    public void iShouldSeeItemsFor(String categoryResult) {
        assertEquals(categoryResult, searchPage.getCollectionTitle());
    }
}
