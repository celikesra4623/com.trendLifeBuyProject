package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;
import java.util.List;

public class PageSupportTicketStatus51 {
    public PageSupportTicketStatus51 (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//span[text()='Support Ticket']")
    public WebElement linkSupportTicket;

    @FindBy (xpath = "//*[@id=\"sidebar_menu\"]/li[17]/ul/li[4]")
    public WebElement linkStatusSupportTicket;

    @FindBy (xpath = "(//h3[@class='mb-30'])[2]")
    public WebElement titleStatusList;

    @FindBy (xpath = "//input[@class='primary_input_field']")
    public WebElement fieldName;

    @FindBy (xpath = "(//span[@class='checkmark'])[1]")
    public WebElement radioButtonAktiveStatus;

    @FindBy (xpath = "(//span[@class='checkmark'])[2]")
    public WebElement radioButtonInktiveStatus;

    @FindBy (xpath = "//button[@class='primary-btn fix-gr-bg']")
    public WebElement buttonSaveStatus;

    @FindBy (xpath = "//td[text()='Salih']")
    public WebElement addedName;

    @FindBy (xpath = "//th[@class='sorting_asc']")
    public WebElement titleSl;

    @FindBy (xpath = "(//th[@class='sorting'])[1]")
    public WebElement titleName;

    @FindBy (xpath = "(//th[@class='sorting'])[2]")
    public WebElement titleStatus;

    @FindBy (xpath = "(//th[@class='sorting'])[3]")
    public WebElement titleAction;

    @FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
    public WebElement dropDownMenüSelect;

    @FindBy (xpath = "(//a[@class='dropdown-item edit_status'])[1]")
    public WebElement linkEditDropDown;

    @FindBy (xpath = "(//h3[@class='mb-30'])[1]")
    public WebElement titleEdit;

    @FindBy (xpath = "//button[@class='primary-btn fix-gr-bg']")
    public WebElement buttonUpdate;

    @FindBy (xpath = "(//div[@class='slider round'])[1]")
    public WebElement radyoButonuStatus;


    //*****************  48.US LOKATE'LERI ***********************
    @FindBy (xpath = "(//a[text()='Product Review'])[2]")
    public WebElement linkProductReview;

    @FindBy (xpath = "//h3[text()='Product Review']")
    public WebElement textProductReview;

    @FindBy (xpath = "//th[@aria-label='Product: activate to sort column ascending']")
    public WebElement headerProductProductReview;

    @FindBy (xpath = "//th[@class='sorting_asc']")
    public WebElement headerRatingProductReview;

    @FindBy (xpath = "//th[@aria-label='Number of review: activate to sort column ascending']")
    public WebElement headerNumberOfReviewProductReview;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement fieldQuickSearchProductReview;

    @FindBy (xpath = "//div[text()='Showing 1 to 4 of 4 entries']")
    public WebElement textOfTheNumberOfElements;

 //   @FindAll({@FindBy (xpath = "//tbody//tr")})
 //   public List<WebElement> rowList;

    @FindAll({@FindBy (xpath = "//thead//tr//th")})
    public List<WebElement> headList;

    @FindAll({@FindBy(xpath = "((//tbody//tr)[1]//td)")})
    public List<WebElement> rowFirstValues;







}
