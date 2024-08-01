package stepDefinitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.admin.PageAdminDashboard;
import pages.admin.PageSubscriber;
import pages.user.PageHome;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;

import java.util.*;
import java.util.Arrays;

public class US_036_PageSubscriber {

    PageAdminDashboard dashboard = new PageAdminDashboard();
    PageSubscriber pageSubscriber;


    //@US-36 @US-294

    @When("Admin clicks Marketing dropdown menu")
    public void admin_clicks_marketing_dropdown_menu() {
        ReusableMethods.wait(5);
        dashboard.dropDownMarketing.click();
    }
    @When("Admin clicks Subscribers menu item")
    public void admin_clicks_subscribers_menu_item() {
        pageSubscriber = new PageSubscriber();
        pageSubscriber.dropDownSubscribers.click();
    }
    @Then("Admin sees headings of the Subscriber List")
    public void admin_sees_headings_of_the_subscriber_list() {

        List<String> expectedHeadingList = Arrays.asList("SL", "EMAIL", "DATE", "STATUS", "IS VERIFIED", "ACTION");
        List<String> actualHeadingList = ReusableMethods.getElementsText(pageSubscriber.tableHeadingListSubscriber);
        Assert.assertTrue(actualHeadingList.containsAll(expectedHeadingList));
        Driver.getDriver().close();
    }






    // @US-36 @US-295
    @Then ("Admin should see the text indicating that the Verification link was sent successfully")
    public void admin_should_see_the_text_indicating_that_the_verification_link_was_sent_successfully () {

        ReusableMethods.clickElementByJS(pageSubscriber.buttonSelect);
        Actions actions = new Actions (Driver.getDriver());
        actions.moveToElement(pageSubscriber.linkSendVerify).perform();
        ReusableMethods.clickElementByJS(pageSubscriber.linkSendVerify);
        Assert.assertTrue("Tost Button is not displayed", pageSubscriber.tostMessageVerification.isDisplayed());
        Driver.getDriver().close();
    }


    // @US-36 @US-296

    @Given("admin subscribes to newsletter")
    public void admin_subscribes_to_newsletter() {
        Driver.getDriver().get(URLReader.getUrl("url.user.home"));
        PageHome pageHome = new PageHome();
        pageHome.cookies.click();
        pageHome.boxSubscribeNewsLetter.sendKeys("u_28_4768504517@wisequarter.com");
        pageHome.buttonSubscribeNewsLetter.click();
        Driver.getDriver().close();

    }

    @Then("Admin should see that the Subscriber List record has been deleted when the Delete link is clicked.")
    public void admin_should_see_that_the_subscriber_list_record_has_been_deleted_when_the_delete_link_is_clicked() {


        Actions actions = new Actions (Driver.getDriver());
        actions.moveToElement(pageSubscriber.buttonSelect).perform();
        pageSubscriber.buttonSelect.click();
        ReusableMethods.clickElementByJS(pageSubscriber.linkDelete);
        ReusableMethods.clickElementByJS(pageSubscriber.buttonDelete);
        ReusableMethods.clickElementByJS(pageSubscriber.buttonDeleteCross);
        ReusableMethods.wait(3000);
        String expectedTostMessage = "Deleted successfully!";
        String actualTostMessage = pageSubscriber.tostMessageDelete.getText();
        Assert.assertNotEquals("Tost Message", expectedTostMessage,actualTostMessage);
        Driver.getDriver().close();
    }


    // @US-36 @US-297

    @Then("Admin should see that the records can be changed to active\\/inactive.")
    public void admin_should_see_that_the_records_can_be_changed_to_active_inactive() {

        ReusableMethods.clickElementByJS(pageSubscriber.buttonActiveRadio);
        Assert.assertTrue(pageSubscriber.tosMessageRadioButton.isDisplayed());
        //Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(pageSubscriber.buttonActiveRadio).perform();
        //ReusableMethods.clickElementByJS(pageSubscriber.buttonActiveRadio);
        //Assert.assertTrue(pageSubscriber.tosMessageRadioButton.isDisplayed());
        //Assert.assertTrue("Tost Button is not active", pageSubscriber.tosMessageRadioButton.isDisplayed());
        Driver.getDriver().close();
    }







}
