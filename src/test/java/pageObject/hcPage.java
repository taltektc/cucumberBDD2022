package pageObject;

import base.setup;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stepDef.Hook;

public class hcPage extends setup {
    // anything from login page
    // UI web elements

    public hcPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.NAME, using = "//input[@name='et_pb_contact_name_0']")
    public WebElement nameLoc;
    @FindBy(how= How.XPATH, using = "//input[@id='et_pb_contact_company_0']")
    public WebElement companyLoc;
    @FindBy(how= How.ID, using = "//input[@id='et_pb_contact_email_0']")
    public WebElement emailLocator;
    @FindBy(how= How.ID, using = "//input[@id='et_pb_contact_phone_number_0']")
    public WebElement phoneNumLock;
    @FindBy(how= How.XPATH, using = "//textarea[@name='et_pb_contact_message_0']")
    public WebElement messageLocator;
    @FindBy(how= How.XPATH, using = "//button[@type='submit']")
    public WebElement submitButtonLoc;


    public void enterName(){
        nameLoc.sendKeys("Prem");
    }
    public void enterCompanyName(){
        companyLoc.sendKeys("HC");
    }


}
