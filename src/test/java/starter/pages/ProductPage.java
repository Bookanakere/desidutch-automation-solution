package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

    @FindBy(xpath = "//h1[contains(@class,'collection__title')]")
    private WebElement collectionTitle;

    @FindBy(xpath="//a[@href = '/cart']")
    WebElement cart;

    @FindBy(xpath="//button[@name = 'checkout']")
    WebElement checkout;

    public String getCollectionTitle() {
        return collectionTitle.getAttribute("innerHTML");
    }

    public void addToCart(String productInput){
        getDriver().findElement(By.xpath("//a[contains(text(),'"+productInput+"')]//./..//./..//form[@action = '/cart/add']//button[@data-action='add-to-cart']")).click();
    }

    public void goToCart(){
        cart.click();
    }

    public void checkout(){
        checkout.click();
    }
}
