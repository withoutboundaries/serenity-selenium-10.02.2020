package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import pages.HomePage;
import pages.LandingPage;
import pages.LoginChallengePage;

public class LoginSteps extends ScenarioSteps {

    private LandingPage landingPage;
    private LoginChallengePage loginChallenge;
    private HomePage homePage;

    @Given("I open Landing page")
    @Step
    public LoginSteps openLandingPage() {
        landingPage.open();
        //waitABit(10000);
        return this;
    }

  @When("I log in with username '<$userEmail>' and password '<$userPassword>'")
  @Step
   public  LoginSteps login(String userEmail, String userPassword) {
      landingPage.login(userEmail, userPassword);
     return this;
  }


    @Then("I should see Home page")
    public LoginSteps validateHomePageIsLoaded() {
        Assert.assertTrue("Page is not loaded.", homePage.isPageLoaded());
        return this;
    }

    @Step
    public LoginSteps validatePageHeader(String expectedMessage) {
        Assert.assertEquals("Wrong header message.", expectedMessage, loginChallenge.getHeaderMessageText());
        return this;
    }
}