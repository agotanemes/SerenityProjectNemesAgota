package test;

import models.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.RegisterSteps;
import static utils.Utils.getRandomString;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest {

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void registerTest(){

        registerSteps.navigateToRegisterPage();
        User u =registerSteps.registerUser();
        registerSteps.verifyUserIsRegistered(u.getFirstName(), u.getLastName());
    }
    @Test
    public void registerTest1(){
        registerSteps.navigateToRegisterPage();
        User u=registerSteps.registerUserWithEmptyFields();
        registerSteps.isDisplayedMandatoryFieldErrorMessage();
    }
}
