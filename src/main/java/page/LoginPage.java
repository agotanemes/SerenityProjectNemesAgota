package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
//bla
@DefaultUrl("http://qa2.dev.evozon.com/customer/account/login/")
public class LoginPage extends AbstractPage {
    @FindBy(id = "email")
    private WebElementFacade emailInput;
    @FindBy(id = "pass")
    private WebElementFacade passInput;
    @FindBy(id = "send2")
    private WebElementFacade loginButton;
    @FindBy(id="advice-required-entry-email")
    private WebElementFacade requiredEmailMessage;
    @FindBy(id="advice-required-entry-pass")
    private WebElementFacade requiredPasslMessage;

    public void typeEmail(String email) {
        emailInput.type(email);
    }

    public void typePass(String pass) {
        passInput.type(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
    public String getRequiredEmailMessage(){
        return requiredEmailMessage.getText();
    }
    public String getRequiredPassMessage(){
        return requiredPasslMessage.getText();
    }

}
