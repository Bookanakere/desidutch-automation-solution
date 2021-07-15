package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.MyAccountPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CreateAccountSteps {

    private MyAccountPage myAccountPage;

    @Step("Go to create my account page")
    public void goToCreateMyAccountPage(){
        myAccountPage.goToCreateMyAccountPage();
    }

    @Step("Fill in customer information")
    public void setCustomerInformation(Map<String, String> customerInfoData){
        myAccountPage.setCustomerFirstName(customerInfoData.get("firstName"));
        myAccountPage.setCustomerLastName(customerInfoData.get("lastName"));
        myAccountPage.setCustomerEmail(customerInfoData.get("email"));
        myAccountPage.setCustomerPassword(customerInfoData.get("password"));
    }

    @Step ("Submit form to create account")
    public void submitFormToCreateAccount(){
        myAccountPage.clickOnCreateMyAccount();
    }

    @Step("Verify login greetings title")
    public void verifyLoginGreetingsTitle(String title){
        assertEquals("Hello "+title+"", myAccountPage.getLoginGreetingsText());

    }

}
