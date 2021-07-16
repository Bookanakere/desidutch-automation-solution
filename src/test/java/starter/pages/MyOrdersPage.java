package starter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyOrdersPage extends PageObject {

    @FindBy(xpath="//*[@id=\"main\"]/section/div/div[2]/div[1]/div[1]/div/div/a[1]")
    WebElement myOrders;

    @FindBy(xpath="//div[@class='table-wrapper']/table/tbody/tr[1]")
    WebElement orderRow1;

    public void goToMyOrdersPage(){
         myOrders.click();
    }

    public String getFirstOrder(){
       return orderRow1.getText();
    }



}
