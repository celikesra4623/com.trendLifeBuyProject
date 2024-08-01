package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.comp.CompHeader;
import pages.user.PageHome;
import utilities.ConfigReader;
import utilities.Driver;

public class US_002_PageHome {

    CompHeader compHeader= new CompHeader();
    PageHome pageHome = new PageHome();

    //@US-002 @US-073
    @Then("Click Play Store button")
    public void click_play_store_button() {
        compHeader.buttonPlayStore.click();
    }
    @Then("After clicking, check that the redirected Play Store related webpages is visible")
    public void after_clicking_check_that_the_redirected_play_store_related_webpages_is_visible() {
        String expectedPlayStoreUrl = "https://play.google.com/store/games";
        String actualPlayStoreUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualPlayStoreUrl, expectedPlayStoreUrl);
    }
    @Then("Go back to the home page")
    public void go_back_to_the_home_page() {
        Driver.getDriver().navigate().back();
    }
    @Then("Click App Store button")
    public void click_app_store_button() {
        compHeader.buttonAppStore.click();
    }
    @Then("After clicking, check that the redirected Apple Store related webpages is visible")
    public void after_clicking_check_that_the_redirected_apple_store_related_webpages_is_visible() {
        String expectedAppStoreUrl = "https://www.apple.com/app-store/";
        String actualAppStoreUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualAppStoreUrl, expectedAppStoreUrl);
    }

    //@US-002 @US-074


    @When("Click Track Your Order button")
    public void click_track_your_order_button() {
        compHeader.buttonTrackYourOrder.click();
    }
    @Then("After clicking, check that the redirected Track Your Order")
    public void after_clicking_check_that_the_redirected_track_your_order() {

        String expectedTrackOrderUrl = "https://trendlifebuy.com/track-order";
        String actualTrackOrderUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualTrackOrderUrl, expectedTrackOrderUrl);

    }
    //@US-002 @US-075
    @When("Click Compare button")
    public void click_compare_button() {
        compHeader.buttonCompare.click();
    }
    @Then("After clicking, check that the redirected Compare related webpages is visible")
    public void after_clicking_check_that_the_redirected_compare_related_webpages_is_visible() {
        String expectedCompareUrl = "https://trendlifebuy.com/compare";
        String actualCompareUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualCompareUrl, expectedCompareUrl);
    }

    //@US-002 @US-076

    @When("Click Wishlist button")
    public void click_wishlist_button() {
        compHeader.buttonWishlist.click();
    }
    @Then("After clicking, check that the redirected Wishlist related webpages is visible")
    public void after_clicking_check_that_the_redirected_wishlist_related_webpages_is_visible() {
        String expectedWishlistUrl = "https://trendlifebuy.com/my-wishlist";
        String actualWishlistUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualWishlistUrl, expectedWishlistUrl);
    }

    //@US-002 @US-077

    @When("Click Cart button")
    public void click_cart_button() {
        compHeader.buttonCart.click();
    }
    @Then("After clicking, check that the redirected Cart related webpages is visible")
    public void after_clicking_check_that_the_redirected_cart_related_webpages_is_visible() {
        String expectedCartUrl = "https://trendlifebuy.com/cart";
        String actualCartUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualCartUrl, expectedCartUrl);
    }
    //@US-002 @US-078
    @When("Click Logo button")
    public void click_logo_button() {
        compHeader.buttonLogo.click();
    }
    @Then("After clicking, check that the redirected Homepage related webpages is visible")
    public void after_clicking_check_that_the_redirected_homepage_related_webpages_is_visible() {
        String expectedHomeUrl = "https://trendlifebuy.com/";
        String actualHomeUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedHomeUrl);
    }

    //@US-002 @US-079
    @When("It should be possible to search for products from the search box")
    public void it_should_be_possible_to_search_for_products_from_the_search_box() {

    }

    //@US-002 @US-080

    @When("Click Login button")
    public void click_login_button() {
        compHeader.buttonLogin.click();
    }
    @Then("After clicking, check that the redirected Login related webpages is visible")
    public void after_clicking_check_that_the_redirected_login_related_webpages_is_visible() {
        String expectedLoginUrl = "https://trendlifebuy.com/login";
        String actualLoginUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualLoginUrl, expectedLoginUrl);
    }

    //@US-002 @US-081
    @When("Click Register button")
    public void click_register_button() {
        compHeader.buttonRegister.click();
    }
    @Then("After clicking, check that the redirected Register related webpages is visible")
    public void after_clicking_check_that_the_redirected_register_related_webpages_is_visible() {
        String expectedRegisterUrl = "https://trendlifebuy.com/register";
        String actualRegisterUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualRegisterUrl, expectedRegisterUrl);
    }

    //@US-002 @US-082
    @When("Click home button")
    public void click_home_button() {
        pageHome.buttonHome.click();
    }
    @Then("After clicking, check that the redirected home related webpages is visible")
    public void after_clicking_check_that_the_redirected_home_related_webpages_is_visible() {
        String expectedHomeUrl = "https://trendlifebuy.com/";
        String actualHomeUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualHomeUrl, expectedHomeUrl);
    }

    //@US-002 @US-083
    @When("Click blog button")
    public void click_blog_button() {
        pageHome.buttonBlog.click();
    }
    @Then("After clicking, check that the redirected blog related webpages is visible")
    public void after_clicking_check_that_the_redirected_blog_related_webpages_is_visible() {
        String expectedBlogUrl = "https://trendlifebuy.com/blog";
        String actualBlogUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualBlogUrl, expectedBlogUrl);
    }

   //@US-002 @US-084
   @When("Click Contact button")
   public void click_contact_button() {
       pageHome.buttonContactUs.click();
   }
    @Then("After clicking, check that the redirected Contact related webpages is visible")
    public void after_clicking_check_that_the_redirected_contact_related_webpages_is_visible() {
        String expectedContactUrl = "https://trendlifebuy.com/contact-us";
        String actualContactUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualContactUrl, expectedContactUrl);
    }

    //@US-002 @US-085
    @When("Click About Us button")
    public void click_about_us_button() {
        pageHome.buttonAboutUs.click();
    }
    @Then("After clicking, check that the redirected About Us related webpages is visible")
    public void after_clicking_check_that_the_redirected_about_us_related_webpages_is_visible() {
        String expectedAboutUsUrl = "https://trendlifebuy.com/about-us";
        String actualAboutUsUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualAboutUsUrl, expectedAboutUsUrl);
    }

    //@US-002 @US-086

    @When("Click New User Zone button")
    public void click_new_user_zone_button() {
        pageHome.buttonNewUserZone.click();
    }
    @Then("After clicking, check that the redirected New User Zone related webpages is visible")
    public void after_clicking_check_that_the_redirected_new_user_zone_related_webpages_is_visible() {
        String expectedNewUserZoneUrl = "https://trendlifebuy.com/new-user-zone/new-user-gifts-choose-one";
        String actualNewUserZoneUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualNewUserZoneUrl, expectedNewUserZoneUrl);
    }
}
