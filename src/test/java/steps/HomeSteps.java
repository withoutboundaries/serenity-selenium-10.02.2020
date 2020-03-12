package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps extends ScenarioSteps {
    private HomePage homePage;
    private String searchTerm;


    @Then("I should see Home page")
    @Given("I am on Home Page")
    @Step
    public HomeSteps validateHomePageIsLoaded() {
        Assert.assertTrue("Page is not loaded.", homePage.isPageLoaded());
        return this;
    }

    @When("I type $searchterm in searchField")
    @Step
    public HomeSteps searchFor(String searchTerm) {
        this.searchTerm = searchTerm;
        homePage.searchFor(searchTerm);
        return this;
    }
}




