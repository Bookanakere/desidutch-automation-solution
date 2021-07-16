package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.MyOrdersPage;
import static org.junit.Assert.assertEquals;

public class ValidateOrderSteps {

    MyOrdersPage myOrdersPage;

    @Step("Go to my orders page")
    public void goToMyOrdersPage(){
        myOrdersPage.goToMyOrdersPage();
    }


    @Step("Verify order details")
    public void verifyOrderDetails(String orderDetails){
       assertEquals(orderDetails, myOrdersPage.getFirstOrder());
    }

}
