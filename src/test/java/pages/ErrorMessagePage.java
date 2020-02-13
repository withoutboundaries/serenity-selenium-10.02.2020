package pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorMessagePage extends PageObject {

    @FindBy (xpath="//h1/../p")
    private WebElement errorMessage;

    public String getErrorMessage (){
       return errorMessage.getText();
    }

}
