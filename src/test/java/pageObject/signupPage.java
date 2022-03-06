package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signupPage extends setup {

    public signupPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.NAME, using = "firstName")
    public WebElement firstNameLoc;
    @FindBy(how= How.NAME, using = "lastName")
    public WebElement lastNameLoc;
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLoc;
    @FindBy(how= How.NAME, using = "password")
    public WebElement password;
    @FindBy(how= How.NAME, using = "confirmPassword")
    public WebElement confirmPassword;

    public void enterNames(String firstName, String lastName){
        firstNameLoc.sendKeys(firstName);
        lastNameLoc.sendKeys(lastName);
    }

    public void enterEmail(String email){
        emailLoc.sendKeys(email);
    }
    public void enterPasswordAndConfirmPassword(String pass, String confirmPass){
        password.sendKeys(pass);
        confirmPassword.sendKeys(confirmPass);
    }


}
