package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.HashMap;
import java.util.Map;

public class PageAboutUs {

    public PageAboutUs(){
        PageFactory.initElements(Driver.getDriver(), this);
        mapTextWebElement.put("Quality and Reasonable Prices",textQualityAndReasonablePrices);
        mapTextWebElement.put("Client Worldwide",textClientWorldwideNumber);
        mapTextWebElement.put("Successful Project",textSuccessfulProjectNumber);
        mapTextWebElement.put("Work Employed",textWorkEmployedNumber);
        mapTextWebElement.put("Planning Services",textPlanningServicesNumber);
        mapTextWebElement.put("online shopping easy and cost-efficient",textOnlineShoppingEasyAndCostEfficient);
        mapTextWebElement.put("Team member",textTeamMember);
        mapTextWebElement.put("Robert Pattinson",nameRobertPattinson);
        mapTextWebElement.put("Founder & CEO",statusRobertPattinson);
        mapTextWebElement.put("Johnny Depp",nameJohnnyDepp);
        mapTextWebElement.put("Jason Statham",nameJasonStatham);
        mapTextWebElement.put("Bradley Cooper",nameBradleyCooper);

    }

    public static Map<String,WebElement> mapTextWebElement=new HashMap<>();
    @FindBy(xpath = "//a[text()='About Us'][1]")
    public WebElement buttonAboutUs;

    @FindBy(xpath = "//*[text()='Quality and Reasonable Prices']")
    public WebElement textQualityAndReasonablePrices;

    @FindBy(xpath = "//*[text()='Client Worldwide']")
    public WebElement textClientWorldwideNumber;

    @FindBy(xpath = "//*[text()='Successful Project']")
    public WebElement textSuccessfulProjectNumber;

    @FindBy(xpath = "//*[text()='Work Employed']")
    public WebElement textWorkEmployedNumber;

    @FindBy(xpath = "//*[text()='Planning Services']")
    public WebElement textPlanningServicesNumber;

    @FindBy(xpath = "//*[text()='online shopping easy and cost-efficient']")
    public WebElement textOnlineShoppingEasyAndCostEfficient;

    @FindBy(xpath = "//*[text()='Team member']")
    public WebElement textTeamMember;

    @FindBy(xpath = "//*[text()='Robert Pattinson']")
    public WebElement nameRobertPattinson;

    @FindBy(xpath = "//*[text()='Founder & CEO'][1]")
    public WebElement statusRobertPattinson;

    @FindBy(xpath = "//img[@src='http://amazy.rishfa.com/public/frontend/amazy/img/team/1.jpg']")
    public WebElement imageProfileRobertPattinson;

    @FindBy(xpath = "//*[text()='Johnny Depp']")
    public WebElement nameJohnnyDepp;

    @FindBy(xpath = "//*[text()='Founder & CEO']")
    public WebElement statusJohnnyDepp;

    @FindBy(xpath = "//img[@src='http://amazy.rishfa.com/public/frontend/amazy/img/team/2.jpg']")
    public WebElement imageProfileJohnnyDepp;

    @FindBy(xpath = "//*[text()='Jason Statham']")
    public WebElement nameJasonStatham;

    @FindBy(xpath = "//*[text()='Founder & CEO']")
    public WebElement statusJasonStatham;

    @FindBy(xpath = "//img[@src=\"http://amazy.rishfa.com/public/frontend/amazy/img/team/3.jpg\"]")
    public WebElement imageProfileJasonStatham;

    @FindBy(xpath = "//*[text()='Bradley Cooper']")
    public WebElement nameBradleyCooper;

    @FindBy(xpath = "//*[text()='Founder & CEO']")
    public WebElement statusBradleyCooper;

    @FindBy(xpath = "//img[@src=\"http://amazy.rishfa.com/public/frontend/amazy/img/team/4.jpg\"]")
    public WebElement imageProfileBradleyCooper;



}
