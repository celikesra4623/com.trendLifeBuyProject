package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.admin.PageSupportTicketStatus51;
import pages.comp.CompToastMessage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_51_SupportTicket_StatusStepDefination {
    PageSupportTicketStatus51 pageSupportTicketStatus51=new PageSupportTicketStatus51();
    CompToastMessage compToastMessage;

    @Then("Click Support Ticket")
    public void click_support_ticket() {
        ReusableMethods.clickWithJS(pageSupportTicketStatus51.linkSupportTicket);
        ReusableMethods.wait(3);



    }
    @Then("Click Status")
    public void click_status() {
        pageSupportTicketStatus51.linkStatusSupportTicket.click();

    }
    @Then("Verify that it to the status page")
    public void verify_that_it_to_the_status_page() {
       String expectetUrl="https://trendlifebuy.com/admin/ticket/status";
       String actuelUrl=Driver.getDriver().getCurrentUrl();
       Assert.assertEquals(expectetUrl,actuelUrl);
   //  Assert.assertTrue(pageSupportTicketStatus51.titleStatusList.isDisplayed());  Bu sekilde de yapilabilir


    }
    @When("Enter a name in the name box")
    public void enter_a_name_in_the_name_box() {
        pageSupportTicketStatus51.fieldName.sendKeys("Salih");

    }
    @Then("Choose the status of status")
    public void choose_the_status_of_status() {
        pageSupportTicketStatus51.radioButtonAktiveStatus.click();

    }
    @Then("Verify that a new Status has been created")
    public void verify_that_a_new_status_has_been_created() {
 //       compToastMessage.labelMessageToast.isDisplayed();
        pageSupportTicketStatus51.addedName.isDisplayed();

    }

    @And("Verify that Statuses are displayed by Name, Status, Action in Status List")
    public void verifyThatStatusesAreDisplayedByNameStatusActionInStatusList() {
        Assert.assertTrue(pageSupportTicketStatus51.titleSl.isDisplayed());
        Assert.assertTrue(pageSupportTicketStatus51.titleName.isDisplayed());
        Assert.assertTrue(pageSupportTicketStatus51.titleStatus.isDisplayed());
        Assert.assertTrue(pageSupportTicketStatus51.titleAction.isDisplayed());
    }
    @When("Click Name Title")
    public void click_name_title() {
        
    }

    @When("Verify that Statuses is displayed by Namen in Status List")
    public void verify_that_statuses_is_displayed_by_namen_in_status_list() {

    }
    @Then("Click Action Title")
    public void click_action_title() {

    }
    @Then("Verify that Statuses is displayed by  Action in Status List")
    public void verify_that_statuses_is_displayed_by_action_in_status_list() {
        CompToastMessage xyz=new CompToastMessage();
        WebElement toast = ReusableMethods.waitForVisibility(xyz.labelMessageToast, 1);
        toast.isDisplayed();

    }
    @When("Click Seleckt")
    public void click_seleckt() {
        ReusableMethods.clickWithJS(pageSupportTicketStatus51.dropDownMenüSelect);

    }
    @When("Verify that Edit link is visible")
    public void verify_that_edit_link_is_visible() {
        Assert.assertTrue(pageSupportTicketStatus51.linkEditDropDown.isDisplayed());

    }

    @Then("Click Edit")
    public void clickEdit() {
        ReusableMethods.clickWithJS(pageSupportTicketStatus51.linkEditDropDown);
        
    }

    @And("Verify that the edit page is opened")
    public void verifyThatTheEditPageIsOpened() {
        Assert.assertTrue(pageSupportTicketStatus51.titleEdit.isDisplayed());
        
    }


    @And("Verify that the Name and Status of the Status can be updated")
    public void verifyThatTheNameAndStatusOfTheStatusCanBeUpdated() {
        CompToastMessage xyz=new CompToastMessage();
        WebElement toast = ReusableMethods.waitForVisibility(xyz.labelMessageToast, 1);
        toast.isDisplayed();
    }

    @Then("Click Save")
    public void clickSave() {

        pageSupportTicketStatus51.buttonSaveStatus.click();
    }

    @Then("Choose the Inactive of status")
    public void chooseTheInactiveOfStatus() {
        ReusableMethods.wait(2);
        pageSupportTicketStatus51.radioButtonInktiveStatus.click();
    }

    @When("Enter a {string} in the name box")
    public void enterAInTheNameBox(String nameToAdded) {
        pageSupportTicketStatus51.fieldName.sendKeys(nameToAdded);
    }

    @Then("Click Radio Button Status")
    public void clickRadioButtonStatus() {
        pageSupportTicketStatus51.radyoButonuStatus.click();
    }

    @Then("Click Update Status")
    public void clickUpdateStatus() {
        ReusableMethods.wait(2);
        pageSupportTicketStatus51.buttonUpdate.click();
    }
    @Then("Clicks Products Review")
    public void clicks_products_review() {
        pageSupportTicketStatus51.linkProductReview.click();

        
    }
    @Then("Verify Product Review Page is visible")
    public void verify_product_review_page_is_visible() {
        String expectetUrl="https://trendlifebuy.com/admin-report/product-review";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectetUrl,actualUrl);
       
    }

    @And("Verify that the Product Review List visible")
    public void verifyThatTheProductReviewListVisible() {
        Assert.assertTrue(pageSupportTicketStatus51.textProductReview.isDisplayed());
        
    }

    @When("Enter {string} in the Quick Search box")
    public void enterInTheQuickSearchBox(String arg0) {
        pageSupportTicketStatus51.fieldQuickSearchProductReview.sendKeys("Sun glass");
        ReusableMethods.waitForVisibility(pageSupportTicketStatus51.rowFirstValues.get(0),5);

    }

    @And("Verify that it is possible to search from the Quick Search TextBox")
    public void verifyThatItIsPossibleToSearchFromTheQuickSearchTextBox() {

        boolean keyWordExist=false;
        for (WebElement coulum:pageSupportTicketStatus51.rowFirstValues){
          if (coulum.getText().contains("Sun glass")){
              keyWordExist=true;
              break;
          }

        }
     Assert.assertTrue(keyWordExist);

    }

    @And("Verify that products are listed under Product, Rating, Number of Review")
    public void verifyThatProductsAreListedUnderProductRatingNumberOfReview() {
        Assert.assertTrue(pageSupportTicketStatus51.headerProductProductReview.isDisplayed());
        Assert.assertTrue(pageSupportTicketStatus51.headerNumberOfReviewProductReview.isDisplayed());
        Assert.assertTrue(pageSupportTicketStatus51.headerRatingProductReview.isDisplayed());


    }
}
