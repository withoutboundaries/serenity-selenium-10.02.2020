package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linkedin.com/")

public class LandingPage extends PageObject {

    @FindBy(xpath = "//input[@name='session_key']")
    private WebElementFacade userEmailField;

    @FindBy(xpath = "//input[@name='session_password']")
    private WebElementFacade userPasswordField;

    @FindBy(xpath = "//button[@aria-label='i18n_sign-in']")
    private WebElementFacade loginButton;

    public void login(String userEmail, String userPassword){
        userEmailField.sendKeys(userEmail);
        userPasswordField.sendKeys(userPassword);
        loginButton.click();
    }



}
