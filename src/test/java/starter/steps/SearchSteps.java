package starter.steps;

import net.thucydides.core.annotations.Step;
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
    }

    @Step("Verify title for search collection result")
    public void verifyTitleForSearchCollectionResult(String collectionResult){
        assertEquals(collectionResult, searchPage.getCollectionTitle());
    }

    @Step("Verify title for search category result")
    public void verifyTitleForSearchCategoryResult(String categoryResult){
        assertEquals("Products for \"" + categoryResult + "\"", searchPage.getCollectionTitle());
    }

}
