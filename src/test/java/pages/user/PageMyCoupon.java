package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageMyCoupon {

    public PageMyCoupon(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/profile/coupons'])[1]")
    public WebElement buttonMyCoupons;

    @FindBy(xpath = "//input[@id='code']")
    public WebElement fieldCode;

    @FindBy(xpath = "//button[text()='Add Coupon']")
    public WebElement buttonAddCoupon;

    @FindBy(xpath = "//th[text()='Coupon Value']")
    public WebElement labelCouponValue;

    @FindBy(xpath = "//th[text()='Store Name']")
    public WebElement labelStoreName;

    @FindBy(xpath = "//th[text()='Coupon Code']")
    public WebElement labelCouponCode;

    @FindBy(xpath = "//th[text()='Validity']")
    public WebElement labelValidity;

    @FindBy(xpath = "//th[text()='Action']")
    public WebElement labelAction;

}
