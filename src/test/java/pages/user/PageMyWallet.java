package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageMyWallet {
    public PageMyWallet() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/wallet/customer/my-wallet-index']")
    public WebElement buttonMyWallet;

    @FindBy(xpath = "//span[text()='Total Balance']")
    public WebElement boardTotalBalance;

    @FindBy(xpath = "//h4[text()='Running Balance']")
    public WebElement boardRunnigBalance;

    @FindBy(xpath = "//h4[text()='Pending Balance']")
    public WebElement boardPendingBalance;

    @FindBy(xpath = "//span[text()='Recharge Wallet']")
    public WebElement buttonRechargeWallet;

    @FindBy(xpath = "//h3[text()='Recharge Amount']")
    public WebElement labelRechargeAmount;

    @FindBy(xpath = "//input[@id='recharge_amount']")
    public WebElement fieldEnterRechargeAmount;

    @FindBy(xpath = "//h5[text()='Cancel']")
    public WebElement buttonRechargeAmountCancel;

    @FindBy(xpath = "//button[text()='Add Fund']")
    public WebElement buttonRechargeAmountAddFund;

    @FindBy(xpath = "//h4[text()='Wallet Recharge History']")
    public WebElement labelWalletRechargeHistory;

    @FindBy(xpath = "//th[text()='Date']")
    public WebElement labelDate;

    @FindBy(xpath = "//th[text()='Trx Id']")
    public WebElement labelTrxId;

    @FindBy(xpath = "//th[text()='Amount']")
    public WebElement labelAmount;

    @FindBy(xpath = "//th[text()='Type']")
    public WebElement labelType;

    @FindBy(xpath = "//th[text()='Payment Method']")
    public WebElement labelPaymentMethod;

    @FindBy(xpath = "//th[text()='Status']")
    public WebElement labelStatus;
}
