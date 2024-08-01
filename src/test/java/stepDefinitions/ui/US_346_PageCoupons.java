package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.admin.PageAdminCoupons;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_346_PageCoupons {

    String titleCoupon = "Coupon2";
    String couponCode = "C_02";

    PageAdminCoupons pageAdminCoupons = new PageAdminCoupons();

    Actions actions = new Actions(Driver.getDriver());

    @When("The User clicks the Save button")
    public void theUserClicksTheSaveButton() {
        pageAdminCoupons.buttonSave.click();
    }

    @Then("The user sees the text of Select Coupon Type First the Creat Coupon Table")
    public void theUserSeesTheTextOfSelectCouponTypeFirstTheCreatCouponTable() {
        Assert.assertTrue(pageAdminCoupons.labelSelectCouponTypeFirst.isDisplayed());
    }

    @When("The User clicks the Select dropdown to create a coupon")
    public void theUserClicksTheSelectDropdownToCreateACoupon() {
        //ReusableMethods.selectAnItemFromDropdown(pageAdminCoupons.buttonSelect,"Product Base");
        pageAdminCoupons.buttonSelect.click();
    }

    @Then("The user clicks the Product Base")
    public void TheUserClicksTheProductBase() {
        pageAdminCoupons.buttonProductBase.click();
    }

    @When("The user clicks the Coupon Code")
    public void theUserClicksTheCouponCode() {
        pageAdminCoupons.fieldcouponCode.click();
    }

    @When("The user enters the Coupon Code")
    public void theUserEntersTheCouponCode() {
        ReusableMethods.wait(3);
        pageAdminCoupons.fieldcouponCode.sendKeys(couponCode);
    }

    @When("The user clicks the Products field")
    public void theUserClicksTheProductsField() {
        ReusableMethods.wait(3);
        pageAdminCoupons.fieldProducts.click();
    }

    @Then("The user selects a product and clicks")
    public void theUserSelectsAProductAndClicks() {
        pageAdminCoupons.labelExclusiveWatch1.click();
    }

    @When("The user clicks the Date field")
    public void theUserClicksTheDateField() {
        pageAdminCoupons.fieldDate.click();
    }

    @Then("The user selects today date as first date and clicks")
    public void theUserSelectsTodayDateAsFirstDateAndClicks() {
        ReusableMethods.clickElementByJS(pageAdminCoupons.dateTodayWeekendFirst);
        //pageAdminCoupons.dateTodayFirst.click();
    }

    @Then("The user selects second date and clicks")
    public void theUserSelectsSecondDateAndClicks() {
        ReusableMethods.wait(5);
        pageAdminCoupons.dateSecond1.click();
    }

    @And("The use clicks Apply button")
    public void theUseClicksApplyButton() {
        pageAdminCoupons.buttonApplyDate.click();
    }

    @When("The users clicks the Discount field")
    public void theUsersClicksTheDiscountField() {
        ReusableMethods.clickElementByJS(pageAdminCoupons.fieldDiscount);
        //pageAdminCoupons.fieldDiscount.click();
    }

    @Then("The user enters the Amount of discount")
    public void theUserEntersTheAmountOfDiscount() {
        pageAdminCoupons.fieldDiscount.sendKeys("10");
    }

    @When("The user clicks the Discount Type field")
    public void theUserClicksTheDiscountTypeField() {
        ReusableMethods.clickElementByJS(pageAdminCoupons.fieldDiscountType);
        //pageAdminCoupons.fieldDiscountType.click();
    }

    @Then("The user clicks the Amount or Percentage button")
    public void theUserClicksTheAmountOrPercentageButton() {
        pageAdminCoupons.buttonPercentage.click();
    }

    @Then("The user clicks the Save button again")
    public void theUserClicksTheSaveButtonAgain() {
        pageAdminCoupons.buttonSave.click();
    }

    @And("The user sees the text of The coupon title field is required")
    public void theUserSeesTheTextOfTheCouponTitleFieldIsRequired() {
        Assert.assertTrue(pageAdminCoupons.labelTheCouponTitleFieldIsRequired.isDisplayed());
    }

    @When("The users clicks the Title")
    public void theUsersClicksTheTitle() {
        ReusableMethods.clickElementByJS(pageAdminCoupons.fieldTitle);
        //pageAdminCoupons.fieldTitle.click();
    }

    @And("The users enters title")
    public void theUsersEntersTitle() {
        pageAdminCoupons.fieldTitle.sendKeys(titleCoupon);
    }

    @And("The users sees on the coupon list table.")
    public void theUsersSeesOnTheCouponListTable() {
        ReusableMethods.wait(2);
        //((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(false);", pageAdminCoupons.buttonLastPagination);
        ReusableMethods.clickWithJS(pageAdminCoupons.buttonLastPagination);
        ReusableMethods.wait(2);
        List<WebElement> dataList = pageAdminCoupons.rowCouponLastDataList;
        Assert.assertEquals(couponCode, dataList.get(2).getText());
        Assert.assertEquals(titleCoupon, dataList.get(1).getText());
    }

    @Then("Verify that SL title of the Coupon List table are visible")
    public void verifyThatSLTitleOfTheCouponListTableAreVisible() {
        boolean isDisplayed1 = pageAdminCoupons.rowSLCouponListTable.isDisplayed();
        Assert.assertTrue(isDisplayed1);
    }

    @Then("Verify that TITLE title of the Coupon List table are visible")
    public void verifyThatTITLETitleOfTheCouponListTableAreVisible() {
        boolean isDisplayed2 = pageAdminCoupons.rowTitleCouponListTable.isDisplayed();
        Assert.assertTrue(isDisplayed2);
    }

    @Then("Verify that CODE title of the Coupon List table are visible")
    public void verifyThatCODETitleOfTheCouponListTableAreVisible() {
        boolean isDisplayed3 = pageAdminCoupons.rowCodeCouponListTable.isDisplayed();
        Assert.assertTrue(isDisplayed3);
    }

    @Then("Verify that TYPE title of the Coupon List table are visible")
    public void verifyThatTYPETitleOfTheCouponListTableAreVisible() {
        boolean isDisplayed4 = pageAdminCoupons.rowTypeCouponListTable.isDisplayed();
        Assert.assertTrue(isDisplayed4);
    }

    @Then("Verify that START DATE title of the Coupon List table are visible")
    public void verifyThatSTARTDATETitleOfTheCouponListTableAreVisible() {
        boolean isDisplayed5 = pageAdminCoupons.rowStartDateCouponListTable.isDisplayed();
        Assert.assertTrue(isDisplayed5);
    }

    @And("Click the plus sign")
    public void clickThePlusSign() {
        pageAdminCoupons.rowPlusSignCouponListTable.click();
    }

    @Then("Verify that END DATE title of the Coupon List table are visible")
    public void verifyThatENDDATETitleOfTheCouponListTableAreVisible() {
        ReusableMethods.wait(3);
        boolean isDisplayed6 = pageAdminCoupons.rowEndDateCouponListTable.isDisplayed();
        Assert.assertTrue(isDisplayed6);
    }

    @Then("Verify that ACTION title of the Coupon List table are visible")
    public void verifyThatACTIONTitleOfTheCouponListTableAreVisible() {
        boolean isDisplayed7 = pageAdminCoupons.rowActionCouponListTable1.isDisplayed();
        ReusableMethods.wait(2);
        Assert.assertTrue(isDisplayed7);
    }

    @And("Verify that first row of the table has its values on the Coupon List table")
    public void verifyThatFirstRowOfTheTableHasItsValuesOnTheCouponListTable() {

        //List<WebElement> listTableTitle = pageAdminCoupons.titleHeadListCouponListTable;
        List<String> expectedTitles = new ArrayList<>(Arrays.asList("SL", "TITLE", "CODE", "TYPE", "START DATE"));
        List<String> actualTitles = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String text = Driver.getDriver().findElement(By.xpath("//*[@id='couponTable']/thead/tr/th[" + i + "]")).getText();
            System.out.println(text);
            actualTitles.add(text);
        }
        //Map<String, WebElement> elementsText = ReusableMethods.getMapTextAndElement(listTableTitle);
        Assert.assertEquals(expectedTitles, actualTitles);

        ReusableMethods.clickElementByJS(pageAdminCoupons.buttonplussignfirstrow);

        List<String> expectedLastTwo = new ArrayList<>(Arrays.asList("END DATE", "ACTION"));
        for (int i = 0; i < 2; i++) {
            String titleSonIki = pageAdminCoupons.titleEndDateActionCouponListTable.get(i).getText();
            System.out.println(titleSonIki);
            Assert.assertEquals(expectedLastTwo.get(i), titleSonIki);
        }
    }

    @When("Click the plus sign{int}")
    public void clickThePlusSign(int arg0) {
        ReusableMethods.wait(2);
        pageAdminCoupons.rowPlusSignCouponListTable8.click();
    }

    @Then("The user clicks the select button")
    public void theUserClicksTheSelectButton() {
        ReusableMethods.wait(3);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(pageAdminCoupons.buttonSelectEighthCoupon);

    }

    @Then("The user clicks the edit button")
    public void theUserClicksTheEditButton() {
        pageAdminCoupons.buttonEditEighthCoupon.click();
    }

    @And("The user sees the creat coupon title has changed to the edit coupon")
    public void theUserSeesTheCreatCouponTitleHasChangedToTheEditCoupon() {
        Assert.assertTrue(pageAdminCoupons.labelEditCoupon.isDisplayed());
    }

    @Then("The user deletes the title for edit")
    public void theUserDeletesTheTitleForEdit() {
        pageAdminCoupons.fieldTitle.clear();
    }

    @Then("The users enters the new title")
    public void theUsersEntersTheNewTitle() {
        pageAdminCoupons.fieldTitle.sendKeys("Coupon2");
    }

    @And("The user clicks the Update button")
    public void theUserClicksTheUpdateButton() {
        ReusableMethods.clickElementByJS(pageAdminCoupons.buttonUpdate);
        //pageAdminCoupons.buttonUpdate.click();
    }

    @And("The user sees that the title has been edited")
    public void theUserSeesThatTheTitleHasBeenEdited() {
        String oldTitle = "Coupon1";
        String newTitle = pageAdminCoupons.fieldTitle.getText();
        Assert.assertNotEquals(oldTitle, newTitle);
    }

    @Then("The user clicks the select{int} button")
    public void theUserClicksTheSelectButton(int arg0) {
        pageAdminCoupons.buttonSelectEighthCoupon.click();
    }

    @Then("The user clicks the delete button")
    public void theUserClicksTheDeleteButton() {
        pageAdminCoupons.buttonDeleteTwelfth.click();
    }


    @When("The user goes to the second page")
    public void theUserGoesToTheSecondPage() {
        actions.sendKeys(Keys.END).perform();
        pageAdminCoupons.button2Page.click();
    }

    @Then("The user verifies that the text {string} is display")
    public void theUserVerifiesThatTheTextIsDisplay(String arg0) {
        Assert.assertTrue(pageAdminCoupons.textOfTheShowing11To11Of11Entries.isDisplayed());
    }

    @Then("The user click the twelfth plus sign")
    public void theUserClickTheTwelfthPlusSign() {
        ReusableMethods.wait(2);
        pageAdminCoupons.buttonPlusSignTwelfth.click();
    }

    @When("The user clicks the delete-twelfth button")
    public void theUserClicksTheDeleteTwelfthButton() {
        ReusableMethods.wait(2);
        ReusableMethods.clickElementByJS(pageAdminCoupons.buttonDeleteTwelfth);
        //pageAdminCoupons.buttonDeleteTwelfth.click();
    }

    @Then("The user clicks the delete button again in the pop-up window")
    public void theUserClicksTheDeleteButtonAgainInThePopUpWindow() {
        pageAdminCoupons.buttonDeleteOpenedWindow.click();
    }


    @Then("The user sees second time the text of the Showing {string} entries")
    public void theUserSeesSecondTimeTheTextOfTheShowingEntries(String arg0) {
        pageAdminCoupons.textOfTheShowing11To11Of11Entries.isDisplayed();
    }

    @Then("The user clicks the select-twelfth button")
    public void theUserClicksTheSelecttwelfthButton() {
        ReusableMethods.wait(2);
        ReusableMethods.clickElementByJS(pageAdminCoupons.buttonSelectTwelfth);
        //pageAdminCoupons.buttonSelectTwelfth.click();
    }

    @Then("The user sees the text of the Showing {string} entries")
    public void theUserSeesTheTextOfTheShowingEntries(String arg0) {
        pageAdminCoupons.textOfTheShowing11To12Of12Entries.isDisplayed();
    }
}