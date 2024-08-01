package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PagePurchaseHistory {

    public PagePurchaseHistory(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/my-purchase-histories'][1]")
    public WebElement linkPurchaseHistory;

    @FindBy(xpath = "//h3[text()='Purchase History']")
    public WebElement labelPurchaseHistory;

    @FindBy(xpath = "//span[text()='All History']")
    public WebElement fieldAllHistory;

    @FindBy(xpath = "//div[@class='nice-select amaz_select3 open']")
    public WebElement fieldAllHistory1;

    @FindBy(xpath = "//li[text()='All History']")
    public WebElement checkBoxAllHistory;

    @FindBy(xpath = "//li[text()='Pending Orders']")
    public WebElement checkBoxPendingOrders;

    @FindBy(xpath = "//li[text()='Confirmed Orders']")
    public WebElement checkBoxConfirmedOrders;

    @FindBy(xpath = "//li[text()='Completed Orders']")
    public WebElement checkBoxCompletedOrders;

    @FindBy(xpath = "//li[text()='Refused/Cancelled Orders']")
    public WebElement checkBoxRefusedCancelledOrders;

    @FindBy(xpath = "//li[text()='Delivery Status']")
    public WebElement labelDeliveryStatus;

    @FindBy(xpath = "//a[text()='Cancelled']")
    public WebElement labelCancelled;

    @FindBy(xpath = "//a[text()='Pending']")
    public WebElement labelPending;

    @FindBy(xpath = "//button[@data-id='158']")
    public WebElement buttonThreeLines;

    @FindBy(xpath = "//a[@class='amazy_status_btn'][1]")
    public WebElement buttonArrow;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/my-purchase-order-pdf/" +
            "eyJpdiI6IjBnbmYva3p0RjN3Rk1yYTBndW9FOHc9PSIsInZhbHVlIjoiWUFSY1IzMDkyQ0" +
            "NndHd3S1BQc3lDUT09IiwibWFjIjoiNWVjNmY2NTRmODg3YThkZjFmNjM5NzExMmQ2NjRlYmY" +
            "3NTU1NTk4MzY4MzU4ZWYxYmI5NWIyNTc0OWFmM2QzMSIsInRhZyI6IiJ9']")
    public WebElement buttonArrow1;

    @FindBy(xpath = "//h5[text()='Order Summary']")
    public WebElement labelOrderSummary;

    @FindBy(xpath = "//embed[@type='application/x-google-chrome-pdf']")
    public WebElement OrderInvoice;




}
