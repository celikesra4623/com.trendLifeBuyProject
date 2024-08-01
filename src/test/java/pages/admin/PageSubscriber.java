package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.*;

public class PageSubscriber {
    public PageSubscriber() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // US-294 Locats
    @FindBy(xpath = "//*[text()='Subscribers']")
    public WebElement dropDownSubscribers;

    @FindBy(xpath = "//th[@scope='col']")
    public List<WebElement> tableHeadingListSubscriber;

    // US-295 Locats

    @FindBy(xpath ="(//*[@id=\"dropdownMenu2\"])[1]")
    public WebElement buttonSelect;

    @FindBy(xpath ="(//*[text()='Send verify link'])[1]")
    public WebElement linkSendVerify;

    @FindBy (xpath = "//div[text() ='Verification link send successfully.']")
    public WebElement tostMessageVerification;

    // US-296 Locats

    @FindBy (xpath = "(//*[text()='Delete'])[1]")
    public WebElement linkDelete;

    @FindBy (xpath = "//*[@id=\"dataDeleteBtn\"]")
    public WebElement buttonDelete;

    @FindBy (xpath = "//*[@id=\"deleteItemModal\"]/div/div")
    public WebElement deleteSubscriber;

    @FindBy (xpath = "//*[@id=\"deleteItemModal\"]/div/div/div[1]/button/i" )
    public WebElement buttonDeleteCross;

    @FindBy (xpath ="//*[text()='Deleted successfully!']")
    public WebElement tostMessageDelete;


    // US-297 Locats


    @FindBy (xpath = "//*[@id=\"subscriberTable\"]/tbody/tr[1]/td[4]/label/div")
    public WebElement buttonActiveRadio;

    @FindBy (xpath = "/html/body/div[2]/div/section/div/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[4]/label/div")
    public WebElement buttonActiveRadio2;

    @FindBy (xpath = "(//div[@class= 'slider round'])[1]")
    public WebElement buttonInactiveRadio;


    @FindBy (xpath = "//*[@id=\"toast-container\"]/div")
    public WebElement tosMessageRadioButton;

    @FindBy (xpath = "/html/body/div[7]/div")
    public WebElement tosMessageRadioButton2;


}
