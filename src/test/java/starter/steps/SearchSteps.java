package starter.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.pages.SearchPage;

import static org.junit.Assert.assertEquals;

public class SearchSteps {

    private SearchPage searchPage;

    @Step("Search by collection")
    public void searchCollection (String collectionInput){
        searchPage.searchCollection(collectionInput);
    }

    @Step("Search by category")
    public void searchCategory(String categoryInput){
        searchPage.searchCategory(categoryInput);

       /* Select select = new Select(searchCategory);
        select.selectByVisibleText(""+categoryInput+"");
        searchCategorySubmit.click();*/
    }

    @Step("Verify title")
    public void verifyTitle(String collectionResult){
        assertEquals(collectionResult, searchPage.getCollectionTitle());
    }

}
