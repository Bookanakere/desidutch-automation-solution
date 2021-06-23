package starter.steps;


import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

public class GenericSteps {

    private HomePage homePage;


    @Step("Go to homepage of desidutchstore")
    public void openHomePage(){
        homePage.open();
       //use below line only while running on saucelabs
        //homePage.acceptCookie();
    }
}
