package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.admin.PageContactRequest;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;

import java.util.ArrayList;
import java.util.List;

public class US_054_PageContactRequest {

    static PageContactRequest pageContactRequest = new PageContactRequest();
    static String dataMessage;
    static String newDataMessage;
    static String changedData;
    static String nameText;
    static String emailText;
    static String messageText;

    @When("Click Contact Request link")
    public static void click_contact_request_link() {
        ReusableMethods.clickElementByJS(pageContactRequest.linkContactRequest);
    }

    @Then("Click Contact Mail link")
    public void click_contact_mail_link() {

        ReusableMethods.clickElementByJS(pageContactRequest.linkContactMail);
    }

    @Then("Verify that the Contact Mail page is accessible")
    public void verify_that_the_contact_mail_page_is_accessible() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = URLReader.getUrl("url.admin.contact-request.contact");
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("Verify that the Contact Mail List is visible on the Contact Mail page")
    public void verifyThatTheContactMailListIsVisibleOnTheContactMailPage() {
        Assert.assertTrue(pageContactRequest.rowListContactMail.size() > 0);
    }

    @And("Verify that the messages are listed under Name , Email, Message in the Contact Mail List.")
    public void verifyThatTheMessagesAreListedUnderNameEmailMessageInTheContactMailList() {

        List<String> columnList = new ArrayList<String>();

        for (int i = 0; i < pageContactRequest.columnListContactMail.size(); i++) {
            columnList.add((pageContactRequest.columnListContactMail.get(i)).getText());

        }
        boolean result = false;
        if (columnList.get(1).equalsIgnoreCase("NAME") &&
                columnList.get(2).equalsIgnoreCase("EMAIL") &&
                columnList.get(3).equalsIgnoreCase("MESSAGE")) {
            result = true;
        }
        Assert.assertTrue(result);
    }

    @And("Verify that the order of the information appearing in the List is changed when the Contact Mail List headers are clicked.")
    public void verifyThatTheOrderOfTheInformationAppearingInTheListIsChangedWhenTheContactMailListHeadersAreClicked() {

        String firstData = pageContactRequest.dataforDelete.getText();
        int flag = 0;

        for (WebElement webelement : pageContactRequest.columnListContactMail
        ) {
            webelement.click();
            ReusableMethods.wait(1);
            changedData = pageContactRequest.dataforDelete.getText();
            ReusableMethods.wait(1);

            if (!(firstData.equals(changedData))) {
                flag++;
            }
            changedData = "";

        }
        Assert.assertTrue(flag > 1);

    }

    @And("Click Quick Search Box button")
    public void clickQuickSearchBoxButton() {
        pageContactRequest.fieldQuickSearchBox.sendKeys("deneme" + Keys.ENTER);

    }

    @And("Verify that it is possible to do searching in the Contact Mail List with the Quick Search Box.")
    public void verifyThatItIsPossibleToDoSearchingInTheContactMailListWithTheQuickSearchBox() {

        List<String> dataList = new ArrayList<String>();
        for (int i = 0; i < pageContactRequest.dataListContactMail.size(); i++) {
            dataList.add((pageContactRequest.dataListContactMail.get(i)).getText());
        }

        boolean result = false;
        for (String webElementText : dataList
        ) {

            if (webElementText.contains("deneme")) {
                result = true;
                break;
            }

        }
        Assert.assertTrue(result);

    }

    @And("Click Select button")
    public void clickSelectButton() {
        pageContactRequest.buttonSelect.click();

    }

    @And("Verify that Show and Delete links are visible in the Select tab under the Action title.")
    public void verifyThatShowAndDeleteLinksAreVisibleInTheSelectTabUnderTheActionTitle() {
        String textDelete = pageContactRequest.linkDelete.getText();
        String textShow = pageContactRequest.linkShow.getText();

        boolean result = false;
        if (textDelete.equalsIgnoreCase("delete") &&
                textShow.equalsIgnoreCase("show")) {
            result = true;
        }
        Assert.assertTrue(result);

    }

    @And("Click Show link")
    public void clickShowLink() {
        pageContactRequest.linkShow.click();

    }

    @And("Verify that when the Show link is clicked on the Select tab under the Action title, it redirects to the Contact Mail page and the details of the relevant mail appear on the Contact Mail page.")
    public void verifyThatWhenTheShowLinkIsClickedOnTheSelectTabUnderTheActionTitleItRedirectsToTheContactMailPageAndTheDetailsOfTheRelevantMailAppearOnTheContactMailPage() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = URLReader.getUrl("url.admin.contact-request.contact");
        boolean result = false;
        if (actualUrl.contains(expectedUrl) &&
                pageContactRequest.detailsMessage.getText().contains(messageText) &&
                pageContactRequest.detailsEmail.getText().contains(emailText) &&
                pageContactRequest.detailsName.getText().contains(nameText)) {

            result = true;
        }

        Assert.assertTrue(result);

    }

    @And("It should be verified that the relevant mail can be deleted from the window that opens when the Delete link is clicked on the Select tab under the Action title.")
    public void itShouldBeVerifiedThatTheRelevantMailCanBeDeletedFromTheWindowThatOpensWhenTheDeleteLinkIsClickedOnTheSelectTabUnderTheActionTitle() {

        ReusableMethods.clickElementByJS(pageContactRequest.linkDelete);
        pageContactRequest.buttonDataDelete.click();
        newDataMessage = pageContactRequest.dataforDelete.getText();

        Assert.assertNotEquals(dataMessage, newDataMessage);

    }

    @And("Get text")
    public void getText() {

        String dataMessage = pageContactRequest.dataforDelete.getText();
    }

    @And("Get message text")
    public void getMessageText() {

        nameText = pageContactRequest.textName.getText();
        emailText = pageContactRequest.textEmail.getText();
        messageText = pageContactRequest.textMessage.getText();

    }
}
