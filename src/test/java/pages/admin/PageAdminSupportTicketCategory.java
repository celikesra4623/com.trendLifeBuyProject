package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageAdminSupportTicketCategory {



    public PageAdminSupportTicketCategory (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[text()='Category'])[2]")
    public WebElement linkCategory;

    @FindBy (xpath = "//h3[contains(text(), 'Add New') ]")
    public WebElement textAddNew;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement fieldName;

    @FindBy(xpath = "(//span[@class='checkmark'])[2]")
    public WebElement buttonInactive;

    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement buttonSave;

    @FindBy (xpath = "//th[contains(text(), 'Name')]")
    public WebElement titleName;

    @FindBy(xpath = "//th[contains(text(), 'Status')]")
    public WebElement titleStatus;

    @FindBy(xpath = "//th[contains(text(), 'Action')]")
    public WebElement titleAction;

    @FindBy(xpath = "(//div[@class='slider round'])[1]")
    public WebElement slideBar;

    @FindBy(xpath = "//button[@class='btn btn-secondary dropdown-toggle']")
    public WebElement buttonSelect;

    @FindBy(xpath = "//a[text()='Edit']")
    public WebElement textEdit;

    @FindBy(xpath = "//a[text()='Delete']")
    public WebElement textDelete;

    @FindBy(xpath = "//h3[contains(text(), ' Edit ')]")
    public  WebElement visibleEdit;

    @FindBy (xpath = "//button[@id='submit_btn']")
    public WebElement buttonUpdate;

    @FindBy (xpath = "(//a[text()='Delete'])[1]")
    public WebElement buttonDelete;

    @FindBy (id = "dataDeleteBtn")
    public WebElement sureDelete;

    @FindBy(xpath = "(//*[text()='Support Ticket'])[1]")
    public WebElement linkSupportTicket;















}
