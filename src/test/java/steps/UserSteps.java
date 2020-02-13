package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.ErrorMessagePage;
import pages.LandingPage;

public class UserSteps extends ScenarioSteps {

    LandingPage landingPage;
    ErrorMessagePage errorMessagePage;

    @Step
    public UserSteps login (String userEmail, String userPassword){
        landingPage.open();
        landingPage.login(userEmail,userPassword);
        waitABit(60000);
        return this;
    }

    @Step
    public UserSteps validatePageHeader (String expectedMessage) {
        Assert.assertEquals("Wrong header message.", expectedMessage, errorMessagePage.getErrorMessage());
        return this;
    }

}
