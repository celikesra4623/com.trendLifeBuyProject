package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.admin.PageAdminLogin;
import pages.admin.PageAdmin_ProductList;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utilities.ReusableMethods.waitForVisibility;

public class US_034ProductListSD {



    PageAdminLogin adminLoginPage = new PageAdminLogin();
    PageAdmin_ProductList pageAdmin_productList = new PageAdmin_ProductList();


    @When("Admin clicks Products dropdown menu")
    public void admin_clicks_products_dropdown_menu() {
        waitForVisibility(pageAdmin_productList.dropDownProdocts,5);
        pageAdmin_productList.dropDownProdocts.click();
    }

    @Then("Admin sees Product List of the Products dropdown menu")
    public void admin_sees_product_list_of_the_products_dropdown_menu() {
        pageAdmin_productList.linkDDMProdocts_ProductsList.isDisplayed();
        ReusableMethods.wait(5);
    }
    /***@US_246***/


    @Then("Admin clicks Product List link in the Products dropdown menu")
    public void admin_clicks_product_list_link_in_the_products_dropdown_menu() {
        pageAdmin_productList.linkDDMProdocts_ProductsList.click();
        ReusableMethods.wait(5);
    }

    @Then("Admin sees list items in headings of Product List link")
    public void admin_sees_list_items_in_headings_of_product_list_link() {
        pageAdmin_productList.listHeaderProductList.isDisplayed();
        pageAdmin_productList.listHeaderAlertList.isDisplayed();
        pageAdmin_productList.listHeaderOutOfStockList.isDisplayed();
        pageAdmin_productList.listHeaderDisabledProductList.isDisplayed();
        pageAdmin_productList.listHeaderProductBySKUList.isDisplayed();
    }

    @Then("Admin clicks table list in the header")
    public void Admin_clicks_table_list_in_the_headers() {
        for (int i = 0; i < pageAdmin_productList.headerList().size(); i++) {
            pageAdmin_productList.headerList().get(i).click();
            ReusableMethods.wait(1);
        }

    }

    @And("Verify that they go to the relevant page in list item headings")
    public List<WebElement> verify_that_they_go_to_the_relevant_page_in_list_item_headings() {
        ReusableMethods.wait(5);
        List<WebElement> headerListItems = new ArrayList<>();
        headerListItems.add(0, pageAdmin_productList.listHeaderProductList);
        headerListItems.add(1, pageAdmin_productList.listHeaderAlertList);
        headerListItems.add(2, pageAdmin_productList.listHeaderOutOfStockList);
        headerListItems.add(3, pageAdmin_productList.listHeaderDisabledProductList);
        headerListItems.add(4, pageAdmin_productList.listHeaderProductBySKUList);

        List<String> expListItem = Arrays.asList("Product List", "Alert List",
                "Out Of Stock List", "Disabled Product List", "Product By SKU");

        for (int i = 0; i < expListItem.size(); i++) {
            Assert.assertTrue(expListItem.get(i).equalsIgnoreCase(headerListItems.get(i).getText()));
        }
        return headerListItems;
    }
    /***@US_247***/


    @Then("Verify that the products are listed under the headings")
    public void verify_that_the_products_are_listed_under_the_headings() {
        pageAdmin_productList.listHeaderProductList.click();
        String actInfo=pageAdmin_productList.dataTableResultInfo.getText();
        String expInfo="0";

        Assert.assertTrue("Products cannot be listed",expInfo.contains(actInfo));
    }
    /***@US_248***/


    @Then("Click on the QUICK SEARCH")
    public void click_on_the_quick_search() {
        pageAdmin_productList.fieldQuickSearch.click();
    }
    @Then("Enter the text to be searched in the Quick Search TextBox and press the ENTER key.")
    public void enter_the_text_to_be_searched_in_the_quick_search_text_box_and_press_the_enter_key() {
        String searchKey="watch";
        pageAdmin_productList.fieldQuickSearch.sendKeys(searchKey + Keys.ENTER);

    }
    @Then("Verify that The products is searchable in the Quick Search TextBox")
    public void verify_that_the_products_is_searchable_in_the_quick_search_text_box() {
        List<WebElement> searchElement=Driver.getDriver().findElements(By.xpath("//tr[contains(text(),'watch')]"));
        for (WebElement each: searchElement) {
            String actSearchText=each.getText();
            System.out.println("searchText = " + actSearchText);
            String expSearchText="watch";
            Assert.assertTrue("Failed to search in textbox",actSearchText.contains(expSearchText));
        }
    }
    /***@US_249***/


    @Then("Click the checkbox in the Status column in the Product List")
    public void click_the_checkbox_in_the_status_column_in_the_product_list() {
        pageAdmin_productList.checkboxStatusColumFirstProduct.click();
    }
    @Then("Check the toast message that it visible Updated successfully!")
    public void check_the_toast_message_that_it_visible_updated_successfully() {
        String alertText="";
        alertText= ConfigReader.getProperty("message");
        System.out.println("alertText = " + alertText);
        String actAlertText=alertText;
        String expAlertText="Updated successfully!";
        waitForVisibility(pageAdmin_productList.toastMessage,5);
        Assert.assertTrue(actAlertText.contains(expAlertText));

    }
    /***@US_250***/



    @Then("Click the SELECT in the ACTION column in the Product List.")
    public void click_the_select_in_the_action_column_in_the_product_list() {
        pageAdmin_productList.buttonSelect.click();
        ReusableMethods.wait(5);

    }
    @Then("Click the VIEW link in the SELECT button")
    public void click_the_view_link_in_the_select_button() {
        pageAdmin_productList.ddmSelect_View.click();
        ReusableMethods.wait(5);

    }
    @Then("Verify that VIEW page is visible and displays the product when clicked")
    public void verify_that_view_page_is_visible_and_displays_the_product_when_clicked() {
        pageAdmin_productList.ddmSelect_View.isDisplayed();
        String expViewProductTitle="Exclusive Bag 1 Details";
        String actViewProductTitle=pageAdmin_productList.viewProductTitle.getText();
        //System.out.println("actViewProductTitle = " + actViewProductTitle);
        Assert.assertEquals("View page cannot be displayed",expViewProductTitle,actViewProductTitle);
        ReusableMethods.wait(5);
    }
    /***@US_251***/

    @Then("Click the EDIT link in the SELECT button")
    public void click_the_edit_link_in_the_select_button() {
        pageAdmin_productList.ddmSelect_Edit.isDisplayed();
        pageAdmin_productList.ddmSelect_Edit.click();
        ReusableMethods.wait(1);
    }
    @Then("Verify that EDIT page is visible and displays the product when clicked")
    public void verify_that_edit_page_is_visible_and_displays_the_product_when_clicked() {

        String expEditPage=ConfigReader.getProperty("editFileCurrentURL");
        String actEditPage=Driver.getDriver().getCurrentUrl();
        //System.out.println("actEditPage = " + actEditPage);
        Assert.assertEquals("Edit page cannot be displayed",actEditPage,expEditPage);
    }
    /***@US_252***/



}