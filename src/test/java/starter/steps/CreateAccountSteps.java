package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.MyAccountPage;
import static org.junit.Assert.assertEquals;

public class CreateAccountSteps {

    private MyAccountPage myAccountPage;

    @Step("Go to create my account page")
    public void goToCreateMyAccountPage(){
        myAccountPage.goToCreateMyAccountPage();
    }

    @Step("Fill in customer information")
    public void setCustomerInformation(){
        myAccountPage.setCustomerFirstName("Tom");
        myAccountPage.setCustomerLastName("Jansen");
        myAccountPage.setCustomerEmail("tom.jansen@hotmail.com");
        myAccountPage.setCustomerPassword("password");
    }

    @Step ("Submit form to create account")
    public void submitFormToCreateAccount(){
        myAccountPage.clickOnCreateMyAccount();
    }

    @Step("Verify login greetings title")
    public void verifyLoginGreetingsTitle(){
        assertEquals(myAccountPage.getLoginGreetingsText(), "Hello Tom");

    }

}
