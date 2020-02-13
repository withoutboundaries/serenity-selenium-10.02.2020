package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.UserSteps;

@RunWith(SerenityRunner.class)

public class LoginTest extends BaseTest {

    @Test
    public void negativeLoginTest() {
        user
                .login("a@b.c", "P@ssword123")
                .validatePageHeader("Don't miss your next opportunity. Sign in to stay updated on your professional world.");
    }


}

