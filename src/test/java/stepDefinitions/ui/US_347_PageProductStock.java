package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.admin.PageProductStock;
import utilities.ReusableMethods;

public class US_347_PageProductStock {
    PageProductStock pageProductStock = new PageProductStock();

    @And("Verifies that the user has the type text above the search bar")
    public void verifiesThatTheUserHasTheTypeTextAboveTheSearchBar() {
        ReusableMethods.wait(3);
        Assert.assertTrue(pageProductStock.labelType.isDisplayed());
    }

    @And("Verifies that you see select All Product List text in the search bar")
    public void verifiesThatYouSeeSelectAllProductListTextInTheSearchBar() {
        Assert.assertTrue(pageProductStock.buttonCurrentAllProductListType.isDisplayed());
        //String extpectedText="All Product List";
        //String actualText=pageProductStock.buttonCurrentAllProductListType.getText();
        //Assert.assertEquals(extpectedText,actualText);
    }

    @When("The user clicks the Type button")
    public void theUserClicksTheTypeButton() {
        pageProductStock.buttonType.click();
    }

    @Then("The user clicks the All Product List button")
    public void theUserClicksTheAllProductListButton() {
        pageProductStock.buttonAllProductList.click();
    }

    @Then("The user clicks the search button")
    public void theUserClicksTheSearchButton() {
        ReusableMethods.clickElementByJS(pageProductStock.buttonSearch);
    }

    @And("Verifies that the stock list of the selected products is displayed")
    public void verifiesThatTheStockListOfTheSelectedProductsIsDisplayed() {
        Assert.assertTrue(pageProductStock.labelProductStockAll.isDisplayed());
    }

    @Then("The user enters the Physical Product as a type in the search bar")
    public void theUserEntersThePhysicalProductAsATypeInTheSearchBar() {
        String physicalProduct = "Physical Product";
        pageProductStock.fieldSearch.sendKeys(physicalProduct);
    }

    @Then("The user clicks the Select One button")
    public void theUserClicksTheSelectOneButton() {
        ReusableMethods.clickElementByJS(pageProductStock.buttonSelectOne);
        //pageProductStock.buttonSelectOne.click();
    }

    @And("Verifies that you see select one text in the search bar")
    public void verifiesThatYouSeeSelectOneTextInTheSearchBar() {
        Assert.assertTrue(pageProductStock.buttonCurrentSelectOneType.isDisplayed());
        //String extpectedText="Select One";
        //String actualText=pageProductStock.buttonCurrentSelectOneType.getText();
        //Assert.assertEquals(extpectedText,actualText);}
    }

    @And("Verifies that the stock list of the selected products is displayed for select one")
    public void verifiesThatTheStockListOfTheSelectedProductsIsDisplayedForSelectOne() {
        Assert.assertEquals(pageProductStock.DigitalProduct, pageProductStock);
    }
}