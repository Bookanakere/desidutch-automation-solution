package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.InformationPage;
import starter.pages.ProductPage;

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
    public String verifyPageTitle(){
       return informationPage.getInformationPageTitle();
    }

}
