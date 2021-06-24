package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends PageObject {
    @FindBy(className = "search-bar__input")
    private WebElement searchBar;

    @FindBy(xpath = "//a[@class='search-bar__menu-link']")
    private WebElement collections;

    @FindBy(id = "search-product-type")
    private WebElement searchCategory;

    @FindBy(className = "search-bar__submit")
    private WebElement searchCategorySubmit;

    @FindBy(xpath = "//h1[contains(@class,'collection__title')]")
    private WebElement  collectionTitle;

    public void searchCollection (String collectionInput){
        searchBar.click();
        collections.findElement(By.xpath("//a[contains(text(),'"+collectionInput+"')]")).click();
    }

    public void searchCategory(String categoryInput){
        Select select = new Select(searchCategory);
        select.selectByVisibleText(""+categoryInput+"");
        searchCategorySubmit.click();
    }

    public String getCollectionTitle() {
        waitFor(collectionTitle);
        return collectionTitle.getAttribute("innerHTML");
    }


}
