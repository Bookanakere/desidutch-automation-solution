package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.MyAccountPage;

public class LoginSteps {

    private MyAccountPage myAccountPage;

    @Step("Go to Login page")
    public void goToLoginPage(){
        myAccountPage.goToLoginPage();
    }

    @Step("Enter valid credentials email and password")
    public void setCredentials(String email, String password){
        myAccountPage.setEmail(email);
        myAccountPage.setPassword(password);
    }

    @Step("Click on Login")
    public  void login(){
        myAccountPage.clickLogin();
    }
}
