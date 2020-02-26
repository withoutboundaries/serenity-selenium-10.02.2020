package pages;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

//@At("https://www.linkedin.com/search/results/all/?keywords=hr")
public class SearchPage extends PageObject {

    @FindBy(xpath = "//h3[contains(@class,'search-results__total')]")
    private WebElement searchResultsTotal;


    @FindBy(xpath = "//li[contains(@class,'search-result__occluded-item')]")
    private List<WebElement> searchResults;


    public boolean isPageLoaded() {
        try {
            waitFor(ExpectedConditions.visibilityOf(searchResultsTotal));
            return true;
        }
        catch (TimeoutException e){
            return false;
        }

    }

   /* public List<String> getSearchResultsList() {
        List<String> searchResultsList = new ArrayList<String>();
        for (WebElement searchResult : searchResults) {
            searchResultsList.add(searchResult.getText());
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", searchResult);
            searchResultsList.add(searchResult.getText());
        }
        return searchResultsList;
    }*/

   public List<String> getSearchResultsList (){
       List <String> searchResultList =new ArrayList<>();
       //for each WebElement searchResult in searchResults List
       for (WebElement searchResult: searchResults){
           evaluateJavascript("arguments[0].scrollIntoView();", searchResult);
           searchResultList.add (searchResult.getText());

       }
       return searchResultList;
   }



}
