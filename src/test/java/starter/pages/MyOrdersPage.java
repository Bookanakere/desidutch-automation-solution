package starter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyOrdersPage extends PageObject {

    @FindBy(xpath="//a[@href='/account/addresses']")
    WebElement myOrders;

    public void goToMyOrdersPage(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myOrders.click();
    }

}
