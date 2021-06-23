package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(className ="cc-allow")
    WebElement cookie;

    public void acceptCookie(){
        cookie.click();
    }

}
