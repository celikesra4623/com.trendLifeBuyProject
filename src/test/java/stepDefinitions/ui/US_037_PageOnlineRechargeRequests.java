package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.admin.PageAdminDashboard;
import pages.admin.PageSubscriber;
import pages.admin.PagerRechargeOfflineIndex;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class US_037_PageOnlineRechargeRequests {

    //@US-37 @US-298
    PageAdminDashboard dashboard = new PageAdminDashboard();
    PagerRechargeOfflineIndex pagerRechargeOfflineIndex = new PagerRechargeOfflineIndex();

    @When("Admin clicks Wallet Manage dropdown menu")
    public void admin_wallet_manage_dropdown_menu() {
        dashboard.dropDownWalletManege.click();
    }


    @When("Admin clicks Offline Recharge menu item")
    public void admin_clicks_offline_recharge_menu_item() {
        pagerRechargeOfflineIndex.buttonOfflineRecharge.click();
    }


    @Then("Admin sees headings of the Offline Recharge List")
    public void admin_sees_headings_of_the_offline_recharge_list() {

        List<String> expectedHeadingList = Arrays.asList("SL", "EMAIL", "TXN ID", "AMOUNT", "TYPE", "PAYMENT METHOD");
        List<String> actualHeadingList = ReusableMethods.getElementsText(pagerRechargeOfflineIndex.tableHeadingListOfflineRecharge);
        Assert.assertTrue(actualHeadingList.containsAll(expectedHeadingList));
        Driver.getDriver().close();
    }

























}
