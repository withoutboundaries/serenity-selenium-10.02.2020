package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps extends ScenarioSteps {
    private HomePage homePage;
    private String searchTerm;



    @Step
    public HomeSteps validateHomePageIsLoaded() {
        Assert.assertTrue("Page is not loaded.", homePage.isPageLoaded());
        return this;
    }

    @Step
    public HomeSteps searchFor(String searchTerm) {
        this.searchTerm = searchTerm;
        homePage.searchFor(searchTerm);
        return this;
    }
}




