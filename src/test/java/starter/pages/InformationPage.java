package starter.pages;

import net.thucydides.core.pages.PageObject;

public class InformationPage extends PageObject {

    public String getInformationPageTitle(){
        return getDriver().getTitle();
    }
}
