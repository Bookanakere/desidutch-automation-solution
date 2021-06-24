package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.InformationPage;
import starter.pages.ProductPage;
import static org.junit.Assert.assertEquals;

public class CheckoutSteps {

    ProductPage productPage;
    InformationPage informationPage;

    @Step("Add product to cart")
    public void addToCart(String productInput){
        productPage.addToCart(productInput);
    }

    @Step("Go to cart")
    public void goToCart(){
        productPage.goToCart();
    }

    @Step("Checkout")
    public void checkout(){
        productPage.checkout();
    }

    @Step("Verify page title")
    public void verifyPageTitle(){
       assertEquals("Information - DesiDutchStore - Checkout",informationPage.getInformationPageTitle());
    }

}
