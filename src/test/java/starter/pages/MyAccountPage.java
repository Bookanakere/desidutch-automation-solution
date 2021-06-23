package starter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends PageObject {

    @FindBy(className = "header__action-item-content")
    WebElement myAccount;

    @FindBy(xpath ="//button[contains(text(),'Create your account')]")
    WebElement createYourAccount;

    @FindBy(id="customer[first_name]")
    WebElement customerFirstName;

    @FindBy(id="customer[last_name]")
    WebElement customerLastName;

    @FindBy(id="register-customer[email]")
    WebElement customerEmail;

    @FindBy(id="register-customer[password]")
    WebElement customerPassword;

    @FindBy(xpath ="//button[contains(text(),'Create my account']")
    WebElement createMyAccount;

    @FindBy(className = "header__action-item-title")
    WebElement loginGreetings;


    public void goToCreateMyAccountPage(){
        myAccount.click();
        createYourAccount.click();
    }

    public void setCustomerFirstName(String customerFirstName){
        this.customerFirstName.sendKeys(customerFirstName);
    }

    public void setCustomerLastName(String customerLastName){
        this.customerLastName.sendKeys(customerLastName);
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail.sendKeys(customerEmail);
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword.sendKeys(customerPassword);
    }

    public void clickOnCreateMyAccount(){
        createMyAccount.click();
    }

    public String getLoginGreetingsText(){
        return loginGreetings.getText();
    }
}
