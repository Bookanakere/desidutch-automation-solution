package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.LoginSteps;
import starter.steps.ValidateOrderSteps;

public class ValidateOrderDetailsStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Steps
    ValidateOrderSteps validateOrderSteps;

    @Given("User is logged in to the application with valid credentials {string} and {string}")
    public void userIsLoggedInToTheApplicationWithValidCredentialsAnd(String email, String password) {
        loginSteps.goToLoginPage();
        loginSteps.setCredentials(email, password);
        loginSteps.login();

    }

    @When("user visits my orders page")
    public void userVisitsMyOrdersPage() {
        validateOrderSteps.goToMyOrdersPage();
    }


    @Then("following order details should be present {string}")
    public void followingOrderDetailsShouldBePresent(String orderDetails) {
        validateOrderSteps.verifyOrderDetails(orderDetails);

    }
}
