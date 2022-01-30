package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class loginStep extends setup {

    loginPage lp = new loginPage(driver);

    @Given("I am at TalentTEK homepage")
    public void iAmAtTalentTEKHomepage() {
        // code
    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        lp.enterEmailAddress("qatest1@gmail.com");
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        
    }

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
    }
}
