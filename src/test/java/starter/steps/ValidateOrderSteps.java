package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.MyOrdersPage;

public class ValidateOrderSteps {

    MyOrdersPage myOrdersPage;

    @Step("Go to my orders page")
    public void goToMyOrdersPage(){
        myOrdersPage.goToMyOrdersPage();
    }

}
