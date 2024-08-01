package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.comp.CompPromotion;
import pages.comp.CompToastMessage;
import utilities.Driver;
import utilities.URLReader;
import utilities.UserReader;

public class PageUserLogin {

    public PageUserLogin(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "text")
    public WebElement fieldEmail;

    @FindBy(name = "password")
    public WebElement fieldPassword;

    @FindBy(id = "sign_in_btn")
    public WebElement buttonSignin;

    public void login(String userKey, String passwordKey)  {
        String loginURL = URLReader.getUrl("url.user.login");
        fieldEmail.sendKeys(UserReader.getUser(userKey));
        fieldPassword.sendKeys(UserReader.getPassword(passwordKey));
        buttonSignin.click();
        new CompToastMessage().close();
        new CompPromotion().close();
    }

}
