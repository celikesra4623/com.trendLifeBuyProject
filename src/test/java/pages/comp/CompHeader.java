package pages.comp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompHeader {

    public CompHeader() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/login'])[1]")
    public WebElement buttonLogin;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/register']")
    public WebElement buttonRegister;

    @FindBy(xpath = "//a[@class='log_out']")
    public WebElement buttonLogout;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement buttonDashboard;

    @FindBy(xpath = "(//a[@href='https://play.google.com/store/games'])[1]")
    public WebElement buttonPlayStore;

    @FindBy(xpath = "(//a[@href='https://www.apple.com/app-store/'])[1]")
    public WebElement buttonAppStore;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/track-order']")
    public WebElement buttonTrackYourOrder;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/compare']")
    public WebElement buttonCompare;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/my-wishlist']")
    public WebElement buttonWishlist;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/cart']")
    public WebElement buttonCart;

    @FindBy(xpath = "//img[@src='https://trendlifebuy.com/public/uploads/settings/63985b425a3e6.png']")
    public WebElement buttonLogo;

    @FindBy(xpath = "(//input[@id='inlineFormInputGroup'])[1]")
    public WebElement fieldSearchBox;

    @FindBy(xpath = "//button[@id='search_button']")
    public WebElement buttonSearchBox;


    public void logout() {
        buttonLogout.click();
    }
}
