package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageCheckout {
    public PageCheckout() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Continue To Shipping']")
    public WebElement buttonContinueToShipping;

    @FindBy(id = "email")
    public WebElement fieldEmail;


    @FindBy(id = "name")
    public WebElement fieldName;

    @FindBy(id = "address")
    public WebElement fieldAddress;

    @FindBy(id = "phone")
    public WebElement fieldPhone;

    @FindBy(xpath = ("(//span[text()='Select from options'])[2]"))
    public WebElement dropDownCity;

    @FindBy(xpath = ("//li[@data-value='47681']")) //Berkeley
    public WebElement itemCity;
}
