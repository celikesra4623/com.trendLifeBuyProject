package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageAdminCustomer33 {
    public PageAdminCustomer33() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Customer']")
    public WebElement buttonCustomer;

    @FindBy(xpath = "//a[text()='All Customer']")
    public WebElement buttonAllCustomerSideBar;

    @FindBy(xpath = "//h3[text()='All Customer']")
    public WebElement textAllCustomer;

    @FindBy(xpath = "//div[@id='allCustomerTable_info']")
    public WebElement textShowingAllCustomer;

    @FindBy(xpath = "(//div[@class='slider round'])[1]")
    public WebElement radyoButtonIsActive;

    @FindBy(xpath = "//a[text()='Active Customer']")
    public WebElement buttonActiveCustomer;

    @FindBy(xpath = "//a[@class='nav-link active']")
    public WebElement buttonCreateCustomer;

    @FindBy(xpath = "//a[@class='nav-link']")
    public WebElement buttonInActiveCustomer;

    @FindBy(xpath = "//a[@class='nav-link show']")
    public WebElement buttonAllCustomerDashboard;

    @FindBy(xpath = "(//div[@class='main-title d-md-flex'])[2]")
    public WebElement textActiveCustomer;

    @FindBy(xpath = "(//div[@class='main-title d-md-flex'])[3]")
    public WebElement textInActiveCustomer;

    @FindBy(xpath = "(//div[@class='main-title d-flex'])[1]")
    public WebElement textAddNewCustomer;

   @FindBy(xpath = "(//td[@tabindex='0'])[1]")
   public WebElement buttonPlus;

//    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
//    public WebElement buttonPlus;




    @FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
    public WebElement dropDownMenüSelect;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement linkDetailsDropDown;

    @FindBy(xpath = "//*[@id=\"allCustomerTable\"]/tbody/tr[1]/td[9]/div/div/a[2]")
    public WebElement linkEditDropDown;

    @FindBy(xpath = "//*[@id=\"allCustomerTable\"]/tbody/tr[1]/td[9]/div/div/a[3]")
    public WebElement linkDeleteDropDown;


    //****CUSTOMER FROFILE TEXTS***********
    @FindBy(xpath = "//h3[text()='Customer Profile']]")
    public WebElement textCustomerProfile;

    @FindBy(xpath = "//h3[text()='Base User 2 Test']]")
    public WebElement textBaseUser2Test;

    @FindBy(xpath = "//h3[text()='Order Summary']]")
    public WebElement textOrderSummary;

    @FindBy(xpath = "//h3[text()='Wallet Summary']]")
    public WebElement textWalletSummary;


    @FindBy(xpath = "//td[text()='Name']")
    public WebElement textName;

    @FindBy(xpath = "//td[text()='Email']")
    public WebElement textEmail;

    @FindBy(xpath = "//td[text()='Registered Date']")
    public WebElement textRegisteredDate;

    @FindBy(xpath = "//td[text()='Phone']")
    public WebElement textPhone;

    @FindBy(xpath = "//td[text()='Active Status']")
    public WebElement textActiveStatus;

    @FindBy(xpath = "//td[text()='Total Orders']")
    public WebElement textTotalOrders;

    @FindBy(xpath = "//td[text()='Confirmed Order']")
    public WebElement textConfirmedOrder;

    @FindBy(xpath = "//td[text()='Pending Order']")
    public WebElement textPendingOrder;

    @FindBy(xpath = "//td[text()='Completed Order']")
    public WebElement textCompletedOrder;

    @FindBy(xpath = "//td[text()='Cancelled Order']")
    public WebElement textCancelledOrder;

    @FindBy(xpath = "//td[text()='Total Recharge']")
    public WebElement textTotalRecharge;

    @FindBy(xpath = "//td[text()='Pending Balance Approval']")
    public WebElement textPendingBalanceApproval;

    @FindBy(xpath = "//td[text()='Total Balance']")
    public WebElement textTotalBalance;

    @FindBy(xpath = "//a[@class='nav-link active']")
    public WebElement buttonOrders;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement buttonWalletHistories;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement buttonAdresses;

    @FindBy(xpath = "(//th[@aria-label='Date: activate to sort column ascending'])[2]")
    public WebElement shortheaderDate;

    @FindBy(xpath = "//th[@aria-label='User: activate to sort column ascending']")
    public WebElement shortheaderUser;

    @FindBy(xpath = "//th[@aria-label='TXN ID: activate to sort column ascending']")
    public WebElement shortheaderTxdId;

    @FindBy(xpath = "//th[@aria-label='Amount: activate to sort column ascending']")
    public WebElement shortheaderAmount;

    @FindBy(xpath = "//th[@aria-label='Type: activate to sort column ascending']")
    public WebElement shortheaderType;

    @FindBy(xpath = "//th[@aria-label='Payment Method: activate to sort column ascending']")
    public WebElement shortheaderPaymentMethod;

    @FindBy(xpath = "//th[@aria-label='Approval: activate to sort column ascending']")
    public WebElement shortheaderApproval;

    @FindBy(xpath = "(//th[@aria-label='SL: activate to sort column descending'])[3]")
    public WebElement shortheaderSl;

    @FindBy(xpath = "//th[@aria-label='Full Name: activate to sort column ascending']")
    public WebElement shortheaderFullName;

    @FindBy(xpath = "//th[@aria-label='Address: activate to sort column ascending']")
    public WebElement shortheaderAddress;

    @FindBy(xpath = "//th[@aria-label='Region: activate to sort column ascending']")
    public WebElement shortheaderRegion;

    @FindBy(xpath = "//th[@aria-label='Email: activate to sort column ascending']")
    public WebElement shortheaderEmail;

    @FindBy(xpath = "//th[@aria-label='Phone Number: activate to sort column ascending']")
    public WebElement shortheaderPhoneNumber;

    @FindBy(xpath = "//th[@aria-label='Postcode: activate to sort column ascending']")
    public WebElement shortheaderPostcode;

    //***********EDIT PAGE******************
    @FindBy(xpath = "(//h3[@class='mb-0 mr-30'])[1]")
    public WebElement textTitleUpdateCustomer;

    @FindBy(xpath = ("//button[@class='primary-btn semi_large2 fix-gr-bg']"))
    public WebElement buttonUpdate;

    @FindBy(xpath = "(//div[@class='modal-content'])[1]")
    public WebElement windowsDelete;

    @FindBy(xpath = "//a[@id='delete_link']")
    public WebElement buttonDeleteOnDeleteWindow;


}
