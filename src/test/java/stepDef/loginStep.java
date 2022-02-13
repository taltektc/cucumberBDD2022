package stepDef;

import base.setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class loginStep extends setup {

    loginPage lp = new loginPage(driver);

    @Given("I am at TalentTEK homepage")
    public void iAmAtTalentTEKHomepage() {
        lp.verifyHomepageTitle();
    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        lp.enterEmailAddress(Hook.existingStudentEmail);
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        lp.enterEmailPassword(Hook.existingStudentPass);
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        lp.clickLoginButton();
    }

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {

    }

    @Given("I enter {string} for username")
    public void iEnterForUsername(String Username) {
//        lp.emailLocator.sendKeys(Username);
        lp.enterEmailAddress(Username);
    }

    @And("I enter {string} for password")
    public void iEnterForPassword(String Password) {
        lp.passwordLocator.sendKeys(Password);
    }

    @Given("I enter the username and password")
    public void iEnterTheUsernameAndPassword(DataTable table) {
//        lp.emailLocator.sendKeys(table.cell(0,0));
//        lp.passwordLocator.sendKeys(table.cell(0,1));
        lp.enterEmailAddress(table.cell(0,0));
        lp.enterEmailPassword(table.cell(0,1));

    }

    @Given("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String Username, String Password) {
        lp.enterEmailAddress(Username);
        lp.enterEmailPassword(Password);
    }

    @Then("^I should see the error message ([^\"]*)$")
    public void iShouldSeeTheErrorMessageError(String ErrorMessage) {
        lp.validateErrorMessage(ErrorMessage);
    }
}