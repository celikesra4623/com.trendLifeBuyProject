package stepDefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.user.PageUserDashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015_PageUserDashboard {

    PageUserDashboard userDashboard = new PageUserDashboard();
    Faker faker = new Faker();

    Actions actions = new Actions(Driver.getDriver());

    public static final String RECHARGE_AMOUNT = "100";
    public static final String E_MAIL = "seher@gmail.com";


    @When("The user clicks the Dashboard button")
    public void theUserClicksDashboardButton() {
        userDashboard.buttonDashboard.click();
    }

    @Then("The user sees the Dashboard relevant page")
    public void theUserSeesTheDashboardRelevantPage() {
        String currentUserDashboardUrl = Driver.getDriver().getCurrentUrl();
        String expectedUserDashboardUrl = "https://trendlifebuy.com/profile/dashboard";
        Assert.assertEquals(expectedUserDashboardUrl, currentUserDashboardUrl);
    }

    @Then("The user sees the User Name on the dashboard page")
    public void theUserSeesTheUserNameOnTheDashboardPage() {
        String currentUserName = userDashboard.labelUserName.getText();
        System.out.println(currentUserName);
        String expectedUserName = "User_2112064405589 Surname_219436883831";
        Assert.assertTrue(userDashboard.labelUserName.isDisplayed());
        Assert.assertEquals(expectedUserName, currentUserName);
    }

    @And("The user sees the E-mail address on the dashboard page")
    public void theUserSeesTheEMailAddressOnTheDashboardPage() {
        Assert.assertTrue(userDashboard.labelEmail.isDisplayed());
    }

    @Then("The user sees the All Order boards on the Dashboard page")
    public void theUserSeesTheAllOrderBoardsOnTheDashboardPage() {
        Assert.assertTrue(userDashboard.labelAllOrder.isDisplayed());
    }

    @Then("The user sees the My Wishlist boards on the Dashboard page")
    public void theUserSeesTheMyWishlistBoardsOnTheDashboardPage() {
        Assert.assertTrue(userDashboard.labelMyWishlist.isDisplayed());
    }

    @Then("The user sees the Refund Success boards on the Dashboard page")
    public void theUserSeesTheRefundSuccessBoardsOnTheDashboardPage() {
        Assert.assertTrue(userDashboard.labelRefundSuccess.isDisplayed());
    }

    @Then("The user sees the Product in Cart boards on the Dashboard page")
    public void theUserSeesTheProductInCartBoardsOnTheDashboardPage() {
        Assert.assertTrue(userDashboard.labelProductInCart.isDisplayed());
    }

    @Then("The user sees the Coupon Used boards on the Dashboard page")
    public void theUserSeesTheCouponUsedBoardsOnTheDashboardPage() {
        Assert.assertTrue(userDashboard.labelCouponUsed.isDisplayed());
    }


    @And("The user sees the Completed Order boards on the Dashboard page")
    public void theUserSeesTheCompletedOrderBoardsOnTheDashboardPage() {
        Assert.assertTrue(userDashboard.labelCompletedOrder.isDisplayed());
    }

    @And("The user sees the Total Balance Amount.")
    public void theUserSeesTheTotalBalanceAmount() {
        Assert.assertTrue(userDashboard.labelTotalBalanceAmount1.isDisplayed());
        System.out.println(userDashboard.labelTotalBalanceAmount1.getText());
    }

    @When("The user clicks the Recharge Wallet")
    public void theUserClicksTheRechargeWallet() {
        ReusableMethods.clickElementByJS(userDashboard.buttonRechargeWallet);
        //userDashboard.buttonRechargeWallet.click();
    }

    @Then("The user sees the Recharge Amount window the relevant which the Recharge Wallet")
    public void theUserSeesTheRechargeAmountWindowTheRelevantWhichTheRechargeWallet() {
        ReusableMethods.waitForVisibility(userDashboard.labelRechargeAmountWindow, 10);
        Assert.assertTrue(userDashboard.labelRechargeAmountWindow.isDisplayed());
    }

    @Then("The user clicks the Enter Recharge Amount button")
    public void theUserClicksTheEnterRechargeAmountButton() {
        userDashboard.fieldEnterRechargeAmount.click();
    }

    @Then("The user enters a number")
    public void theUserEntersANumber() {
        ReusableMethods.wait(10);
        userDashboard.fieldEnterRechargeAmount.sendKeys(RECHARGE_AMOUNT);
    }

    @Then("The user clicks the Add Fund button")
    public void theUserClicksTheAddFundButton() {
        userDashboard.buttonAddFund.click();
    }

    @Then("The user clicks the stripe button")
    public void theUserClicksTheStripeButton() {
        userDashboard.buttonStripe.click();
    }

    @Then("The user enters her email address")
    public void theUserEntersHerEmailAddress() {
        ReusableMethods.wait(30);
        //JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        //executor.executeScript("arguments[0].click();", userDashboard.fieldEmailStripePayment);
        //executor.executeScript(E_MAIL);
        //userDashboard.fieldEmailStripePayment.click();
        //userDashboard.fieldEmailStripePayment.sendKeys(E_MAIL);
    }

    @Then("The user enters Card Number")
    public void theUserEntersCardNumber() {
        ReusableMethods.wait(5);
        userDashboard.fieldCardNumberStripePayment.sendKeys("4242 4242 4242 4242");
    }

    @Then("The user enters month and year knowledge")
    public void theUserEntersMonthAndYearKnowledge() {
        ReusableMethods.wait(5);
        userDashboard.fieldMonthYearStripePayment.sendKeys("11/24");
    }

    @Then("The user enters CVC knowledge")
    public void theUserEntersCVCKnowledge() {
        ReusableMethods.wait(5);
        userDashboard.fieldCvcStripePayment.sendKeys("123");
    }

    @And("The user clicks the Pay button")
    public void theUserClicksThePayButton() {
        userDashboard.buttonPayStripePayment.click();
    }

    @And("The user sees that the total Balance Amount has increased.")
    public void theUserSeesThatTheTotalBalanceAmountHasIncreased() {
        System.out.println(userDashboard.labelTotalBalanceAmount2.getText());
        Assert.assertNotEquals("Total Balance Amount artti.",
                userDashboard.labelTotalBalanceAmount1.getText()
                        .equals(userDashboard.labelTotalBalanceAmount2.getText()));
    }

    @When("The user clicks the See All button on the Purchase History board")
    public void theUserClicksTheSeeAllButtonOnThePurchaseHistoryBoard() {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        //userDashboard.buttonSeeAllPurchaseHistory.click();
        ReusableMethods.clickElementByJS(userDashboard.buttonSeeAllPurchaseHistory);

    }

    @And("The user sees the Purchase History relevant page.")
    public void theUserSeesThePurchaseHistoryRelevantPage() {
        Assert.assertTrue(userDashboard.labelPurchaseHistory.isDisplayed());
    }

    @When("The user clicks the See All button on the My Wishlist board")
    public void theUserClicksTheSeeAllButtonOnTheMyWishlistBoard() {
        ReusableMethods.clickElementByJS(userDashboard.buttonSeeAllMyWishlist);

    }

    @And("The user sees the My Wishlist relevant page.")
    public void theUserSeesTheMyWishlistRelevantPage() {
        String actualMyWishListPageUrl = Driver.getDriver().getCurrentUrl();
        //System.out.println(actualMyWishListPageUrl);
        String expectedMyWishListPageUrl = "https://trendlifebuy.com/my-wishlist";
        Assert.assertEquals(expectedMyWishListPageUrl, actualMyWishListPageUrl);
    }

    @When("The user clicks the See All button on the Recent Order board")
    public void theUserClicksTheSeeAllButtonOnTheRecentOrderBoard() {
        ReusableMethods.clickElementByJS(userDashboard.buttonSeeAllRecentOrder);
    }

    @And("The user sees the Recent Order relevant page.")
    public void theUserSeesTheRecentOrderRelevantPage() {
        String actualRecentOrderPageUrl = Driver.getDriver().getCurrentUrl();
        String expectedRecentOrderPageUrl = "https://trendlifebuy.com/my-purchase-orders";
        Assert.assertEquals(expectedRecentOrderPageUrl, actualRecentOrderPageUrl);
    }

    @When("The user clicks the See All button on the Product in Cart board")
    public void theUserClicksTheSeeAllButtonOnTheProductInCartBoard() {
        ReusableMethods.clickElementByJS(userDashboard.buttonSeeAllProductInCart);
    }

    @And("The user sees the Product in Cart relevant page.")
    public void theUserSeesTheProductInCartRelevantPage() {
        String actualRecentOrderPageUrl = Driver.getDriver().getCurrentUrl();
        String expectedRecentOrderPageUrl = "https://trendlifebuy.com/cart";
        Assert.assertEquals(expectedRecentOrderPageUrl, actualRecentOrderPageUrl);
    }
}
