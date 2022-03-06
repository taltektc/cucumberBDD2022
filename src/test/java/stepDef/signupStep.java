package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import pageObject.loginPage;
import pageObject.signupPage;

public class signupStep extends setup {

    loginPage lp = new loginPage(driver);
    signupPage sp = new signupPage(driver);

    @And("I enter my {string} and {string}")
    public void iEnterMyAnd(String firstName, String lastName) {
        lp.clickCreateNewAccountButton();
        // enter my first name and last name
        sp.enterNames(firstName, lastName);
    }

    @And("I enter my {string}")
    public void iEnterMy(String emailAddress) {
        sp.enterEmail(emailAddress);
    }

    @And("I enter {string} and confirm my {string}")
    public void iEnterAndConfirmMy(String password, String confirmPassword) {
        sp.enterPasswordAndConfirmPassword(password, confirmPassword);
    }
}
