package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageSupportTicket {

    public PageSupportTicket() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h4[@class='font_24 f_w_700 flex-fill m-0']")
    public WebElement labelAllSubmittedTicket;

    @FindBy(xpath = "//th[text()='SL']")
    public WebElement labelSL;

    @FindBy(xpath = "//th[text()='Ticket ID']")
    public WebElement labelTicketID;

    @FindBy(xpath = "//th[text()='Subject']")
    public WebElement labelSubject;

    @FindBy(xpath = "//th[text()='Priority']")
    public WebElement labelPriority;

    @FindBy(xpath = "//th[text()='Last update']")
    public WebElement labelLastUpdate;

    @FindBy(xpath = "//th[text()='Action']")
    public WebElement labelAction;


    @FindBy(xpath = "//input[@id='subject']")
    public WebElement fieldSubject;

    @FindBy(xpath = "//div[@class='nice-select theme_select style2 wide']")
    public WebElement fieldCategory;

    @FindBy(xpath = "//li[text()='Others']")
    public WebElement selectOthers;

    @FindBy(xpath = "//div[@class='nice-select theme_select style2 wide open']")
    public WebElement fieldPriority;

    @FindBy(xpath = "//li[text()='High']")
    public WebElement selectHigh;

    @FindBy(xpath = "//div[@class='note-editable']")
    public WebElement fieldDescription;

    @FindBy(xpath = "//button[text()='+ Create Now']")
    public WebElement buttonCreateNow;

    @FindBy(xpath = "//a[text()='View']")
    public WebElement buttonView;

    @FindBy(xpath = "//h3[@class='font_20 f_w_700 lh-base mb_10 max_450px']")
    public WebElement labelShowTicket;

    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[1]")
    public WebElement labelShowStatus;

    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[2]")
    public WebElement labelShowPriority;

    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[3]")
    public WebElement labelShowCategory;

    @FindBy(xpath = "//button[@id='replay_box_toggler']")
    public WebElement buttonReply;

    @FindBy(xpath = "//span[text()='All Ticket']")
    public WebElement dropDownAllTicket;

    @FindBy(xpath = "//li[text()='All Ticket']")
    public WebElement selectAllTicket;

    @FindBy(xpath = "//li[text()='Pending']")
    public WebElement selectPending;

    @FindBy(xpath = "//li[text()='On Going']")
    public WebElement selectOnGoing;

    @FindBy(xpath = "//li[text()='Completed']")
    public WebElement selectCompleted;

    @FindBy(xpath = "//li[text()='Closed']")
    public WebElement selectClosed;

    @FindBy(xpath = "//a[text()='+ Add New']")
    public WebElement buttonAddNew;
    

}
