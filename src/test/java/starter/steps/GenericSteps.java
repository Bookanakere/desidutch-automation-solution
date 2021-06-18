package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

public class GenericSteps {

    private HomePage homePage;

    @Step
    public void openHomePage(){
        homePage.open();
    }
}
