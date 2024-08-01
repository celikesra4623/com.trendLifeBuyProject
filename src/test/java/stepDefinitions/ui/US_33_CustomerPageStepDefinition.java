package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.admin.PageAdminCustomer33;
import pages.comp.CompToastMessage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_33_CustomerPageStepDefinition {
    PageAdminCustomer33 pageAdminCustomer33 = new PageAdminCustomer33();
    ReusableMethods reusableMethods = new ReusableMethods();
    CompToastMessage compToastMessage = new CompToastMessage();

    @Then("Click Customer")
    public void click_customer() {
        pageAdminCustomer33.buttonCustomer.click();
    }

    @Then("Click All Customer")
    public void click_all_customer() {
        pageAdminCustomer33.buttonAllCustomerSideBar.click();
    }

    @Then("Verify that all customers page is accessible")
    public void verify_that_all_customers_page_is_accessible() {
        Assert.assertTrue(pageAdminCustomer33.textAllCustomer.isDisplayed());
    }

    @Then("Verify that the All Customer List is visible on the All Customer page")
    public void verify_that_the_all_customer_list_is_visible_on_the_all_customer_page() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        reusableMethods.wait(2);
        Assert.assertTrue(pageAdminCustomer33.textShowingAllCustomer.isDisplayed());

    }

    @Then("Click the Radio Button is Active")
    public void click_the_radio_button_is_active() {
        reusableMethods.wait(3);
        pageAdminCustomer33.radyoButtonIsActive.click();
    }
