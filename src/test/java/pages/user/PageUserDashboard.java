package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageUserDashboard {
    public PageUserDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // ***** User HomePage **********
    @FindBy(xpath = "//a[@class='log_out']")
    public WebElement linkLogoutHomePage;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/login'])[1]")
    public WebElement linkLogin;

    //   @FindBy (xpath = "//a[@class='position-relative d-flex align-items-center log_out']")
    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/logout'])[2] ")
    public WebElement linkLogoutDashboardSideBar;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement fieldEmailAdresKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement fieldPasswordKutusu;

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement buttonDashboard;

    @FindBy(xpath = "//h4[@class='font_20 f_w_700']")
    public WebElement labelUserName;

    @FindBy(xpath = "//span[@class='email_text font_14 f_w_400 mute_text position-relative']")
    public WebElement labelEmail;

    @FindBy(xpath = "//*[text()=' All Order']")
    public WebElement labelAllOrder;

    @FindBy(xpath = "//*[text()='My Wishlist'][1]")
    public WebElement labelMyWishlist;

    @FindBy(xpath = "//*[text()='Refund Success']")
    public WebElement labelRefundSuccess;

    @FindBy(xpath = "//*[text()=' Product in Cart']")
    public WebElement labelProductInCart;

    @FindBy(xpath = "//*[text()=' Coupon Used']")
    public WebElement labelCouponUsed;

    @FindBy(xpath = "//*[text()=' Completed Order']")
    public WebElement labelCompletedOrder;

    @FindBy(xpath = "//*[text()='Total Balance']")
    public WebElement labelTotalBalance;

    @FindBy(xpath = "//h4[@class='font_30 f_w_700 secondary_text mb_25']")
    public WebElement labelTotalBalanceAmount1;

    @FindBy(xpath = "//h4[@class='font_30 f_w_700 secondary_text mb_25']")
    public WebElement labelTotalBalanceAmount2;

    @FindBy(xpath = "//button[@data-bs-target='#recharge_wallet']")
    public WebElement buttonRechargeWallet;

    @FindBy(xpath = "//*[text()='Recharge Amount']")
    public WebElement labelRechargeAmountWindow;

    @FindBy(id = "recharge_amount")
    public WebElement fieldEnterRechargeAmount;

    @FindBy(xpath = "//button[text()='Add Fund']")
    public WebElement buttonAddFund;

    @FindBy(xpath = "//img[@title='Stripe']")
    public WebElement buttonStripe;

    //@FindBy(xpath = "//input[@id='email']")  //css=<HTML tag><#><Value of ID attribute>
    //public WebElement fieldEmailStripePayment;

    @FindBy(css = "input#email")  //css=<HTML tag><#><Value of ID attribute>
    public WebElement fieldEmailStripePayment;

    @FindBy(xpath = "//input[@id=\"card_number\"]")
    public WebElement fieldCardNumberStripePayment;

    @FindBy(xpath = "//input[@placeholder=\"MM / YY\"]")
    public WebElement fieldMonthYearStripePayment;

    @FindBy(xpath = "//input[@placeholder=\"CVC\"]")
    public WebElement fieldCvcStripePayment;

    @FindBy(xpath = "//span[text()=\"Pay\"]")
    public WebElement buttonPayStripePayment;

    @FindBy(xpath = "//h3[@class=\"f_w_700 m-0 lh-1\"][1]")
    public WebElement labelRunningBalance;

    @FindBy(xpath = "//h3[@class=\"f_w_700 m-0 lh-1\"][2]")
    public WebElement labelPendingBalance;

    @FindBy(xpath = "//a[@class='amaz_badge_btn2 text-uppercase text-nowrap']")
    public WebElement buttonSeeAllPurchaseHistory;

    @FindBy(xpath = "//h3[text()='Purchase History']")
    public WebElement labelPurchaseHistory;

    @FindBy(xpath = "//a[@class='amaz_badge_btn2 text-uppercase'][1]")
    public WebElement buttonSeeAllMyWishlist;

    @FindBy(xpath = "//a[@class='amaz_badge_btn2 text-uppercase'][2]")
    public WebElement buttonSeeAllRecentOrder;

    @FindBy(xpath = "//a[@class='amaz_badge_btn2 text-uppercase'][3]")
    public WebElement buttonSeeAllProductInCart;

    @FindBy(xpath = "//a[@class='position-relative d-flex align-items-center active']")
    public WebElement linkDashBoard;

    @FindBy(xpath = "//a[@class='position-relative d-flex align-items-center'][1]")
    public WebElement linkPurchaseHistory;



}
