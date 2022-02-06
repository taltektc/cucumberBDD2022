package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage extends setup {
    // anything from login page
    // UI web elements

    public loginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "//input[@name='email']")
    public WebElement emailLocator;
    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;
    @FindBy(how= How.XPATH, using = "//input[@value='Log In']")
    public WebElement loginButtonLoc;

    public void verifyHomepageTitle(){
        String act = driver.getTitle(); // comes development
        String exp = "Sign In"; // comes from BA
        Assert.assertEquals(exp, act);
    }

    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }

    public void enterEmailPassword(String password){
        passwordLocator.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButtonLoc.click();
    }

}
