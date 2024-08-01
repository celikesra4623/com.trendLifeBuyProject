package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.comp.CompPromotion;
import pages.comp.CompToastMessage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;
import utilities.UserReader;

public class PageAdminLogin {

    public PageAdminLogin(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "text")
    public WebElement fieldEmail;

    @FindBy(id = "password")
    public WebElement fieldPassword;

    @FindBy(id = "sign_in_btn")
    public WebElement buttonSignin;

    public void login(String userKey, String passwordKey)  {
        fieldEmail.sendKeys(UserReader.getUser(userKey));
        fieldPassword.sendKeys(UserReader.getPassword(passwordKey));
        ReusableMethods.clickElementByJS(buttonSignin);
        new CompToastMessage().close();
    }

}

