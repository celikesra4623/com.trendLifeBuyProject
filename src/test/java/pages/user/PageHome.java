package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageHome {
    public PageHome() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindAll(
            {@FindBy(xpath =
                    "//div[contains(@class, 'trending_product_active')]" +
                            "//div[@class='owl-item active']" +
                            "//img[contains(@data-src, 'https://trendlifebuy.com/public/uploads/images/')]")
            })
    public List<WebElement> productListTrending;

    @FindBy(xpath = "(//div[contains(@class, 'trending_product_active')]" +
            "//div[@class='owl-item active'])[1]")
    public WebElement firstProductInTrending;

    @FindBy(xpath = "(//div[contains(@class, 'trending_product_active')]" +
            "//div[@class='owl-item active'])[1]//a//h4")
    public WebElement labelProductHeader;

    @FindBy(xpath =
            "(//div[contains(@class, 'trending_product_active')]" +
                    "//div[@class='owl-item active']" +
                    "//div[@class='product_prise']//p)[1]")
    public WebElement labelProductPrice;

    @FindBy(css = "div.product_widget5:hover .product_prise .add_cart")
    public WebElement buttonAddToCard;
    @FindBy (xpath = "(//i[@class='ti-close'])[2]")
    public WebElement cookies;

    @FindBy (xpath = "//input[@id='subscription_email_id']")
    public WebElement boxSubscribeNewsLetter;

    @FindBy (xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[2]/form/button")
    public WebElement buttonSubscribeNewsLetter;


    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/'])[1]")
    public WebElement buttonHome;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/blog'])[1]")
    public WebElement buttonBlog;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/contact-us'])[1]")
    public WebElement buttonContactUs;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/about-us'])[1]")
    public WebElement buttonAboutUs;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/new-user-zone/new-user-gifts-choose-one'])[1]")
    public WebElement buttonNewUserZone;

    @FindBy(xpath = "//a[@class='Categories_togler']")
    public WebElement buttonAllCategories;

    @FindBy(xpath = "//th[@scope='col']")
    public List<WebElement> allCategoriesList;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/profile']")
    public WebElement buttonMyAccount;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/my-purchase-orders']")
    public WebElement buttonOrderStatus;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/profile/referral']")
    public WebElement buttonReferral;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/coupons']")
    public WebElement buttonCoupons;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/about-us'])[3]")
    public WebElement buttonAboutUsLast;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/contact-us'])[3]")
    public WebElement buttonContactUsLast;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/career']")
    public WebElement buttonCareer;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/return-exchange']")
    public WebElement buttonRefundPolicy;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/terms-condition']")
    public WebElement buttonTermsCondition;

    @FindBy(xpath = "(//a[@href='https://play.google.com/store/games'])[2]")
    public WebElement buttonPlayStoreLast;

    @FindBy(xpath = "(//a[@href='https://www.apple.com/app-store/'])[2]")
    public WebElement buttonAppStoreLast;

    @FindBy(xpath = "//div[@id='back-top']")
    public WebElement buttonBackTop;

    @FindBy(xpath = "//a[@href='https://www.twitter.com/']")
    public WebElement buttonTwitter;

    @FindBy(xpath = "//a[@href='https://linkedin.com']")
    public WebElement buttonLinkedin;

    @FindBy(xpath = "//a[@href='https://www.instagram.com']")
    public WebElement buttonInstagram;

    @FindBy(xpath = "//a[@href='https://www.facebook.com']")
    public WebElement buttonFacebook;

    @FindBy(xpath = "//h3[@id='best_deals_title']")
    public WebElement labelTrendingProducts;

    @FindBy(xpath = "//h3[@id='feature_categories_title']")
    public WebElement labelHotCategories;

    @FindBy(xpath = "//h4[@id='filter_category_title']")
    public WebElement labelHouseAppliances;

    @FindBy(xpath = "//h4[@class='mb-0']")
    public WebElement labelRecommendationForYou;

    @FindBy(xpath = "//h3[@id='top_brands_title']")
    public WebElement labelTopBrand;

    @FindBy(xpath = "(//h3[@class='m-0 flex-fill'])[4]")
    public WebElement labelPopularSearches;

    @FindBy(xpath = "(//h3[@class='m-0 flex-fill'])[5]")
    public WebElement labelTrendinglifebuyOnlineShopping;

    @FindBy(xpath = "//button[@id='tab_link_10']")
    public WebElement buttonSofa;

    @FindBy(xpath = "//button[@id='tab_link_27']")
    public WebElement buttonWoodenFurniture;

    @FindBy(xpath = "(//span[@class='title_text'])[1]")
    public WebElement buttonViewAll;

    @FindBy(xpath = "(//span[@class='title_text'])[3]")
    public WebElement buttonMoreDeals;

    @FindBy(xpath = "//a[@id='loadmore']")
    public WebElement buttonLoadMore;
}

