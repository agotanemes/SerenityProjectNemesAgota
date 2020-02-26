package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest{
    @Steps
    LoginSteps loginSteps;
    @Test
    public void loginHappyFlow(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginUser();
        String fName="Manolachi".toLowerCase();
        String lName="Ioana".toLowerCase();
        loginSteps.verifyUserIsLogedIn(fName,lName);
    }
}
