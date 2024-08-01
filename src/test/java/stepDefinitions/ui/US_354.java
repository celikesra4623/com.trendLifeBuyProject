package stepDefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.admin.PageAdminSupportTicketCategory;
import pages.comp.CompToastMessage;
import utilities.ReusableMethods;

public class US_354 {

    Faker faker = new Faker();


    PageAdminSupportTicketCategory pageAdminSupportTicketCategory = new PageAdminSupportTicketCategory();

    @Then("The User clicks Category Link")
    public void theUserClicksCategoryLink() {
        ReusableMethods.clickElementByJS(pageAdminSupportTicketCategory.linkCategory);


    }

    @Then("The User verify that text of Add New is visible")
    public void theUserVerifyThatTextOfCategoryListIsVisible() {
        Assert.assertTrue(pageAdminSupportTicketCategory.textAddNew.isDisplayed());
    }

    @And("The user sends any text on name field")
    public void theUserSendsAnyTextOnNameField() {
        pageAdminSupportTicketCategory.fieldName.sendKeys(faker.name().title());
    }

    @And("The user clicks on inactive button")
    public void theuserclicksoninactivebutton() {
        pageAdminSupportTicketCategory.buttonInactive.click();
    }


    @Then("The user clicks on save button")
    public void theUserClicksOnSaveButton() {
        pageAdminSupportTicketCategory.buttonSave.click();
    }


    @Given("Verify that the toast message which state that new category created is visible")
    public void verifyThatTheToastMessageWhichStateThatNewCategoryCreatedIsVisible() {
        ReusableMethods.waitForVisibility(new CompToastMessage().labelMessageToast, 20);
        String expectedText = "Created successfully!";
        Assert.assertEquals(expectedText, new CompToastMessage().labelMessageToast.getText());
    }

    @Then("Verify that Name, Status and Action titles are visible")
    public void verifyThatNameStatusAndActionTitlesAreVisible() {
        Assert.assertTrue(pageAdminSupportTicketCategory.titleAction.isDisplayed());
        Assert.assertTrue(pageAdminSupportTicketCategory.titleName.isDisplayed());
        Assert.assertTrue(pageAdminSupportTicketCategory.titleStatus.isDisplayed());
    }

    @Then("Verify that statu of any title under the Status title is changeable")
    public void verifyThatStatuOfAnyTitleUnderTheStatusTitleIsChangeable() {
        pageAdminSupportTicketCategory.slideBar.click();
        ReusableMethods.waitForVisibility(new CompToastMessage().labelMessageToast, 20);
        String expectedText = "Updated successfully!";
        Assert.assertEquals(expectedText, new CompToastMessage().labelMessageToast.getText());
    }

    @Then("The user clicks on Select button")
    public void theUserClicksOnSelectButton() {
        pageAdminSupportTicketCategory.buttonSelect.click();
    }

    @Then("Verify that Edit and Delete texts are visible")
    public void verifyThatEditAndDeleteTextsAreVisible() {
        Assert.assertTrue(pageAdminSupportTicketCategory.textDelete.isDisplayed());
        Assert.assertTrue(pageAdminSupportTicketCategory.textEdit.isDisplayed());
    }

    @And("The user click on Edit link")
    public void theUserClickOnEditLink() {
        pageAdminSupportTicketCategory.textEdit.click();
    }

    @Then("Verify that Edit text is visible")
    public void verifyThatEditTextIsVisible() {
        Assert.assertTrue(pageAdminSupportTicketCategory.visibleEdit.isDisplayed());
    }

    @Then("Clicks on Update Button")
    public void clicksOnUpdateButton() {
        ReusableMethods.clickElementByJS(pageAdminSupportTicketCategory.buttonUpdate);

    }

    @And("Verify that the category in question is updated")
    public void verifyThatTheCategoryInQuestionIsUpdated() {
        ReusableMethods.waitForVisibility(new CompToastMessage().labelMessageToast, 20);
        String expectedText = "Updated successfully!";
        Assert.assertEquals(expectedText, new CompToastMessage().labelMessageToast.getText());
    }

    @Then("The user clicks on Delete button")
    public void theUserClicksOnDeleteButton() {
        pageAdminSupportTicketCategory.buttonDelete.click();
    }

    @And("The user clicks on sure Delete button")
    public void theUserClicksOnSureDeleteButton() {
        pageAdminSupportTicketCategory.sureDelete.click();
    }

    @Then("Verify that the category in question is deleted succesfully")
    public void verifyThatTheCategoryInQuestionIsDeletedSuccesfully() {
        ReusableMethods.waitForVisibility(new CompToastMessage().labelMessageToast, 20);
        String expectedText = "Deleted successfully!";
        Assert.assertEquals(expectedText, new CompToastMessage().labelMessageToast.getText());
    }

    @Then("The user clicks Support Tickets")
    public void theUserClicksSupportTickets() {
        pageAdminSupportTicketCategory.linkSupportTicket.click();
    }


}
