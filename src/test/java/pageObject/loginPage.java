package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends setup {
    // anything from login page
    // UI web elements

    public loginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "//input[@name='email']")
    public WebElement emailLocator;

    // any functions that's require in this page
    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }


}
