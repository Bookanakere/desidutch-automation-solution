package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class InformationPage extends PageObject {

    @FindBy(id="main-header")
    WebElement contactInformation;

    public String getContactInformationText(){

        waitFor(contactInformation);
        return contactInformation.getText();
    }
}