//   @Then("Verify if the customer 's active state has changed")
//   public void verify_if_the_customer_s_active_state_has_changed() {

    //   }
    @Then("Click Active Costumer")
    public void click_active_costumer() {
        pageAdminCustomer33.buttonActiveCustomer.click();
        reusableMethods.wait(3);
    }

    @Then("Verify Active Customer is visible")
    public void verify_active_customer_is_visible() {
        Assert.assertTrue(pageAdminCustomer33.textActiveCustomer.isDisplayed());
    }

    @Then("Click button Plus")
    public void click_button_plus() {
        ReusableMethods.clickElementByJS(pageAdminCustomer33.buttonPlus);
        reusableMethods.wait(3);

    }

    @Then("Click seleckt DropDown")
    public void click_seleckt_drop_down() {
        ReusableMethods.clickWithJS(pageAdminCustomer33.dropDownMenüSelect);
        reusableMethods.wait(10);

    }

    @Then("Verify that Details, Edit, Delete links are visible")
    public void verify_that_details_edit_delete_links_are_visible() {
        Assert.assertTrue(pageAdminCustomer33.linkEditDropDown.isDisplayed());
        Assert.assertTrue(pageAdminCustomer33.linkDeleteDropDown.isDisplayed());
        Assert.assertTrue(pageAdminCustomer33.linkDetailsDropDown.isDisplayed());

    }

    @Then("Verify if the customer 's active state has changed")
    public void verify_if_the_customer_s_active_state_has_changed() {
        compToastMessage.labelMessageToast.isDisplayed();
    }

    @Then("Click Details button")
    public void click_details_button() {
        pageAdminCustomer33.linkDetailsDropDown.click();

    }

    @Then("Verify Customer Profil is visible")
    public void verify_customer_profil_is_visible() {
        String expectetUrl="https://trendlifebuy.com/customer/profile/details";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectetUrl));

    }
    @Then("Verify Name is visible")
    public void verify_name_is_visible() {
        pageAdminCustomer33.textName.isDisplayed();
    }
    @Then("Verify Email is visible")
    public void verify_email_is_visible() {
      pageAdminCustomer33.textEmail.isDisplayed();
    }
    @Then("Verify Phone is visible")
    public void verify_phone_is_visible() {
        pageAdminCustomer33.textPhone.isDisplayed();
    }
    @Then("Verify Registered  is visible")
    public void verify_registered_is_visible() {
        pageAdminCustomer33.textRegisteredDate.isDisplayed();
    }
    @Then("Verify Active Status is visible")
    public void verify_active_status_is_visible() {
      pageAdminCustomer33.textActiveStatus.isDisplayed();
    }
    @Then("Verify Total Orders is visible")
    public void verify_total_orders_is_visible() {
        pageAdminCustomer33.textTotalOrders.isDisplayed();
    }
    @Then("Verify Confirmed Order is visible")
    public void verify_confirmed_order_is_visible() {
      pageAdminCustomer33.textConfirmedOrder.isDisplayed();
    }
    @Then("Verify Pending Order is visible")
    public void verify_pending_order_is_visible() {
       pageAdminCustomer33.textPendingOrder.isDisplayed();
    }
    @Then("Verify Completed Order is visible")
    public void verify_completed_order_is_visible() {
        pageAdminCustomer33.textCompletedOrder.isDisplayed();
    }
    @Then("Verify Cancelled Order is visible")
    public void verify_cancelled_order_is_visible() {
       pageAdminCustomer33.textCancelledOrder.isDisplayed();
    }
    @Then("Verify Total Recharge is visible")
    public void verify_total_recharge_is_visible() {
        pageAdminCustomer33.textTotalRecharge.isDisplayed();
    }
    @Then("Verify Pending Balance Approval is visible")
    public void verify_pending_balance_approval_is_visible() {
  pageAdminCustomer33.textPendingBalanceApproval.isDisplayed();
    }
    @Then("Verify Total Balance is visible")
    public void verify_total_balance_is_visible() {
      pageAdminCustomer33.textTotalBalance.isDisplayed();
    }
    @Then("Verify Orders is visible")
    public void verify_orders_is_visible() {
     pageAdminCustomer33.buttonOrders.isDisplayed();
    }
    @Then("Verify Wallet Histories is visible")
    public void verify_wallet_histories_is_visible() {
        pageAdminCustomer33.buttonWalletHistories.isDisplayed();
    }
    @Then("Verify Adresses is visible")
    public void verify_adresses_is_visible() {
       pageAdminCustomer33.buttonAdresses.isDisplayed();
    }

    @Then("Click Wallet Histories")
    public void clickWalletHistories() {
        pageAdminCustomer33.buttonWalletHistories.click();
    }
    @Then("Verify Date is visible")
    public void verify_date_is_visible() {
        pageAdminCustomer33.shortheaderDate.isDisplayed();
    }
    @Then("Verify User is visible")
    public void verify_user_is_visible() {
       pageAdminCustomer33.shortheaderUser.isDisplayed();
    }
    @Then("Verify TxnId is visible")
    public void verify_txn_id_is_visible() {
       pageAdminCustomer33.shortheaderTxdId.isDisplayed();
    }
    @Then("Verify Amaunt is visible")
    public void verify_amaunt_is_visible() {
       pageAdminCustomer33.shortheaderAmount.isDisplayed();
    }
    @Then("Verify Type is visible")
    public void verify_type_is_visible() {
        pageAdminCustomer33.shortheaderType.isDisplayed();
    }
    @Then("Verify PaymentMethod is visible")
    public void verify_payment_method_is_visible() {
        pageAdminCustomer33.shortheaderPaymentMethod.isDisplayed();
    }
    @Then("Verify Approval is visible")
    public void verify_approval_is_visible() {
       pageAdminCustomer33.shortheaderApproval.isDisplayed();
    }
    @Then("Click Address")
    public void click_address() {
        pageAdminCustomer33.buttonAdresses.click();
    }
    @Then("Verify Sl is visible")
    public void verify_sl_is_visible() {
        pageAdminCustomer33.shortheaderSl.isDisplayed();
    }
    @Then("Verify Full Name is visible")
    public void verify_full_name_is_visible() {
       pageAdminCustomer33.shortheaderFullName.isDisplayed();
    }
    @Then("Verify Region is visible")
    public void verify_region_is_visible() {
       pageAdminCustomer33.shortheaderRegion.isDisplayed();
    }
    @Then("Verify Address is visible")
    public void verify_address_is_visible() {
        pageAdminCustomer33.shortheaderAddress.isDisplayed();
    }
    @Then("Verify Phone Number is visible")
    public void verify_phone_number_is_visible() {
        pageAdminCustomer33.shortheaderPhoneNumber.isDisplayed();
    }
    @Then("Verify Postcode is visible")
    public void verify_postcode_is_visible() {
        pageAdminCustomer33.shortheaderPhoneNumber.isDisplayed();
    }
    @Then("Verify Emaill is visible")
    public void verify_emaill_is_visible() {
       pageAdminCustomer33.shortheaderEmail.isDisplayed();
    }

    @Then("Click Edit button")
    public void clickEditButton() {
        pageAdminCustomer33.linkEditDropDown.click();
    }

    @And("Verify Update Customer is visible")
    public void verifyUpdateCustomerIsVisible() {
        pageAdminCustomer33.textTitleUpdateCustomer.isDisplayed();
    }

    @Then("Click Update")
    public void clickUpdate() {
        pageAdminCustomer33.buttonUpdate.click();
    }

    @And("Verify it's updated")
    public void verifyItSUpdated() {
        compToastMessage.labelMessageToast.isDisplayed();

    }

    @Then("Click Delete button")
    public void clickDeleteButton() {
        pageAdminCustomer33.linkDeleteDropDown.click();
    }

    @Then("Verify Delete Window is visible")
    public void verifyDeleteWindowIsVisible() {
        pageAdminCustomer33.windowsDelete.isDisplayed();
    }

    @Then("Click Delete on Delete Window")
    public void clickDeleteOnDeleteWindow() {
        pageAdminCustomer33.buttonDeleteOnDeleteWindow.click();
    }

    @And("Verify it's deleted")
    public void verifyItSDeleted() {
        compToastMessage.labelMessageToast.isDisplayed();

    }

    @And("Click Inactive Costumer")
    public void clickInactiveCostumer() {
        pageAdminCustomer33.buttonInActiveCustomer.click();
    }

    @And("Verify Inactive Customer is visible")
    public void verifyInactiveCustomerIsVisible() {
        pageAdminCustomer33.textInActiveCustomer.isDisplayed();
    }

    @Then("Click Create Customer")
    public void clickCreateCustomer() {
        pageAdminCustomer33.buttonCreateCustomer.click();
    }

    @And("Verify Create Customer is visible")
    public void verifyCreateCustomerIsVisible() {
        pageAdminCustomer33.textAddNewCustomer.isDisplayed();
    }
}
