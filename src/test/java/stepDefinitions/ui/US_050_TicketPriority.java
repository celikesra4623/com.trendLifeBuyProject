package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.admin.PageAdminLogin;
import pages.admin.PageAdmin_ProductList;
import pages.admin.PageAdmin_TicketPriority;
import pages.comp.CompToastMessage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_050_TicketPriority {

    PageAdminLogin adminLoginPage = new PageAdminLogin();
    PageAdmin_ProductList pageAdmin_productList = new PageAdmin_ProductList();
    PageAdmin_TicketPriority pageAdmin_ticketPriority=new PageAdmin_TicketPriority();



    /*****@US_428*****/
    @When("Clicks Support Ticket DDM")
    public void clicks_support_ticket_ddm() {
        ReusableMethods.clickElementByJS(pageAdmin_ticketPriority.ddmSupportTicket);
    }
    @Then("Clicks Priority Links")
    public void clicks_priority_links() {
        pageAdmin_ticketPriority.ddmPriorityLink.click();
    }
    @Then("Verify that the Priority link leads to the Priority page")
    public void verify_that_the_priority_link_leads_to_the_priority_page() {
        String expURL=ConfigReader.getProperty("expURL");
        System.out.println("expURL = " + expURL);
        String actURL=Driver.getDriver().getCurrentUrl();
        System.out.println("actURL = " + actURL);

        Assert.assertEquals("Failed to redirect to page",expURL,actURL);
    }


    /*****@US_429*****/
    @Then("Click in the Name field and enter Name")
    public void click_in_the_name_field_and_enter_name() {
        pageAdmin_ticketPriority.fieldsNamePriority.click();
        String extTextName="";
        pageAdmin_ticketPriority.fieldsNamePriority
                .sendKeys(ConfigReader.getProperty("textFielsNamePriority")+ Keys.ENTER);
        ReusableMethods.wait(2);
    }
    @Then("Click the Status radio checkbox button")
    public void click_the_status_radio_checkbox_button() {
        pageAdmin_ticketPriority.radioCheckboxActive.click();
    }
    @Then("Click Save button")
    public void click_save_button() {
        pageAdmin_ticketPriority.buttonSavePriority.click();
        ReusableMethods.wait(3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.wait(5);
    }
    @Then("Verify that a new Priority can be created for Tickets  from the Add new section")
    public void verify_that_a_new_priority_can_be_created_for_tickets_from_the_add_new_section() {
        /*List<WebElement> priorityNameList=Driver.getDriver().findElements(By.xpath("//tr/td[2]"));
        System.out.println("priorityNameList = " + priorityNameList);
        for (WebElement each: priorityNameList) {
            String nameOfPriority= each.getText();
            System.out.println("nameOfPriority = " + nameOfPriority);
            Assert.assertTrue(nameOfPriority.contains(ConfigReader.getProperty("textFielsNamePriority")));
        }*/
        WebElement namePriority=Driver.getDriver().findElement(By.xpath("(//*[@id=\"sku_tbody\"]/tr/td[2])[1]"));
        String actNamePriority= namePriority.getText();
        Assert.assertEquals("Something Went Wrong!",ConfigReader.getProperty("textFielsNamePriority"),actNamePriority);
        ReusableMethods.wait(2);
    }


    /*****@US_430*****/
    @Then("Verify that the Priorities titles are displayed under the Priority List")
    public void verify_that_the_priorities_titles_are_displayed_under_the_priority_list() {
        List<WebElement> titleDataTable=Driver.getDriver().findElements(By.xpath("//thead/tr/th"));

        List<String> expNameOfTitle= Arrays.asList("SL","NAME","STATUS","ACTION");

        /*for (WebElement each: titleDataTable) {
            String actNameOfTitle= each.getText();
            System.out.println("nameOfPriority = " + actNameOfTitle);
        }*/

        for (int i = 0; i < expNameOfTitle.size(); i++) {
            String actNameOfTitle= titleDataTable.get(i).getText();
            System.out.println("actNameOfTitle = " + actNameOfTitle);
            Assert.assertTrue("Priority headers cannot be displayed"
                    ,expNameOfTitle.get(i).equalsIgnoreCase(titleDataTable.get(i).getText()));
        }
        ReusableMethods.wait(2);
    }


    /*****@US_431*****/
    @Then("Clicks Status checkbox button")
    public void clicks_status_checkbox_button() {
        pageAdmin_ticketPriority.checkBoxStatus.click();
    }
    @Then("Verify that the status of the Priorities can be changed under the Status title in the Priority List")
    public void verify_that_the_status_of_the_priorities_can_be_changed_under_the_status_title_in_the_priority_list() {
        CompToastMessage priorityToastMessage=new CompToastMessage();
        WebElement toastmessage=ReusableMethods.waitForVisibility(priorityToastMessage.labelMessageToast,5);
        Assert.assertTrue("Failed cannot be changed",toastmessage.isDisplayed());
    }


    /*****@US_432*****/
    @Then("Clicks SELECT DDM")
    public void clicks_select_ddm() {
        ReusableMethods.clickElementByJS(pageAdmin_ticketPriority.buttonDDMSelect);
        ReusableMethods.wait(2);
        /*
        String expEditLinks="Edit";
        Select editElemnet = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"sku_tbody\"]/tr[1]/td[4]/div")));
        editElemnet.selectByIndex(0);
        String actEDit=editElemnet.getFirstSelectedOption().getText();
        Assert.assertEquals("Edit link is visible",expEditLinks,actEDit);
        */

    }
    @Then("Verify that there are edit and delete links")
    public void verify_that_there_are_edit_and_delete_links() {
        Assert.assertTrue("The EDIT link could not be displayed",pageAdmin_ticketPriority.buttonDDMSelect_EDIT.isDisplayed());
        Assert.assertTrue("The DELETE link could not be displayed",pageAdmin_ticketPriority.buttonDDMSelect_DELETE.isDisplayed());
    }


    /*****@US_433*****/
    @Then("Clicks EDIT links")
    public void clicksEDITLinks() {
        ReusableMethods.clickElementByJS(pageAdmin_ticketPriority.buttonDDMSelect_EDIT);
    }
    @Then("Verify that the Edit page is opened")
    public void verify_that_the_edit_page_is_opened() {
        ReusableMethods.wait(2);
        Assert.assertTrue("The EDIT page could not be opened",pageAdmin_ticketPriority.pageEdit_DDMSelect.isDisplayed());
        ReusableMethods.wait(2);
    }


    /*****@US_434*****/
    @Then("Edit Name and Status with new information")
    public void edit_name_and_status_with_new_information() {
        ReusableMethods.wait(2);
        pageAdmin_ticketPriority.fieldName_EditDDMSelect.clear();
        pageAdmin_ticketPriority.fieldName_EditDDMSelect.sendKeys("xxx");
        ReusableMethods.wait(2);
    }
    @Then("Clicks UPDATE button")
    public void clicks_update_button() {
        ReusableMethods.clickElementByJS(pageAdmin_ticketPriority.buttonUPDATE_PageDEdit_DDMSelect);
    }
    @Then("Verify that the Name and Status of the category can be updated")
    public void verify_that_the_name_and_status_of_the_category_can_be_updated() {
        ReusableMethods.wait(2);
        CompToastMessage priorityToastMessage=new CompToastMessage();
        WebElement toastmessage=ReusableMethods.waitForVisibility(priorityToastMessage.labelMessageToast,5);
        Assert.assertTrue("Failed update",toastmessage.isDisplayed());
    }


    /*****@US_435*****/
    @Then("Clicks DELETE Link")
    public void clicks_delete_link() {
        ReusableMethods.clickElementByJS(pageAdmin_ticketPriority.buttonDDMSelect_DELETE);
    }
    @Then("Clicks DELETE button")
    public void clicks_delete_button() {
        ReusableMethods.clickElementByJS(pageAdmin_ticketPriority.buttonUPDATE_PageDEdit_DDMSelect);
    }
    @Then("Verify that Priority can be deleted")
    public void verify_that_priority_can_be_deleted() {
        ReusableMethods.wait(2);
        CompToastMessage priorityToastMessage=new CompToastMessage();
        WebElement toastmessage=ReusableMethods.waitForVisibility(priorityToastMessage.labelMessageToast,5);
        Assert.assertTrue("Deleted successfully!",toastmessage.isDisplayed());
    }
}
