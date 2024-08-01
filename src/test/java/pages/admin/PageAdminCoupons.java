package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageAdminCoupons {
    public PageAdminCoupons() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement buttonDashboard;

    @FindBy(xpath = "//span[text()='Marketing']")
    public WebElement buttonMarketing;

    @FindBy(xpath = "(//button[@id='submit_btn'])")
    public WebElement buttonSave;

    @FindBy(xpath = "//span[text()='Select Coupon Type First']")
    public WebElement labelSelectCouponTypeFirst;

    @FindBy(xpath = "//span[@id='error_coupon_type']")
    public WebElement labelSelectCouponTypeFirst1;

    @FindBy(xpath = "//div[@class='nice-select primary_select mb-15']")
    public WebElement buttonSelect;

    @FindBy(xpath = "(//input[@class='nice-select-search'])[2]")
    public WebElement buttonSearchCouponType;

    @FindBy(xpath = "//li[text()='Product Base']")
    public WebElement buttonProductBase;

    @FindBy(xpath = "//li[text()='Order Base']")
    public WebElement buttonOrderBase;

    @FindBy(xpath = "//li[text()='Free Shipping']")
    public WebElement buttonFreeShipping;

    @FindBy(xpath = "//*[@id='coupon_title']")
    public WebElement fieldTitle;

    @FindBy(xpath = "//input[@id='coupon_code']")
    public WebElement fieldcouponCode;

    @FindBy(xpath = "//span[@role='combobox']")
    public WebElement fieldProducts;

    @FindBy(xpath = "//li[text()='Exclusive watch 1']")
    public WebElement labelExclusiveWatch1;

    @FindBy(id = "date")
    public WebElement fieldDate;

    @FindBy(xpath = "//td[@class='today active start-date active end-date available']")
    public WebElement dateTodayFirst;

    @FindBy(xpath = "//td[@class='today weekend active start-date active end-date available']")
    public WebElement dateTodayWeekendFirst;

    @FindBy(xpath = "//td[@class='weekend active start-date available']")
    public WebElement dateSecond;

    @FindBy(xpath = "(((//div[@class='calendar-table'])[2]//tr)[3]//td)[1]")
    public WebElement dateSecond1;

    @FindBy(xpath = "//button[text()='Apply']")
    public WebElement buttonApplyDate;

    @FindBy(xpath = "//*[@id=\"discount\"]")
    public WebElement fieldDiscount;

    @FindBy(xpath = "//div[@class='nice-select primary_select mb-25']")
    public WebElement fieldDiscountType;

    @FindBy(xpath = "(//input[@class='nice-select-search'])[3]")
    public WebElement buttonSearchDiscountType;

    @FindBy(xpath = "//li[text()='Amount']")
    public WebElement buttonAmount;

    @FindBy(xpath = "//li[text()='Percentage']")
    public WebElement buttonPercentage;

    @FindBy(xpath = "//span[text()='The coupon title field is required.']")
    public WebElement labelTheCouponTitleFieldIsRequired;

    @FindBy(xpath = "//table[@id='couponTable']")
    public WebElement tableCoupon;

    @FindBy(xpath = "(//thead//tr//th)[1]")
    public WebElement rowSLCouponListTable;

    @FindBy(xpath = "(//thead//tr//th)[2]")
    public WebElement rowTitleCouponListTable;

    @FindBy(xpath = "(//thead//tr//th)[3]")
    public WebElement rowCodeCouponListTable;

    @FindBy(xpath = "(//thead//tr//th)[4]")
    public WebElement rowTypeCouponListTable;

    @FindBy(xpath = "(//thead//tr//th)[5]")
    public WebElement rowStartDateCouponListTable;

    @FindBy(xpath = "//td[@tabindex='0']")
    public WebElement rowPlusSignCouponListTable;

    @FindBy(xpath = "(//*[text()='End Date'])[2]")
    public WebElement rowEndDateCouponListTable;

    @FindBy(xpath = "(//thead//tr//th)[7]")
    public WebElement rowActionCouponListTable;

    @FindBy(xpath = "(//span[@class='dtr-title'])[2]")
    public WebElement rowActionCouponListTable1;

    @FindAll({@FindBy(xpath = "((//tr[@role='row'])[last()])//td")})
    public List<WebElement> rowCouponLastDataList;

    @FindBy(xpath = "(//span//a[contains(@class,paginate_button)])[last()]")
    public WebElement buttonLastPagination;

    @FindBy(xpath = "//*[@id=\"couponTable\"]/tbody/tr[1]/td[1]")
    public WebElement buttonplussignfirstrow;

    @FindAll({@FindBy(xpath = "//*[@id='couponTable']/thead/tr/th")})
    public List<WebElement> titleHeadListCouponListTable;

    @FindAll({@FindBy(xpath = "//*[@id=\"couponTable\"]/tbody/tr[2]/td/ul/li/span[1]")})
    public List<WebElement> titleEndDateActionCouponListTable;

    @FindBy(xpath = "(//td[@tabindex='0'])[8]")
    public WebElement rowPlusSignCouponListTable8;

    @FindBy(xpath = "(//*[@id=\"dropdownMenu2\"])[9]")
    public WebElement buttonSelectEighthCoupon;

    @FindBy(xpath = "(//a[@class='dropdown-item edit_coupon'])[9]")
    public WebElement buttonEditEighthCoupon;

    @FindBy(xpath = "(//h3[@class='mb-30'])[1]")
    public WebElement labelEditCoupon;

    @FindBy(xpath = "//*[@id=\"submit_btn\"]")
    public WebElement buttonUpdate;

    @FindBy(xpath = "//*[@id=\"couponTable\"]/tbody/tr[8]/td[2]")
    public WebElement labelEditedTitle;

    //@FindBy(xpath = "(//a[@class='dropdown-item delete_coupon'])[9]")
    //public WebElement buttonDeleteeighthCoupon;

    @FindBy(xpath = "//*[@id=\"couponTable_paginate\"]/span/a[2]")
    public WebElement button2Page;

    @FindBy(xpath = "//*[@id=\"couponTable_info\"]")
    public WebElement textOfTheShowing11To12Of12Entries;

    @FindBy(xpath = "//*[@id=\"couponTable\"]/tbody/tr[2]/td[1]")
    public WebElement buttonPlusSignTwelfth;

    @FindBy(xpath = "/html/body/div[2]/div/section/div/div/div[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")
    public WebElement buttonSelectTwelfth;

    @FindBy(xpath = "(//a[@class='dropdown-item delete_coupon'])[3]")
    public WebElement buttonDeleteTwelfth;

    @FindBy(xpath = "//*[@id=\"dataDeleteBtn\"]")
    public WebElement buttonDeleteOpenedWindow;

    @FindBy(xpath = "//*[@id=\"couponTable_info\"]")
    public WebElement textOfTheShowing11To11Of11Entries;

}
