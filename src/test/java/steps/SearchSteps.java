package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.core.Every;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.junit.Before;
import pages.SearchPage;

import java.util.List;


import static org.hamcrest.CoreMatchers.containsString;

public class SearchSteps extends ScenarioSteps {
    private SearchPage searchPage;



    @Then("I receive relevant results")
    @Step
    public SearchSteps verifyEachResultContains(String searchTerm) {
        List<String> searchResultsList = searchPage.getSearchResultsList();
        Assert.assertThat("SearchTerm not found.", searchResultsList, Every.everyItem(containsString(searchTerm)));
        return this;
    }



}