package starter.steps;

import com.ibm.icu.text.BidiTransform;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import starter.dataclass.OrderTableData;
import starter.pages.MyOrdersPage;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidateOrderSteps {

    MyOrdersPage myOrdersPage;
    OrderTableData orderTableData;
    List<OrderTableData> orderTableDataCollection = new ArrayList<>();

    @Step("Go to my orders page")
    public void goToMyOrdersPage() {
        myOrdersPage.goToMyOrdersPage();
    }


    @Step("Verify order details")
    public void verifyOrderDetails(String orderDetails) {
        assertEquals(orderDetails, myOrdersPage.getFirstOrder());
    }


    @Step("Get order table data content into a list of data objects")
    public List<OrderTableData> getOrderTableDataInfoIntoListOfObjects() {
        List<WebElement> orderTableContent = myOrdersPage.getOrderTableContent();
        System.out.println(orderTableContent.size());
        System.out.println(orderTableContent.get(7).getText());
        for (WebElement orderRow : orderTableContent) {
            orderTableData = new OrderTableData();
            orderTableData.setOrder(orderRow.findElement(By.xpath(".//td[count(//div[@class='table-wrapper']/table/thead/tr/th[text()='Order']/preceding-sibling::th)+1]")).getText());
            orderTableData.setDate(orderRow.findElement(By.xpath(".//td[count(//div[@class='table-wrapper']/table/thead/tr/th[text()='Date']/preceding-sibling::th)+1]")).getText());
            orderTableData.setPaymentStatus(orderRow.findElement(By.xpath(".//td[count(//div[@class='table-wrapper']/table/thead/tr/th[text()='Payment status']/preceding-sibling::th)+1]")).getText());
            orderTableData.setFulfillmentStatus(orderRow.findElement(By.xpath(".//td[count(//div[@class='table-wrapper']/table/thead/tr/th[text()='Fulfillment status']/preceding-sibling::th)+1]")).getText());
            orderTableData.setTotal(orderRow.findElement(By.xpath(".//td[count(//div[@class='table-wrapper']/table/thead/tr/th[text()='Total']/preceding-sibling::th)+1]")).getText());
            orderTableDataCollection.add(orderTableData);
        }
        System.out.println(orderTableDataCollection.size());
        System.out.println(orderTableDataCollection.get(7));
        return orderTableDataCollection;
    }

    @Step("Verify if the input data is present in the list of data objects")
    public void verifyThatTheInputDataListIsPresentInTheListOfDataObjects(List<OrderTableData> orderTableDataInput, List<OrderTableData> orderTableDataCollection) {
        assertTrue(orderTableDataCollection.contains(orderTableDataInput));
    }







    public void testMethod1() {
        List<WebElement> orderTableContent = myOrdersPage.getOrderTableContent();
        for (WebElement orderRow : orderTableContent) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(orderRow.findElement(By.xpath(".//td[" + i + "]")).getText());
            }
        }
    }

    public void testMethod2() {
        List<WebElement> orderTableContent = myOrdersPage.getOrderTableContent();
        for (WebElement orderRow : orderTableContent) {
            List<WebElement> orderRowContent = orderRow.findElements(By.xpath(".//td"));
            for (WebElement orderColumn : orderRowContent) {
                System.out.println(orderColumn.getText());

            }
        }
    }

}







