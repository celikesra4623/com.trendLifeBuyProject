package pages.admin;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PagerRechargeOfflineIndex {
    public PagerRechargeOfflineIndex() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (xpath = "//*[@id=\"sidebar_menu\"]/li[13]/ul/li[3]/a")
    public WebElement buttonOfflineRecharge;

    @FindBy(xpath = "//th[@class='sorting']")
    public List<WebElement> tableHeadingListOfflineRecharge;






}
