package starter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class MyOrdersPage extends PageObject {

    @FindBy(xpath="//*[@id=\"main\"]//a[@href='/account']")
    WebElement myOrders;

    @FindBy(xpath="//div[@class='table-wrapper']/table/tbody/tr[1]")
    WebElement orderRow1;

    public void goToMyOrdersPage(){
         myOrders.click();
    }

    public String getFirstOrder(){
       return orderRow1.getText();
    }

    public List<WebElement> getOrderTableContent(){
        return getDriver().findElements(By.xpath("//div[@class='table-wrapper']/table/tbody/tr"));
    }

}
