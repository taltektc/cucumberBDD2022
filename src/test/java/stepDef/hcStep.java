package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.hcPage;

public class hcStep extends setup {

    hcPage cp = new hcPage(driver);

    @Given("I am at Health Course Contact Page")
    public void iAmAtHealthCourseContactPage() {
    }

    @And("I enter user name")
    public void iEnterUserName() {
        cp.enterName();
    }

    @And("I enter company name")
    public void iEnterCompanyName() {
        cp.enterCompanyName();
    }
}
